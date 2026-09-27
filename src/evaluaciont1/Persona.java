/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluaciont1;

import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class Persona {
   
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
     private String tipoDocumento;
    private String numeroDocumento;
    private LocalDate fechaNacimiento;
     private String celular;
    private String correo;
    private String alergia;
       private String tipoSangre;

    public Persona() {
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoDocumento, String numeroDocumento, LocalDate fechaNacimiento, String celular, String correo, String alergia, String tipoSangre) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.correo = correo;
        this.alergia = alergia;
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        if (tipoDocumento.equalsIgnoreCase("dni") || tipoDocumento.equalsIgnoreCase("ce")) {
            this.tipoDocumento = tipoDocumento;
        } else {
            System.out.println("Error tipo documento no valido");
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        if (!numeroDocumento.matches("\\d+")) {
            System.out.println("El numero de documento solo debe ser numeros");

        }
        if (this.tipoDocumento == null) {
            System.out.println("Primero debe ingresar el tipo de documento");
            return;
        }
        if (this.tipoDocumento.equalsIgnoreCase("dni")) {
            if (numeroDocumento.length() == 8) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("Error el DNI debe tener 8 dígitos");
            }

        } else if (this.tipoDocumento.equalsIgnoreCase("ce")) {
            if (numeroDocumento.length() == 10) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("Error el CE debe tener 10 dígitos");
            }
        }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        if (celular == null || celular.length() != 9) {
            System.out.println("Error el celular debe tener 9 dígitos");}
        
            this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    
   public void verDatos() {
        System.out.println("Nombres: " + this.nombre);
        System.out.println("Apellido Paterno: " + this.apellidoPaterno);
        System.out.println("Apellido Materno: " + this.apellidoMaterno);
        System.out.println("Tpo de Documento: " + this.tipoDocumento);
        System.out.println("Numero de Documento: " + this.numeroDocumento);
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
        System.out.println("Celular: " + this.celular);
        System.out.println("Correo: " + this.correo);
        System.out.println("Tipo de Sangre: " + this.tipoSangre);
        System.out.println("Alergias: " + this.alergia);
    }
}
