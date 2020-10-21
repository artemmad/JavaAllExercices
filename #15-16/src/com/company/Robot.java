package com.company;

public class Robot extends Thread {
    private Thread step; //переменная, которая будет хранить поток; поочередно левая и правая в дальнейшем
    public synchronized void run(){
        while (true){
            step = new LeftFoot();
            step.start();
            betweenSteps();
            step = new RightFoot();
            step.start();
            betweenSteps();
        }
    }
    //метод вызывается в run(), чтобы дождаться конца текущего шага. Сделан, чтобы избежать дублирования кода
    public void betweenSteps(){
        while (!step.isInterrupted()){
            try {
                sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//потоки левой и правой ноги прерываются спустя 1 секунду (условно после того, как шаг совершен)
class LeftFoot extends Thread{
    public void run() {
        try {
            System.out.println("Left");
            Thread.sleep(1000);
            this.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class RightFoot extends Thread{
    public void run() {
        try {
            System.out.println("Right");
            Thread.sleep(1000);
            this.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
