public class RectangleMovable extends Rectangle implements Movable {
    public RectangleMovable(Point top, Point bottom) {
        super(top, bottom);
    }

    @Override
    public void move(int x, int y) {
        Point top = this.getTop();
        Point bottom = this.getBottom();
        top.setX(top.getX() + x);
        top.setY(top.getY() + y);
        bottom.setX(bottom.getX() + x);
        bottom.setY(bottom.getY() + y);
    }
}
