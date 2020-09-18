package ru.mirea.exercise6;

public class Main6 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(new Point(1,1),new Point(3,3));
        System.out.println(rectangle);
        MovableRectangle rectangle1=new MovableRectangle(new Point(1,1),new Point(3,3));
        rectangle1.move(1,1);
        System.out.println(rectangle1);
    }
}
