package MODELO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author AMARU
 */

public class Persona implements Humano {
    private String nombre;
    private String apellido;
    private int cedula;
    private DIreccion direccion; 

    public Persona() {
    }

    public Persona(String nombre, String apellido, int cedula, DIreccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public DIreccion getDireccion() {
        return direccion;
    }

    public void setDireccion(DIreccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", direccion=" + direccion + '}';
    }

    @Override
    public void identificacion() {
        System.out.println("Clase persona");
    }

   public boolean validarCedulaEcuatoriana(String cedula) {
    if (cedula != null) {
        if (cedula.length() == 10) {
            
            try {
                int provincia = Integer.parseInt(cedula.substring(0, 2));
                if (provincia >= 1 && provincia <= 24) {
                } else if (provincia == 30) {
                } else
                 {
                    return false;}
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito >= 6) {
                    return false;
                }
                
                int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int suma = 0;
                for (int i = 0; i < 9; i++) {
                    int valor = Integer.parseInt(cedula.substring(i, i + 1)) * coeficientes[i];
                    if (valor >= 10) {
                        valor -= 9;
                    }
                    suma += valor;}
                
                int digitoVerificador = Integer.parseInt(cedula.substring(9, 10));
                int decenas = ((suma + 9) / 10) * 10;
                int resultado = decenas - suma;
                if (resultado == 10) {
                    resultado = 0; }
                
                return resultado == digitoVerificador;
                
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
    
    return false;
}
   }