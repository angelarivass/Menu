/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
public class Restaurante {
    private Orden ordene;
    
    private ArrayList<Orden> listaOrdenes;

    public Restaurante() {
        ordene = new Orden();
        listaOrdenes = new ArrayList<>();
        
    }

//    public void agregarOrden(Orden orden) {
//        ordene.add(orden);
//    }

    public  Orden getOrdene() {
        return ordene;
    }
    public void agregarListaOrdenes(Orden listaOrdenes){
        this.getListaOrdenes().add(listaOrdenes);
    }
     public void eliminarListaOrdenes(Orden listaOrdenes){
         this.getListaOrdenes().remove(listaOrdenes);
    }
    public ArrayList getListaOrdenes(){
        return listaOrdenes;
    }

    /**
     * @param listaOrdenes the listaOrdenes to set
     */
    public void setListaOrdenes(ArrayList<Orden> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }
}

