public class Point {

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private double x, y;


    public static final Point ZERO = new Point(0, 0);


    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcLength(Point otherPoint) {


        return (Math.sqrt(Math.pow(otherPoint.x - x, 2) + Math.pow(otherPoint.y - y, 2)));
    }

    public double calcLength() {
        return calcLength(ZERO);
    }

    public Point normalize() {
        return new Point(x / calcLength(), y / calcLength());
    }

    public Point minus(Point otherPoint) {
        return new Point(x - otherPoint.x, y - otherPoint.y);
    }

    public Point multiply(double value) {
        return new Point(x * value, y * value);
    }

    public Point plus(Point otherPoint) {
        return new Point(x + otherPoint.x, y + otherPoint.y);
    }
}
