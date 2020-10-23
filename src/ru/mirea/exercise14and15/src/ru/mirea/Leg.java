package ru.mirea;

import javax.swing.table.TableRowSorter;

public class Leg extends Thread {

    public Leg(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                step();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void step() throws InterruptedException {
            System.out.println(this.getName());
            sleep(1);
    }
}
