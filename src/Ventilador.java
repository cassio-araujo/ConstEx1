/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cassio
 */
public class Ventilador {

    private Long velocidade;
    private String cor;
    private boolean ligado;

    //sobrecarga 
    public Ventilador(String cor) {
        this.cor = cor;
        this.velocidade = 0l;
        this.ligado = false;
    }

    public Ventilador(Long velocidade, String cor, boolean ligado) {
        if (velocidade > 0) {
            this.velocidade = velocidade;
        }
        this.cor = cor;
        this.ligado = ligado;

    }

    public Long getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Long velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        velocidade = 1l;
        ligado = true;

    }

    public void desligar() {
        velocidade = 0l;
        ligado = false;
    }

    public String verVelocidade() {
        if (ligado = true){
            return "velocidade: " + velocidade;
        }
        else {
            return "Ventilador esta desligado";
        }
        
    }

}
