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
public class Moeda {
   
   private int id; 
   private String nome;
   
   public Moeda(int id, String nome)  {
       
       this.id = id;
       this.nome = nome;
       
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

    @Override
    public String toString() {
        return getNome();
    }
    
    
}
