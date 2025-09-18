// FlowPaneAlignment.java
package es.telmocas;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App extends Application {

    /**
     * Logger para esta clase
     */
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {


        logger.info("Starting Application");
        FlowPane fp1 = createFlowPane(Pos.BOTTOM_RIGHT);
        FlowPane fp2 = createFlowPane(Pos.BOTTOM_LEFT);
        FlowPane fp3 = createFlowPane(Pos.CENTER);
        HBox root = new HBox(fp1, fp2, fp3);
        Scene scene = new Scene(root);
        System.out.println("Va a buscar el css");

        stage.setScene(scene);

        stage.setTitle("FlowPane Alignment");
        stage.show();
    }
    private FlowPane createFlowPane(Pos alignment) {
        FlowPane fp = new FlowPane(5, 5);
        fp.setPrefSize(200, 100);
        fp.setAlignment(alignment);
        fp.getChildren().addAll(new Text(alignment.toString()),
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3"));
        fp.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        return fp;
    }
}
