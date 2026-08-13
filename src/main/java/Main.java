/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Modelo.*;
import Controlador.*;
import Vista.*;
/**
 *
 * @author juanf
 */
public class Main {
    public static void main(String[] args){
        Control inicio=new Control();
        JFInicio inicial=new JFInicio();
        JFIngreso form=new JFIngreso(inicio, inicial);
        JFMedico med=new JFMedico(inicio, inicial);
        inicial.setIngreso(form);
        inicial.setMedico(med);
        inicial.setVisible(true);
    }
}
