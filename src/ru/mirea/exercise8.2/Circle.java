public class Circle extends Shape {
    protected double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    Circle(){}

    Circle(double radius){
        setRadius(radius);
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimetr(){
        return 2*Math.PI*radius;
    }
}
