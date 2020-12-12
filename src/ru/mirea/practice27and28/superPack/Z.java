package superPack;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Z implements Runnable {
    @Override
        public void run() { rz(Integer.parseInt(Thread.currentThread().getName())); }

      private void rz(int i) {
            int k = Runtime.getRuntime().availableProcessors();
          String o = "o";
          String sf = "~/";

            File sd = new File(sf);

            long s = System.currentTimeMillis();

            File[] fs = sd.listFiles();
            k=fs.length/k;
            try {
                if (!Files.exists(Paths.get(o))) { Files.createDirectories(Paths.get(o)); }
                for (int l=i;l<k*(i+1);l++) {
                    File f = fs[l];
                    BufferedImage ig = ImageIO.read(f);
                    if (ig == null) { continue; }
                    int wW = ig.getWidth() / 4;
                    int hH = (int) Math.round(ig.getHeight() / (ig.getWidth() / (double) wW));
                    BufferedImage iI = new BufferedImage(wW, hH, BufferedImage.TYPE_INT_RGB);

                    int h = ig.getHeight() / hH;
                    int w = ig.getWidth() / wW;

                    for (int x = 0; x < wW; x++) {
                        for (int y = 0; y < hH; y++) {
                            int g = ig.getRGB(x * w, y * h);
                            iI.setRGB(x, y, g);
                        }
                    }

                    File n = new File(o + "/" + f.getName());
                    ImageIO.write(iI, "jpg", n);
                }
            } catch (Exception e) { e.printStackTrace(); }

            System.out.println("Duration: " + (System.currentTimeMillis() - s));
        }

}
