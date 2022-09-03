/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Cassio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ventilador v1 = new Ventilador("branco");

        Ventilador v2 = new Ventilador(1l, "Branco", true);

        System.out.println(v1.verVelocidade());
        System.out.println(v2.verVelocidade());
        
        v1.ligar();
        v2.desligar();
        
        System.out.println(v1.verVelocidade());
        System.out.println(v2.verVelocidade());
        

    }

}
