package com.company.task6;


public class Maintask6 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(new Point6(1,1),new Point6(3,3));
        System.out.println(rectangle);
        Movable6Rectangle rectangle1=new Movable6Rectangle(new Point6(1,1),new Point6(3,3));
        rectangle1.move(1,1);
        System.out.println(rectangle1);
    }
}
