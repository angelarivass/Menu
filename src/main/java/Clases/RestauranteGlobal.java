/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


/**
 *
 * @author angel
 */
public class RestauranteGlobal {
    protected static Restaurante r;
    private Cuenta c;
    private Orden o;
    private Productos p; 
    
    
               
    
    
    public RestauranteGlobal(){
       
  this.r= new Restaurante();
       
    }

    /**
     * @return the r
     */
    public static Restaurante getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public static void setR(Restaurante r) {
        RestauranteGlobal.r = r;
    }

    /**
     * @return the c
     */
    public Cuenta getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Cuenta c) {
        this.c = c;
    }

    /**
     * @return the o
     */
    public Orden getO() {
        return o;
    }

    /**
     * @param o the o to set
     */
    public void setO(Orden o) {
        this.o = o;
    }

    /**
     * @return the p
     */
    public Productos getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Productos p) {
        this.p = p;
    }
}