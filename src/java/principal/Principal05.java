/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import controlador.AutoBean;

/**
 *
 * @author CX
 */
public class Principal05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoBean autoBean=new AutoBean();
        autoBean.llenarListado();
        autoBean.mostrarListado();
        autoBean.modificarAuto();
        autoBean.mostrarListado();
        // TODO code application logic here
    }
    
}
