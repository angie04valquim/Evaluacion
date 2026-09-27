/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluaciont1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EvaluacionT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        ControladorPersona control = new ControladorPersona();

        String rpta = "si";
        while (rpta.equalsIgnoreCase("si")) {
            System.out.print("Nombres: ");
            String nombre = sc.nextLine();
            p.setNombre(nombre);

            System.out.print("Apellido paterno: ");
            String apellidoPaterno = sc.nextLine();
            p.setApellidoPaterno(apellidoPaterno);

            System.out.print("Apellido materno: ");
            String apellidoMaterno = sc.nextLine();
            p.setApellidoMaterno(apellidoMaterno);

            System.out.print("Tipo de documento (DNI/CE): ");
            String tipoDocumento = sc.nextLine();
            p.setTipoDocumento(tipoDocumento);

            System.out.print("Número de documento: ");
            String numeroDocumento = sc.nextLine();
            p.setNumeroDocumento(numeroDocumento);

            System.out.print("Ingrese fecha de nacimiento (Año-mes-dia)");
            String nac = sc.nextLine();
            p.setFechaNacimiento(LocalDate.parse(nac));

            System.out.print("Celular: ");
            String celular = sc.nextLine();
            p.setCelular(celular);

            System.out.print("Correo: ");
            String correo = sc.nextLine();
            p.setCorreo(correo);
            control.agregarPersona(p);

            System.out.print("Ingrese tipo de sangre: ");
            String tipoSangre = sc.nextLine();
            p.setTipoSangre(tipoSangre);
            control.agregarPersona(p);

            System.out.print("Ingrese alergia: ");
            String alergia = sc.nextLine();
            p.setAlergia(alergia);
            
            control.agregarPersona(p);
            
            System.out.println("\nPersona registrada correctamente.");

            System.out.println("Desea ingresar otra persona Si/No");
            
            rpta = sc.nextLine();

        }


        control.listarPersonas();
        p.verDatos();
    }

}
