package ru.mirea.exercies8;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FurnitureShop shop = new FurnitureShop();
        System.out.println("Что хотите купить? 1 - chair, 2 - table, 3 - все");
        int m = in.nextInt();
            switch (m){
        case(1):
            shop.add_furn( new chair(5,"wood"));
            shop.output();
            break;
                case(2):
            shop.add_furn(new table(8,"red wood"));
            shop.output();
            break;
                case(3):
                    shop.add_furn( new chair(5,"wood"));
                    shop.add_furn(new table(8,"red wood"));
                    shop.output();
                    break;
        }




    }

}
