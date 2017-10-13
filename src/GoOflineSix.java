import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GoOflineSix extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Point a = new Point(10,10);
        Point b = new Point( 250,90);
        Point c = new Point(160,160);




        Pane root = new Pane();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        Point point = new Point(5,5);
        Point point1 = new Point(400,400);
        Line line = new Line(point, point1);
        line.draw(root);
        line.clear(root);
        Fractal fractalInterface = new Fractal(5,0.15f, new Triangle (a,b,c));
        fractalInterface.draw();
        fractalInterface.draw1(root);
    }
}
