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

    public Ventilador(String cor) {
        this.cor = cor;
    }

    public Ventilador(Long velocidade, String cor, boolean ligado) {
        this.velocidade = 1000l;
        this.cor = "branco";
        this.ligado = false;
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

    public isLigado(boolean ligado) {

    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public ligar(void) {

    }

    public desligar() {

    }

    public verVelocidade() {

    }
