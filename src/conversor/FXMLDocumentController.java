/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package conversor;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author evandro
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMostrarValorAConverter;

    @FXML
    private Button btnClick;
    
    @FXML
    private TextField txtValorAConverter;
    
    @FXML
    void btnConverter(ActionEvent event) {

        String nome = txtValorAConverter.getText();
        lblMostrarValorAConverter.setText("valor: " + nome);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
   
}
