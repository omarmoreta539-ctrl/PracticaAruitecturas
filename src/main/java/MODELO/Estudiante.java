package MODELO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMARU
 */
public class Estudiante extends Persona {
    private int idEstudiante;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Estudiante(int idEstudiante, String nombre, String apellido, int cedula, DIreccion direccion) {
        super(nombre, apellido, cedula, direccion);
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "----Estudiante----\n" +
               "Nombres: " + getNombre() + "\n" +
               "Apellidos: " + getApellido() + "\n" +
               "Cédula: " + getCedula() + "\n" +
               getDireccion();
    }

    @Override
    public void identificacion() {
        System.out.println("Clase Estudiante");
    }
}
        
    

    
    

