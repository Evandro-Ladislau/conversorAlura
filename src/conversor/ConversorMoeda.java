package conversor;


import conversor.Conversao;
import conversor.model.Moeda;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javafx.scene.control.Alert;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evandro
 */
public class ConversorMoeda {

    
    public double converterValor(double valorDeEntrada, Moeda valorOrigem, Moeda valorDestino) {
      double cotacaoOrigem =  Double.parseDouble(valorOrigem.getCotacao());
      double cotacaoDestino = Double.parseDouble(valorDestino.getCotacao());
      double valorConvertido = 0;
      
      if(valorOrigem.getId() == 1) {
        valorConvertido = valorDeEntrada / cotacaoDestino;
      }else if(valorDestino.getId() == 1) {
        valorConvertido = valorDeEntrada * cotacaoOrigem;
      }
      
      return valorConvertido;
    }
    
     public double validarValorDeEntradaDoUsuario(String valor) {
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(); 
        symbols.setDecimalSeparator(',');
        
        DecimalFormat formatoNumerico = new DecimalFormat();
        formatoNumerico.setDecimalFormatSymbols(symbols);
        
        try {
            Number numeroFormatado = formatoNumerico.parse(valor);
            return numeroFormatado.doubleValue(); 
        } catch(ParseException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Título");
                alert.setHeaderText("Erro!");
                alert.setContentText("Valor não é numérico, varifique!");
                alert.show();
            return 0.0;
        }
    }
    
    public String formatarValorMonetario(double valor, Locale locale) {
        
        NumberFormat formatoMonetario = NumberFormat.getCurrencyInstance(locale);
        return formatoMonetario.format(valor);
        
    }

   
    
}
