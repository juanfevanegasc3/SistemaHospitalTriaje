/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import java.util.LinkedList;

import java.util.PriorityQueue;
/**
 *
 * @author juanf
 */
public class Control {
    private PriorityQueue<Paciente> cola;
    
    public Control(){
         this.cola=new PriorityQueue();
    }
    
    public boolean ingresarPaciente(String nombre, String edad, String id, String triaje,String hora){
        try{
            byte age=Byte.parseByte(edad);
            int identify=Integer.parseInt(id);
            NivelTriaje nivel= NivelTriaje.valueOf(triaje);
            int hour=Integer.parseInt(hora);
            
            Paciente p=new Paciente(nombre,age,identify,nivel,hour);
            this.cola.add(p);
            return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
    
}
