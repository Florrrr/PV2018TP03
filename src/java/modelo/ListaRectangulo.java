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
public class ListaRectangulo {
    private ArrayList<Rectangulo> listadoRectangulo;

    public ListaRectangulo() {
        listadoRectangulo=new ArrayList();
    }

    public ListaRectangulo(ArrayList<Rectangulo> listadoRectangulo) {
        this.listadoRectangulo = listadoRectangulo;
    }

    /**
     * @return the listadoRectangulo
     */
    public ArrayList<Rectangulo> getListadoRectangulo() {
        return listadoRectangulo;
    }

    /**
     * @param listadoRectangulo the listadoRectangulo to set
     */
    public void setListadoRectangulo(ArrayList<Rectangulo> listadoRectangulo) {
        this.listadoRectangulo = listadoRectangulo;
    }
    
}
