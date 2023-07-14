/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package conversor;


import conversor.model.Moeda;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
    
    public String formatarMonetario(double valor, Locale locale) {
        
        NumberFormat formatoMonetario = NumberFormat.getCurrencyInstance(locale);
        return formatoMonetario.format(valor);
        
    }
    
    
  
    
    @FXML
    public void btnConverter(ActionEvent event) {

        String valor = txtValorAConverter.getText();
        Moeda primeiroValorSelecionado = cbmDeMoedas.getSelectionModel().getSelectedItem();
        Moeda segundoValorSelecionado = cbmParaMoedas.getSelectionModel().getSelectedItem();
        
        //System.out.println(primeiroValorSelecionado.getId() + " " + segundoValorSelecionado.getId());
        
        try {
            
            double valorAConverter = Double.parseDouble(valor);
            
            if(primeiroValorSelecionado.getId() == 1) {
             
              int opcao = segundoValorSelecionado.getId();
              double valorConvertido = 0;
              
              switch(opcao) {
                  case 1:
                      valorConvertido = valorAConverter;
                      lblMostrarValorAConverter.setText(formatarMonetario(valorAConverter, new Locale("pt", "BR")));
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;
                      
                  case 2:       
                      valorConvertido = (valorAConverter * 20.75) / 100;
                      lblMostrarValorAConverter.setText(formatarMonetario(valorAConverter, new Locale("pt", "BR")));
                      lblValorConvertido.setText(formatarMonetario(valorConvertido, Locale.US));
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;
                      
                  case 3:    
                      valorConvertido = (valorAConverter * 18.57) / 100;  
                      lblMostrarValorAConverter.setText(formatarMonetario(valorAConverter, new Locale("pt", "BR")));
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;  
                      
                  case 4:    
                      valorConvertido = (valorAConverter * 15.87) / 100;  
                      lblMostrarValorAConverter.setText(formatarMonetario(valorAConverter, new Locale("pt", "BR")));
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;
                      
                  case 5:    
                      valorConvertido = (valorAConverter * 5477.29) / 100;  
                      lblMostrarValorAConverter.setText(formatarMonetario(valorAConverter, new Locale("pt", "BR")));
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;
                      
                  case 6:    
                      valorConvertido = (valorAConverter * 16839.02) / 100;  
                      lblMostrarValorAConverter.setText(formatarMonetario(valorAConverter, new Locale("pt", "BR")));
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;
              }
           
              
            }else if(segundoValorSelecionado.getId() == 1) {
                
                double valorConvertido = 0;
                int opcao = primeiroValorSelecionado.getId();
                
                switch(opcao) {
                    
                  case 1:
                      valorConvertido = valorAConverter ;
                      lblMostrarValorAConverter.setText("$ " + valorAConverter);
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;
                      
                  case 2:    
                      valorConvertido = valorAConverter * 4.80;
                      lblMostrarValorAConverter.setText("$ " + valorAConverter);
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;
                      
                  case 3:    
                      valorConvertido = valorAConverter * 5.38;
                      lblMostrarValorAConverter.setText("$ " + valorAConverter);
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;  
                      
                  case 4:    
                      valorConvertido = valorAConverter * 6.29;
                      lblMostrarValorAConverter.setText("$ " + valorAConverter);
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;
                      
                  case 5:    
                      valorConvertido = valorAConverter * 0.018;
                      lblMostrarValorAConverter.setText("$ " + valorAConverter);
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break; 
                      
                 case 6:    
                      valorConvertido = valorAConverter * 0.0059;
                      lblMostrarValorAConverter.setText("$ " + valorAConverter);
                      lblValorConvertido.setText("$ " + valorConvertido);
                      lblDeMoeda.setText(primeiroValorSelecionado.getMoeda());
                      lblParaMoeda.setText(segundoValorSelecionado.getMoeda());
                      break;     
                }
               
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
