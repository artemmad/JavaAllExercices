package chairs;

import java.util.Scanner;

public class Client implements Chair {
    private Chair chair;

    public Client() {
        System.out.println("Выберите стул:");
        System.out.println("1.Викторианский стул");
        System.out.println("2.Многофункциональный стул;");
        System.out.println("3.Магический стул");
        int i;
        Scanner scanner = new Scanner(System.in);
        i=scanner.nextInt();
        if (i==1){
            Fabrika fabrika = new VictorianChairFabrika();
            chair= fabrika.createChair();
        }
        else  if (i==2){
            Fabrika fabrika = new MultyfunctionChairFabrika();
            chair= fabrika.createChair();
        }
        else  if (i==3){
            Fabrika fabrika = new MagicChairFabrika();
            chair= fabrika.createChair();
        }
    }

    @Override
    public void sit() {
        chair.sit();
    }
}
