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
    private ComboBox<Moeda> cbmParaMoedas;
    
    @FXML
    private Label lblMostrarValorAConverter;
    
    @FXML
    private Label lblValorConvertido;

    @FXML
    private Button btnClick;
    
    @FXML
    private TextField txtValorAConverter;
    
    @FXML
    private Label lblDeMoeda;

    @FXML
    private Label lblParaMoeda;

    
    private List<Moeda> moedas = new ArrayList<>();
    
    private ObservableList<Moeda> obsMoedas;
    
    public void carregarMoedas() {
        
        String[][] dadosMoedas = {
            
            {"1", "Real", "USD/BRL"},
            {"2", "Dólar", "USA/USD"},
            {"3", "Euro", "Euro/EUR"},
            {"4", "Libras Esterlinas", "Libra/GBP"},
            {"5", "Peso argentino", "Peso/ARS"},
            {"6", "Peso Chileno", "Peso/CLP"}
        };
        
        for(String[] dados: dadosMoedas) {
            int codigo = Integer.parseInt(dados[0]);
            String nome = dados[1];
            String AbreviacaoMoeda = dados[2];
            Moeda moeda = new Moeda(codigo, nome, AbreviacaoMoeda);
            moedas.add(moeda);        
        }
        
        obsMoedas = FXCollections.observableArrayList(moedas);
        cbmDeMoedas.setItems(obsMoedas);
        cbmParaMoedas.setItems(obsMoedas);
        
    }
    
  
    
    @FXML
    public void btnConverter(ActionEvent event) {

        String valor = txtValorAConverter.getText();
        Moeda primeiroValorSelecionado = cbmDeMoedas.getSelectionModel().getSelectedItem();
        Moeda segundoValorSelecionado = cbmParaMoedas.getSelectionModel().getSelectedItem();
        
        //System.out.println(primeiroValorSelecionado.getId() + " " + segundoValorSelecionado.getId());
        
        try {
            double valorAConverter = Double.parseDouble(valor);
            
            if(primeiroValorSelecionado.getId() == 1 && segundoValorSelecionado.getId() == 2) {
                
              Double valorConvertido = valorAConverter * 20.75 / 100;
              lblMostrarValorAConverter.setText("$ " + valorAConverter);
              lblValorConvertido.setText("$ " + valorConvertido);
              lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
              lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
              
            }
           
        } catch (NumberFormatException ex) {
            System.out.println("Valor não é numérico!");
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        carregarMoedas();
    }    

    
    
    
    
   
}
