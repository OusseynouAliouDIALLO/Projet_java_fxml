package ism.gestion.controllers;

import java.io.IOException;

import ism.gestion.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class AccueilleController {

    @FXML
    AnchorPane anchorContent;

    @FXML
    void handleLoadViewAccueille(ActionEvent event) throws IOException {
        App.setRoot("accueille");
    }

    @FXML
    void handleDeconnexion(ActionEvent event) throws IOException {
        App.setRoot("connexion");
    }

    @FXML
    void handleLoadViewClasse(ActionEvent event) throws IOException {
        loadView("classe");
    }

    @FXML
    void handleLoadViewEtudiant(ActionEvent event) throws IOException {
       loadView("etudiant");
    }

    @FXML
    void handleLoadViewProfesseur(ActionEvent event) throws IOException {
       loadView("professeur");
    }

    void loadView(String fxml) throws IOException{
        AnchorPane root= (AnchorPane) App.loadFXML(fxml);
        anchorContent.getChildren().clear();
        anchorContent.getChildren().add(root);
    }

}
