/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Scanner;
import modelo.ListaRectangulo;
import modelo.Rectangulo;

/**
 *
 * @author CX
 */
public class RectanguloBean {
    private Rectangulo rectangulo;
    private ListaRectangulo listaRectangulo;

    public RectanguloBean(Rectangulo rectangulo, ListaRectangulo listaRectangulo) {
        this.rectangulo = rectangulo;
        this.listaRectangulo = listaRectangulo;
    }

    public RectanguloBean() {
        listaRectangulo=new ListaRectangulo();
    }
    
    public Rectangulo crearRectangulo(int base,int alt,int cont){
        Rectangulo unRectangulo=new Rectangulo();
        unRectangulo.setCont(cont);
        unRectangulo.setBase(base);
        unRectangulo.setAlt(alt);
        unRectangulo.setPer(unRectangulo.getAlt()*2+unRectangulo.getBase()*2);
        unRectangulo.setSup(unRectangulo.getAlt()*unRectangulo.getBase());
        return unRectangulo;
    }
    
    public void llenarListado(){
        getListaRectangulo().getListadoRectangulo().add(crearRectangulo(2,4,1));
        getListaRectangulo().getListadoRectangulo().add(crearRectangulo(5,3,2));
        getListaRectangulo().getListadoRectangulo().add(crearRectangulo(8,6,3));
        getListaRectangulo().getListadoRectangulo().add(crearRectangulo(7,3,4));
        getListaRectangulo().getListadoRectangulo().add(crearRectangulo(1,4,5));
    }
    
    public void mostrarListado(){
        for(Rectangulo cadaRectangulo:listaRectangulo.getListadoRectangulo()){
            System.out.println("Rectangulo "+cadaRectangulo.getCont()+" | Base: "+cadaRectangulo.getBase()+" - Altura: "+cadaRectangulo.getAlt()+
            " - Perimetro: "+cadaRectangulo.getPer()+" - Superficie: "+cadaRectangulo.getSup());
        }
    }
    
    public void eliminarRectangulo(){
        Scanner in=new Scanner(System.in);
        int indice;
        System.out.println("Seleccione Triangulo a borrar: ");
        indice=in.nextInt();
        listaRectangulo.getListadoRectangulo().remove(indice-1);
    }

    /**
     * @return the rectangulo
     */
    public Rectangulo getRectangulo() {
        return rectangulo;
    }

    /**
     * @param rectangulo the rectangulo to set
     */
    public void setRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    /**
     * @return the listaRectangulo
     */
    public ListaRectangulo getListaRectangulo() {
        return listaRectangulo;
    }

    /**
     * @param listaRectangulo the listaRectangulo to set
     */
    public void setListaRectangulo(ListaRectangulo listaRectangulo) {
        this.listaRectangulo = listaRectangulo;
    }
}
