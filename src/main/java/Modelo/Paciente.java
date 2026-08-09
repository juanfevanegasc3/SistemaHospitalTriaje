/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author juanf
 */
public class Paciente extends Persona implements Comparable{
    private NivelTriaje triaje;
    private LocalDateTime horaLlegada;
    
    public Paciente(String nombre, byte edad, int id, NivelTriaje triaje, int hora){
        super(nombre,edad,id);
        this.triaje=triaje;
        this.horaLlegada=this.fecha(hora);
    }
    
    private LocalDateTime fecha(int fila){
        int hora=fila/100;
        fila=fila/100;
        int min=fila;
        return LocalDateTime.of(2026,1,1,hora,min);
    }

    public NivelTriaje getTriaje() {
        return triaje;
    }

    public void setTriaje(NivelTriaje triaje) {
        this.triaje = triaje;
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalDateTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    @Override
    public int compareTo(Object o) {
        if(o.getClass()!=this.getClass()){
            throw new RuntimeException("Error");
        }
        
        Paciente p=(Paciente) o;
        
        int gravedad=this.triaje.compareTo(p.triaje);
        
        if(gravedad!=0){
            return gravedad;
        }
        
        return this.horaLlegada.compareTo(p.horaLlegada);
    }
    
    
}
