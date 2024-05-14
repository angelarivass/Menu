/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author angel
 */
import java.util.ArrayList;

public class Orden {
    private ArrayList<Productos> productos;

    public Orden() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Productos productos) {
        this.productos.add(productos);
    }

    public void eliminarProducto(Productos productos) {
        this.productos.remove(productos);
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }
}
