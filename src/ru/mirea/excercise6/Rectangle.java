public class Rectangle {
    protected Point top;
    protected Point bottom;

    public Rectangle(Point a, Point b) {
        top = a;
        bottom = b;
    }

    public Point getTop() {
        return top;
    }

    public Point getBottom() {
        return bottom;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "top=" + top +
                ", bottom=" + bottom +
                '}';
    }
}
