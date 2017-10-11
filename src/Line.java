public class Line {
    Point p1;
    Point p2;
    javafx.scene.shape.Line lineFx;


    public double calcLength() {
        return  p1.calcLength(p2);
    }
    public Point getPointOnLine(float percent){
        Point dir = p2.minus(p1);
        Point norm = dir.normalize();
        double length = p1.calcLength(p2);
        return p1.plus(norm.multiply(length*percent)) ;

    }

}
