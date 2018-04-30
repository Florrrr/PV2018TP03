/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Scanner;
import modelo.Auto;
import modelo.ListaAuto;

/**
 *
 * @author CX
 */
public class AutoBean {
    private Auto auto;
    private ListaAuto listaAuto;

    public AutoBean() {
        listaAuto=new ListaAuto();
    }

    public AutoBean(Auto auto, ListaAuto listaAuto) {
        this.auto = auto;
        this.listaAuto = listaAuto;
    }
    
    public Auto crearAuto(String patente,String marca,String modelo,String color,String comb,String cont){
        Auto unAuto=new Auto();
        unAuto.setPatente(patente);
        unAuto.setMarca(marca);
        unAuto.setModelo(modelo);
        unAuto.setColor(color);
        unAuto.setComb(comb);
        unAuto.setCont(cont);
        return unAuto;
    }
    
    public void llenarListado(){
        getListaAuto().getListadoAuto().add(crearAuto("AA589GH","Fiat","Punto","Rojo","Nafta Super","1"));
        getListaAuto().getListadoAuto().add(crearAuto("AA858LA","Wolksvagen","Voyage","Blanco","Nafta Premium","2"));
        getListaAuto().getListadoAuto().add(crearAuto("AA285OQ","Citroen","C3","Negro","Nafta Super","3"));
        getListaAuto().getListadoAuto().add(crearAuto("AA729GE","Peugeot","308","Gris","Nafta Diesel Hdi","4"));
        getListaAuto().getListadoAuto().add(crearAuto("AA982MV","Ferrari","458","Rojo","Nafta SuperDuperPremium","5"));
    }
    
    public void mostrarListado(){
        for(Auto cadaAuto:listaAuto.getListadoAuto()){
            System.out.println("Auto "+cadaAuto.getCont()+" | Patente: "+cadaAuto.getPatente()+
                    " - Marca: "+cadaAuto.getMarca()+" - Modelo: "+cadaAuto.getModelo()+
                    " - Color: "+cadaAuto.getColor()+" - Combustible: "+cadaAuto.getComb());
        }
    }
    
    public void modificarAuto(){
        Scanner in=new Scanner(System.in);
        Scanner mod=new Scanner(System.in);
        int op;
        String indice;
        System.out.println("¿Que auto desea modificar?: ");
        indice=in.next();
        int aux=Integer.parseInt(indice);
        if(aux<getListaAuto().getListadoAuto().size()){
            for(Auto cadaAuto:listaAuto.getListadoAuto()){
                if(indice.equals(cadaAuto.getCont())){
                    System.out.println("¿Que desea modificar?");
                    System.out.println("1.Patente");
                    System.out.println("2.Marca");
                    System.out.println("3.Modelo");
                    System.out.println("4.Color");
                    System.out.println("5.Tipo de Combustible");
                    System.out.println("6.Todo");
                    System.out.println("7.Eliminar auto");
                    System.out.println("8.Salir");
                    System.out.println("Elija Opcion: ");
                    op=in.nextInt();
                    switch(op){
                        case 1:{
                            cadaAuto.setPatente(mod.next());
                            break;
                        }
                        case 2:{
                            cadaAuto.setMarca(mod.next());
                            break;
                        }
                        case 3:{
                            cadaAuto.setModelo(mod.next());
                            break;
                        }
                        case 4:{
                            cadaAuto.setColor(mod.next());
                            break;
                        }
                        case 5:{
                            cadaAuto.setComb(mod.next());
                            break;
                        }
                        case 6:{
                            System.out.println("Patente: ");
                            cadaAuto.setPatente(mod.next());
                            System.out.println("Marca: ");
                            cadaAuto.setPatente(mod.next());
                            System.out.println("Modelo: ");
                            cadaAuto.setModelo(mod.next());
                            System.out.println("Color: ");
                            cadaAuto.setColor(mod.next());
                            System.out.println("Combustible: ");
                            cadaAuto.setComb(mod.next());
                            break;
                        }
                        case 7:{
                            listaAuto.getListadoAuto().remove(aux-1);
                            break;
                        }
                        case 8:{
                            System.out.println("Sin modificaciones");
                            break;
                        }
                        default:{
                            System.out.println("Opcion Incorrecta");
                            break;
                        }
                    }
                }
            }
        }
        else
            System.out.println("Numero erroneo");
    }

    /**
     * @return the auto
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     * @return the listaAuto
     */
    public ListaAuto getListaAuto() {
        return listaAuto;
    }

    /**
     * @param listaAuto the listaAuto to set
     */
    public void setListaAuto(ListaAuto listaAuto) {
        this.listaAuto = listaAuto;
    }
    
}
