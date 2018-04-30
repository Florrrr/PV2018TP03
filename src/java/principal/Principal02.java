/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import controlador.PuntoBean;

/**
 *
 * @author CX
 */
public class Principal02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntoBean puntoBean=new PuntoBean();
        puntoBean.llenarLista();
        System.out.println("Distancia entre los puntos: "+puntoBean.calcularDistancia());
    }
    
}
