import java.awt.geom.Point2D;

public class Rectangle extends Figure implements Drawable {
    public Rectangle(Point2D polar1, Point2D polar2) {
        super(polar1, polar2);
    }

    public Rectangle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }

    @Override
    public double getContour() {
        return 2 * (getWidth() + getHeight());
    }
}
