

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreamoran
 */
public class Reservacion {
    
    private String nombre;
    private String fecha;
    private double numeroTelefonico;
    private int numeroDePersonas;
    
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public double getNumeroTelefonico(){
        return numeroTelefonico;
    }
    
    public void setNumeroTelefonico(double numeroTelefonico){
        this.numeroTelefonico = numeroTelefonico;
    }
    
    public int getNumeroDePersonas(){
        return numeroDePersonas;
    }
    
    public void setNumeroDePersonas(int numeroDePersonas){
        this.numeroDePersonas = numeroDePersonas;
    }
    
    public Reservacion(String nombre, String fecha, double numeroTelefonico, int numeroDePersonas){
        this.nombre = nombre;
        this.fecha = fecha;
        this.numeroTelefonico = numeroTelefonico;
        this.numeroDePersonas = numeroDePersonas;
    }

        
//        public boolean cancelarReservacion(String nombre, String fecha, int numeroDePersonas){
//            reservacion reservacion = reservacion();
//            if(reservacion != null){
//                reservacion.remove(reservacion);
//                return true;
//            }
//            return false;
            
        }
        
    
    

