/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor.model;

/**
 *
 * @author evandro
 */
public class Temperatura {
    
    private int id; 
    String escala;
    String valorTemperatura;
    
    public Temperatura(int id, String escala, String valorTemperatura) {
        this.id = id;
        this.escala = escala;
        this.valorTemperatura = valorTemperatura;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getEscala() {
        return this.escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getValorTemperatura() {
        return this.valorTemperatura;
    }

    public void setValorTemperatura(String valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }

    @Override
    public String toString() {
        return getEscala();
    }
    
}
