package superPack;


import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Z z = new Z();
        int k =Runtime.getRuntime().availableProcessors();
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(int i=0;i<k;i++) {
            Thread thread = new Thread(z);
            thread.setName(String.valueOf(i));
            threads.add(thread);
        }
        for (Thread thread : threads){
            thread.start();
        }
    }
}
