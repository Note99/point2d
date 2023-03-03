public class Main {
    public static void main(String[] args) {
        // Create a rectangle
        Figure rectangle = new Rectangle(0, 0, 5, 10);

        // Draw the rectangle
        rectangle.draw();

        // Print the rectangle's information
        rectangle.printAll();

        // Calculate the contour of the rectangle
        double contour = rectangle.getContour();
        System.out.println("Contour: " + contour);
    }
}
