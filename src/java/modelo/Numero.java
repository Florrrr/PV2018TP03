/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author CX
 */
public class Numero {
    private int[] arregloNum=new int[10];

    public Numero() {
    }

    public void agregarNumeros(){
        int[] aux=new int[10];
        int num;
        Scanner in=new Scanner(System.in);
        for(int i=0;i<aux.length;i++){
            System.out.println("Ingrese Numero: ");
            aux[i]=in.nextInt();
        }
        setArregloNum(aux);
    }
    
    public void mostrarArreglo(){
        System.out.println(Arrays.toString(getArregloNum()));
    }
    
    public int mostrarMayor(){
        int mayor=getArregloNum()[0];
        for(int i=1;i<getArregloNum().length;i++){
            if(mayor<getArregloNum()[i])
                mayor=getArregloNum()[i];
        }
        return mayor;
    }
    
    public int mostrarMenor(){
        int menor=getArregloNum()[0];
        for(int i=1;i<getArregloNum().length;i++){
            if(menor>getArregloNum()[i])
                menor=getArregloNum()[i];
        }
        return menor;
    }
    
    public double calcularPromedio(){
        double prom=0;
        int i;
        for(i=0;i<getArregloNum().length;i++){
            prom=prom+getArregloNum()[i];
        }
        return(prom/i);
    }
    
    /**
     * @return the arregloNum
     */
    public int[] getArregloNum() {
        return arregloNum;
    }

    /**
     * @param arregloNum the arregloNum to set
     */
    public void setArregloNum(int[] arregloNum) {
        this.arregloNum = arregloNum;
    }
    
    
}