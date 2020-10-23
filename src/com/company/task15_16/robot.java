package com.company.task15_16;

public class robot{
    private Thread right;
    private Thread left;
    public robot() {
        right=new Thread("right");
        left=new Thread("left");
    }
    public void step() throws InterruptedException {
        int k=0;
        while (true) {
            k++;
            this.left.sleep(1000);
            System.out.println(this.left.getName());
            this.right.sleep(1000);
            System.out.println(this.right.getName());
            if (k==15) break;
        }
    }
}
