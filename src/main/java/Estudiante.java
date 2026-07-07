/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMARU
 */
public class Estudiante implements Humano{
    private int idEstudiante;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante) {
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
        return "Estudiante{" + "idEstudiante=" + idEstudiante + '}';
    }

    @Override
    public void identificacion() {
        System.out.println("Clses Estudiante");
    }
    
}
