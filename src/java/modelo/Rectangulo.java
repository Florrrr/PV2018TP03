/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author CX
 */
public class Rectangulo {
    private int base;
    private int alt;
    private int sup;
    private int per;
    private int cont;

    public Rectangulo() {
    }

    public Rectangulo(int base, int alt, int sup, int per, int cont) {
        this.base = base;
        this.alt = alt;
        this.sup = sup;
        this.per = per;
        this.cont = cont;
    }
    
    

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the alt
     */
    public int getAlt() {
        return alt;
    }

    /**
     * @param alt the alt to set
     */
    public void setAlt(int alt) {
        this.alt = alt;
    }

    /**
     * @return the sup
     */
    public int getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(int sup) {
        this.sup = sup;
    }

    /**
     * @return the per
     */
    public int getPer() {
        return per;
    }

    /**
     * @param per the per to set
     */
    public void setPer(int per) {
        this.per = per;
    }

    /**
     * @return the cont
     */
    public int getCont() {
        return cont;
    }

    /**
     * @param cont the cont to set
     */
    public void setCont(int cont) {
        this.cont = cont;
    }
    
}
