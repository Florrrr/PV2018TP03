/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import modelo.Numero;

/**
 *
 * @author CX
 */
public class Principal01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero Numero=new Numero();
        Numero.agregarNumeros();
        Numero.mostrarArreglo();
        System.out.println("Mayor: "+Numero.mostrarMayor()+" Menor: "+Numero.mostrarMenor());
        System.out.println("Promedio: "+Numero.calcularPromedio());
        // TODO code application logic here
    }
    
}
