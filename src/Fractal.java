import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Fractal {
    private int depth;
    private float percentOffset;
    Triangle initTriangle;

    private ArrayList<Triangle> triangleArrayList = new ArrayList<>();

    public Fractal(int depth, float percentOffset, Triangle initTriangle){
        this.depth=depth;
        this.percentOffset = percentOffset;
        this.initTriangle = initTriangle;

    }


    public void draw (int currentDepth, Triangle triangle, Pane root){
        if (currentDepth<depth){

            Point newA = triangle.getL1().getPointOnLine(percentOffset);
            Point newB = triangle.getL2().getPointOnLine(percentOffset);
            Point newC = triangle.getL3().getPointOnLine(percentOffset);
            Triangle newTriangle = new Triangle(newA, newB, newC);


            draw(currentDepth++, newTriangle, root);

        }
        triangleArrayList.add(triangle);
        triangle.drawTriangle(root);
    }
    public void draw1(Pane root) {
        triangleArrayList.clear();

        draw(depth, initTriangle, root);
    }
}

