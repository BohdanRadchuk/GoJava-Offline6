import javafx.scene.layout.Pane;


public class Triangle {
    Line l1, l2, l3;

    public Line getL1() {
        return l1;
    }

    public Line getL2() {
        return l2;
    }

    public Line getL3() {
        return l3;
    }

    public Triangle(Point p1, Point p2, Point p3){
        this.l1 = new Line (p1,p2);
        this.l2 = new Line (p2,p3);
        this.l3 = new Line (p3,p1);
    }
    public void drawTriangle(Pane root){
        l1.draw(root);
        l2.draw(root);
        l3.draw(root);
    }
    public void clearTriangle(Pane root){
        l1.clear(root);
        l2.clear(root);
        l3.clear(root);
    }
}