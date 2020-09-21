import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    private ArrayList<Furniture> list;
    private double balance = 1500;
    Scanner in = new Scanner(System.in);

    public FurnitureShop() {
        list = new ArrayList<Furniture>();
        list.add(new Sofa("Black", "leather", 900));
        list.add(new Chair("Red", "mahogany", 300));
        list.add(new Armchair("Gray", "leather", 400));
        list.add(new Chair("White", "birch", 150));
        list.add(new Sofa("Brown", "leatherette", 250));
        list.add(new Chair("Black", "pine wood", 200));
        list.add(new Chair("Beige", "pine wood", 200));
    }

    public void printCatalog() {
        System.out.println("Furniture Shop Catalog:");
        for(int i = 0; i < list.size(); i++) {
            Furniture f = list.get(i);
            System.out.println(String.format("%d. %s %s %s: %.1f $", i+1
                , f.getColor(), f.getMaterial() , f.getClass().getName(), f.getPrice()));
        }
        System.out.println("0. leave shop");
    }

    private int getInput() {
        try {
            return in.nextInt();
        } catch(Exception e) {
            in.nextLine();
            return -1;
        }
    }

    public void run() {
        System.out.println("Welcome to our elite furniture shop!");
        printCatalog();
        System.out.print(String.format("Your balance is %.1f $\n> ", balance));
        int option = getInput();
        while(option != 0) {
            if(option < 1 || option > list.size()) {
                System.out.println("\nInvalid input: enter catalog index or 0\n");
                printCatalog();
            } else if(balance < list.get(option-1).getPrice()) {
                System.out.println("Not enough funds!");
            } else {
                Furniture f = list.get(option-1);
                list.remove(option-1);
                balance -= f.getPrice();
                System.out.println(String.format("\nYou have bought a beautiful %s %s made of %s!\n"
                    , f.getColor(), f.getClass().getName(), f.getMaterial()));
                printCatalog();
            }
            System.out.print(String.format("Your balance: %.1f $\n> ", balance));
            option = getInput();
        }
        System.out.println("Bye!");
    }
}
