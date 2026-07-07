/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMARU
 */
public class Main {
    public static void main(String[] args){
        //Objeto Pais
        Pais p=new Pais();
        p.setCapital("Quito");
        p.setNombre("Ecuador");
        
        //Objeto o instancia de dirrecion
        DIreccion d=new DIreccion();
        d.setCalle("Bolivar");
        d.setCiudad("Ibarra");
        d.setCoDpostal(100100);
        d.setPais(p);
        System.out.println(d.toString());
        
    }
}
