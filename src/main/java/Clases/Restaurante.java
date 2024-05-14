/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


public class Restaurante {
    private Orden ordene;

    public Restaurante() {
        ordene = new Orden();
    }

//    public void agregarOrden(Orden orden) {
//        ordene.add(orden);
//    }

    public  Orden getOrdene() {
        return ordene;
    }
}

