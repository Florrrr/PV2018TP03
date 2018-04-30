/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import controlador.RectanguloBean;

/**
 *
 * @author CX
 */
public class Principal04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloBean rectanguloBean=new RectanguloBean();
        rectanguloBean.llenarListado();
        rectanguloBean.mostrarListado();
        rectanguloBean.eliminarRectangulo();
        rectanguloBean.mostrarListado();
        // TODO code application logic here
    }
    
}
