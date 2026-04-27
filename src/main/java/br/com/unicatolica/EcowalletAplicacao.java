package br.com.unicatolica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EcowalletAplicacao extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/view/VisaoPrincipal.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("EcoWallet");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}