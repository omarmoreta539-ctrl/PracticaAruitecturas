package Vista;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Controlador.PaisControlador;
import MODELO.DIreccion;
import MODELO.Estudiante;
import MODELO.Pais;
import controlador.ConexionBDD;
import javax.swing.JOptionPane;
/**
 *
 * @author AMARU
 */
public class Main {

    public static void main(String[] args) {
        // Objeto Pais
//        Pais p = new Pais();
//        p.setCapital("Quito");
//        p.setNombre("Ecuador");
//     //OBJETO O INSTANCIA DE DIRECCION
//        DIreccion d=new DIreccion();
//        d.setCalle("Bolívar");
//        d.setCiudad("Ibarra");
//        d.setCoDpostal(100100);
//        d.setPais(p);
//        System.out.println(d.toString());
//        
//        // Estudiante
//        Estudiante e = new Estudiante();
//        e.setNombre(JOptionPane.showInputDialog("Ingrese su Nombre"));
//        e.setApellido(JOptionPane.showInputDialog("Ingrese su apellido"));
//        int cedula = 0;
//        boolean cedulaValida = false;
//        while (!cedulaValida) {
//          try { String inputCedula = JOptionPane.showInputDialog("Ingrese su cedula");
//           if (inputCedula == null) {
//           break;}
//                cedula = Integer.parseInt(inputCedula);
//                if (e.validarCedulaEcuatoriana(inputCedula)) {
//                    cedulaValida = true;} 
//                else {JOptionPane.showMessageDialog(null, "La cedula ingresada no es valida en Ecuador.");}
//    } 
//          catch (NumberFormatException error) {JOptionPane.showMessageDialog(null, "Solo se permiten números.");
//            }
//        }
//        e.setCedula(cedula); 
//        DIreccion dir = new DIreccion();
//        dir.setCalle(JOptionPane.showInputDialog("Ingrese su direccion"));
//        dir.setCiudad(JOptionPane.showInputDialog("Ingrese la Ciudad de residencia"));
//        
//        try {
//            dir.setCoDpostal(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su codigo postal")));
//        } catch (NumberFormatException error) { JOptionPane.showMessageDialog(null, "Solo se permiten números.");
//            dir.setCoDpostal(0);
//        }
//        
//        dir.setPais(p);
//        e.setDireccion(dir);
//        JOptionPane.showMessageDialog(null, e.toString());
//        System.out.println(e.toString());
        
        ConexionBDD  prueba=new ConexionBDD();
        prueba.conectar();
        
//        Pais p = new Pais();
//        p.setCapital(JOptionPane.showInputDialog("Ingrese el capital del pais"));
//        p.setNombre(JOptionPane.showInputDialog("Ingrese el nombbre de la capital"));
//        
//      PaisControlador pa1=new PaisControlador();
//        pa1.insertarPais(p);
                
       
     PaisControlador controlador = new PaisControlador();
//        controlador.imprimirPaises();

        java.sql.Connection conectado = (java.sql.Connection) prueba.conectar();

      Pais nuevoPais = new Pais(2, "Argentina", "Buenos Aires");
        controlador.insertarPais(conectado, nuevoPais);
        
        Pais p = new Pais(1, "Ecuador", "Quito");
        controlador.actualizarPais(conectado, p);

    
        controlador.eliminarPais(conectado, 3);

        System.out.println("\n--- DATOS ACTUALES EN LA BASE DE DATOS ---");
        controlador.imprimirPaises();
        
    }
    
}
    
