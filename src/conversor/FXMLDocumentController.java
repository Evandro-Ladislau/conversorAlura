/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package conversor;


import conversor.model.Moeda;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author evandro
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ComboBox<Moeda> cbmDeMoedas;
    
    @FXML
    private Label lblMostrarValorAConverter;

    @FXML
    private Button btnClick;
    
    @FXML
    private TextField txtValorAConverter;
    
    private List<Moeda> moedas = new ArrayList<>();
    
    private ObservableList<Moeda> obsMoedas;
    
    public void carregarMoedas() {
        
        String[][] dadosMoedas = {
            
            {"1", "Real"},
            {"2", "Dólar"},
            {"3", "Euro"},
            {"4", "Libras Esterlinas"},
            {"5", "Peso argentino"},
            {"6", "Peso Chileno"}
        };
        
        for(String[] dados: dadosMoedas) {
            int codigo = Integer.parseInt(dados[0]);
            String nome = dados[1];
            Moeda moeda = new Moeda(codigo, nome);
            moedas.add(moeda);        
        }
        
        obsMoedas = FXCollections.observableArrayList(moedas);
        cbmDeMoedas.setItems(obsMoedas);
        
    }
    
    @FXML
    void btnConverter(ActionEvent event) {

        String nome = txtValorAConverter.getText();
        lblMostrarValorAConverter.setText("valor: " + nome);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        carregarMoedas();
    }    
    
    
    
   
}
