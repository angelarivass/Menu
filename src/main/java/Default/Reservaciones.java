package Default;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreamoran
 */

import java.util.ArrayList;
 

import Default.Reservacion;

public class Reservaciones {
    
    private ArrayList<Reservacion> reservacion;
    
    public Reservaciones(){
        
        reservacion = new ArrayList<>();
        
    }
    
    public void crearReservacion(Reservacion reservacion){
        
        this.reservacion.add(reservacion);
        
    }
    
    public void cancelarReservacion(Reservacion reservacion){
        
        this.reservacion.remove(reservacion);
        
    }
    
}
