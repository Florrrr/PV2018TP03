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
public class ListaPunto {
    private ArrayList<Punto> listadoPunto;

    public ListaPunto(ArrayList<Punto> listadoPunto) {
        this.listadoPunto = listadoPunto;
    }

    public ListaPunto() {
        listadoPunto=new ArrayList();
    }

    /**
     * @return the listadoPunto
     */
    public ArrayList<Punto> getListadoPunto() {
        return listadoPunto;
    }

    /**
     * @param listadoPunto the listadoPunto to set
     */
    public void setListadoPunto(ArrayList<Punto> listadoPunto) {
        this.listadoPunto = listadoPunto;
    }
}
