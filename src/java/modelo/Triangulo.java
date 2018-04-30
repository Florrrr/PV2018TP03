/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author CX
 */
public class Triangulo {
    private int[] triangulo;

    public Triangulo() {
    }

    public Triangulo(int[] triangulo) {
        this.triangulo = triangulo;
    }
    
    public void crearTriangulo(){
        Scanner in=new Scanner(System.in);
        setTriangulo(new int[3]);
        for (int i=0;i<getTriangulo().length;i++){
            System.out.println("Ingrese lado: ");
            getTriangulo()[i]=in.nextInt();
        }
    }
    
    public boolean validarTriangulo(){
        if(getTriangulo()[0]+getTriangulo()[1]>getTriangulo()[2]){
            if(getTriangulo()[0]+getTriangulo()[2]>getTriangulo()[1]){
                if(getTriangulo()[1]+getTriangulo()[2]>getTriangulo()[0])
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }
    
    public void calcularPerimetro(){
        boolean band=validarTriangulo();
        int aux=getTriangulo()[0]+getTriangulo()[1]+getTriangulo()[2];
        if(band==true)
            System.out.println("El triangulo existe y su perimetro es "+aux);
        else
            System.out.println("El triangulo no existe");
    }   

    /**
     * @return the triangulo
     */
    public int[] getTriangulo() {
        return triangulo;
    }

    /**
     * @param triangulo the triangulo to set
     */
    public void setTriangulo(int[] triangulo) {
        this.triangulo = triangulo;
    }
    
}
