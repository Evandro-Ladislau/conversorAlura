/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor.model;

import conversor.Conversao;

/**
 *
 * @author evandro
 */
public class Moeda implements Conversao {
   
   private int id; 
   private String nome;
   private String AbreviacaoMoeda;
   
   public Moeda(int id, String nome, String Abreviacaomoeda)  {
       
       this.id = id;
       this.nome = nome;
       this.AbreviacaoMoeda = Abreviacaomoeda;
       
   }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public String getMoeda() {
        return this.AbreviacaoMoeda;
    }

    public void setMoeda(String moeda) {
        this.AbreviacaoMoeda = moeda;
    }
    
    @Override
    public String toString() {
        return getNome();
    }

    
   @Override
    public boolean pegarValoresSelecionados(String valor1, String valor2) {
        if(valor1 == valor2){
          return false;
        }else {
            return true;
        }
        
    }
    
}
