/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author CX
 */
public class ListaAuto {
    private ArrayList<Auto> listadoAuto;

    public ListaAuto() {
        listadoAuto=new ArrayList();
    }

    public ListaAuto(ArrayList<Auto> listadoAuto) {
        this.listadoAuto = listadoAuto;
    }

    /**
     * @return the listadoAuto
     */
    public ArrayList<Auto> getListadoAuto() {
        return listadoAuto;
    }

    /**
     * @param listadoAuto the listadoAuto to set
     */
    public void setListadoAuto(ArrayList<Auto> listadoAuto) {
        this.listadoAuto = listadoAuto;
    }
    
}
