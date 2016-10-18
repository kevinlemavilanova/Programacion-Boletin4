/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author klemavilanova
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Satelite satelite1 = new Satelite(20.00, 30000.00, 21.0);
        Circulo circulo1 =  new Circulo(20);
        System.out.println(circulo1.calculaLonxitude());
        System.out.println(circulo1.calcularArea());
    }
}
