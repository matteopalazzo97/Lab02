/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	LinkedList<String> ListaAliene = new LinkedList<String>();
	LinkedList<String> ListaUmane = new LinkedList<String>();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="buttonTranslate"
    private Button buttonTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="clearButton"
    private Button clearButton; // Value injected by FXMLLoader

    @FXML // fx:id="txtDizionario"
    private TextArea txtDizionario; // Value injected by FXMLLoader

    @FXML // fx:id="txtInserimento"
    private TextField txtInserimento; // Value injected by FXMLLoader

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleTranslate(ActionEvent event) {
    	
    	txtDizionario.clear();
    	
    	//ora funziona solo per inserimento ma non per ricerca
    	//bisogna dividere la condizione di errore in null dà errore e non contiene spazio fa ricerca
    	
    	// fare controllo validità stringa s
    	String s = this.txtInserimento.getText();
    	if(!s.contains(" ") || s.equals(null)) {
    		System.out.println("Errore");
    		return;
    	}
    	
    	String[] split = s.split(" ");
    	String umana = split[1];
    	String aliena = split[0];
    	ListaUmane.add(umana);
    	ListaAliene.add(aliena);
    	this.txtDizionario.appendText( aliena + " " + umana + "\n");
    	

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert buttonTranslate != null : "fx:id=\"buttonTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtDizionario != null : "fx:id=\"txtDizionario\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtInserimento != null : "fx:id=\"txtInserimento\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
