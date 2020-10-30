package ru.mirea.ATM;

import java.util.Random;

public class bankomat implements Runnable{
    private acc a;
    private boolean d = true;

    Sentenses sen=new Sentenses();
    public bankomat(acc a) {
        this.a = a;
    }

    public  void repl(double s){
        a.setBl(a.getBl()+s);
        System.out.println(Thread.currentThread().getName());
        System.out.println(sen.getSens(0)+a.getBl());
    }

    public  void widr(double s){
            if (a.getBl()<0){
                System.out.println(sen.getSens(1));
            }
            else if (a.getBl()-s<0) System.out.println(sen.getSens(1));
            else {
                a.setBl(a.getBl()-s);
                System.out.println(Thread.currentThread().getName());
                System.out.println(sen.getSens(2)+a.getBl());
            }

    }


    @Override
    public synchronized void run() {
            while (d) {
                Random random = new Random();
                try {
                    int k= random.nextInt(10000)+1;
                    if(k<0) k= (int) Math.pow(k,-1);
                    Thread.currentThread().sleep(k);
                } catch (InterruptedException e) { e.printStackTrace();}
                double n = 345129;
                int i = 0;
                i = random.nextInt(2) + 1;
                if (i == 1) widr(random.nextDouble());
                else repl(random.nextDouble());

        }
    }
}