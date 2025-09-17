package es.telmocas;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        try{
            FXMLLoader loaded = new FXMLLoader(getClass().getResource("/fxml/flowpane12Sep.fxml"));
            Scene scene = new Scene(loaded.load(), 600, 100);

            // Comprobar que el archivo de css existe y sino mostrar una alerta
            var archivoCSS = getClass().getResource("/css/estilos.css");
            if(archivoCSS != null){
                scene.getStylesheets().add(archivoCSS.toExternalForm());
            } else{
                new Alert(Alert.AlertType.INFORMATION, "No se ha podido cargar el CSS").showAndWait();
            }

            stage.setTitle("FlowPane Alignment");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Error al intentar cargar la aplicación").showAndWait();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}