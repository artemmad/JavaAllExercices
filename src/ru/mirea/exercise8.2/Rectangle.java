public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle(double width, double length){
        setLength(length);
        setWidth(width);
    }

    Rectangle(double width, double length, String color,boolean filled){
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    Rectangle(){}

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimetr() {
        return 4*width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
