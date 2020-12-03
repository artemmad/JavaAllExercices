package com.company.task27_28;

import java.util.ArrayList;

public class main27_28 {
    public static void main(String[] args) {
        WorkImage workImage=new WorkImage();
        int k =Runtime.getRuntime().availableProcessors();
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(int i=0;i<k;i++) {
            Thread thread = new Thread(workImage);
            thread.setName(String.valueOf(i));
            threads.add(thread);
        }
        for (Thread thread : threads){
            thread.start();
        }
    }
}
