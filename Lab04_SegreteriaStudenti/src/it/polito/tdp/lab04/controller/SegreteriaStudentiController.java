package it.polito.tdp.lab04.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SegreteriaStudentiController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> corsi;

    @FXML
    private Button btnCercaIscritti;

    @FXML
    private TextField txtMatricola;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCognome;

    @FXML
    private Button btnCercaCorsi;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnAuto;

    @FXML
    void handleCercaCorsi(ActionEvent event) {

    }

    @FXML
    void handleCercaIscritti(ActionEvent event) {

    }
    
    @FXML
    void doComplete(ActionEvent event) {
    	String m = txtMatricola.getText();
    	String[] studente = model.getStudenteFromMatricola(m);
    	txtNome.appendText(studente[0]);
    	txtCognome.appendText(studente[1]);
    }

    @FXML
    void handleReset(ActionEvent event) {
    	txtResult.clear();
    	txtCognome.clear();
    	txtNome.clear();
    	txtMatricola.clear();
    }

    @FXML
    void initialize() {
        assert corsi != null : "fx:id=\"Corsi\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert btnCercaIscritti != null : "fx:id=\"btnCercaIscritti\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert txtMatricola != null : "fx:id=\"txtMatricola\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert txtCognome != null : "fx:id=\"txtCognome\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert btnCercaCorsi != null : "fx:id=\"btnCercaCorsi\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'."; 
        assert btnAuto != null : "fx:id=\"btnAuto\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
       }
    
    public void setModel(Model model) {
    	this.model = model;
    }
    
    public void inizializeComboBox() {
        List<String> nomiCorsi = model.getNomiCorsi(model.getTuttiICorsi());
        nomiCorsi.add(" ");
        corsi.getItems().addAll(nomiCorsi);
    }
}
