/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluaciont1;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ControladorPersona {
      ArrayList<Persona> lista = new ArrayList();
    
    public void agregarPersona(Persona nueva){
        lista.add(nueva);
    }
    public void listarPersonas(){
        System.out.println("La lista de personas es:");
        for(int i=0; i<lista.size();i++){
            Persona  p = lista.get(i);
            //p.verDatos();
        }
    }
    
}
