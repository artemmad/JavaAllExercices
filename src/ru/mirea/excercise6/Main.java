public class Main {
    public static void main(String[] args) {
        RectangleMovable rect = new RectangleMovable(new Point(1,1), new Point(21,21));
        System.out.println(rect);
        rect.move(9, 19);
        System.out.println(rect);
    }
}
