import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GoOflineSix extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public void initPoint(Pane root){

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        initPoint(root);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
