import java.awt.geom.Point2D;

public abstract class Figure {
    protected Point2D polar1;
    protected Point2D polar2;

    public Figure(Point2D polar1, Point2D polar2) {
        this.polar1 = polar1;
        this.polar2 = polar2;
    }

    public Figure(double x1, double y1, double x2, double y2) {
        this(new Point2D.Double(x1, y1), new Point2D.Double(x2, y2));
    }

    public double getWidth() {
        return Math.abs(polar2.getX() - polar1.getX());
    }

    public double getHeight() {
        return Math.abs(polar2.getY() - polar1.getY());
    }

    public double getSquare() {
        return getWidth() * getHeight();
    }

    public void printAll() {
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
        System.out.println("Square: " + getSquare());
    }

    public abstract void draw();

    public abstract double getContour();
}

interface Drawable {
    void draw();
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

}
