import javafx.scene.layout.Pane;

public class Line {
    Point p1;
    Point p2;
    javafx.scene.shape.Line lineFx;

    public Line(Point p1,Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }


    public double calcLengthLine() {
        return  p1.calcLength(p2);
    }
    public Point getPointOnLine(float percent){
        Point dir = p2.minus(p1);
        Point norm = dir.normalize();
        double length = calcLengthLine();
        return p1.plus(norm.multiply(length*percent)) ;

    }
    public void draw (Pane root){
        lineFx = new javafx.scene.shape.Line(p1.getX(),p1.getY(),
                                            p2.getX(),p2.getY());
        root.getChildren().addAll(lineFx);
    }
    public void clear(Pane root){
        root.getChildren().remove(lineFx);
    }




}
