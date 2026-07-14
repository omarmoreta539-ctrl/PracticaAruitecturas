package MODELO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMARU
 */
public class Pais {
    private int idPais;
    private String nombre;
    private String capital;

    public Pais(int idPais, String nombre, String capital) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.capital = capital;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

  @Override
    public String toString() {
        return "---Pais---{" + "id_pais=" + idPais + ", nombre=" + nombre + ", capital=" + capital + '}';
    }

   
   
    
}
