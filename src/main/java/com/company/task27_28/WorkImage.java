package com.company.task27_28;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class WorkImage implements Runnable {
    @Override
        public void run() {
            resize(Integer.parseInt(Thread.currentThread().getName()));
        }

      private void resize(int i) {
            int k =Runtime.getRuntime().availableProcessors();
            String srcFolder = "D:/java projects/alltasks/src/ru/mirea/exercies27and28/images";
            String dstFolder = "dst";

            File srcDir = new File(srcFolder);

            long start = System.currentTimeMillis();

            File[] files = srcDir.listFiles();
            k=files.length/k;
            try {
                if (!Files.exists(Paths.get(dstFolder))) {
                    Files.createDirectories(Paths.get(dstFolder));
                }
                for (int l=i;l<k*(i+1);l++) {
                    File file = files[l];
                    BufferedImage image = ImageIO.read(file);
                    if (image == null) {
                        continue;
                    }

                    int newWidth = image.getWidth() / 4;
                    int newHeight = (int) Math.round(
                            image.getHeight() / (image.getWidth() / (double) newWidth)
                    );
                    BufferedImage newImage = new BufferedImage(
                            newWidth, newHeight, BufferedImage.TYPE_INT_RGB
                    );

                    int widthStep = image.getWidth() / newWidth;
                    int heightStep = image.getHeight() / newHeight;

                    for (int x = 0; x < newWidth; x++) {
                        for (int y = 0; y < newHeight; y++) {
                            int rgb = image.getRGB(x * widthStep, y * heightStep);
                            newImage.setRGB(x, y, rgb);
                        }
                    }

                    File newFile = new File(dstFolder + "/" + file.getName());
                    ImageIO.write(newImage, "jpg", newFile);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("Duration: " + (System.currentTimeMillis() - start));
        }


}
