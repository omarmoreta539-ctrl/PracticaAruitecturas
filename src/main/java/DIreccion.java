/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMARU
 */
public class DIreccion {
    private String calle;
    private String ciudad;
    private int coDpostal;
    private Pais pais;
    public DIreccion() {
    }

    public DIreccion(String calle, String ciudad, int coDpostal, Pais pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.coDpostal = coDpostal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCoDpostal() {
        return coDpostal;
    }

    public void setCoDpostal(int coDpostal) {
        this.coDpostal = coDpostal;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "DIreccion{" + "calle=" + calle + ", ciudad=" + ciudad + ", coDpostal=" + coDpostal + ", pais=" + pais.getNombre() + '}';
    }

    
    }
    

