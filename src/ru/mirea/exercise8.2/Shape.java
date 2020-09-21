public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape() {};

    Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimetr();
    public abstract String toString();

}
