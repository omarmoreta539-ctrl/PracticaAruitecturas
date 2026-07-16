package Vista;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Controlador.PaisControlador;
import Controlador.PaisControlador;
import MODELO.DIreccion;
import MODELO.Estudiante;
import MODELO.Pais;
import MODELO.Pais;
import MODELO.Persona;
import controlador.ConexionBDD;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
//        
        ConexionBDD  prueba=new ConexionBDD();
        prueba.conectar();
        
//        
        

//        
//        PaisControlador pal = new PaisControlador();
//        Pais p = new Pais("Urcuqui", "Urcuyork");
//        System.out.println("=== Insertando país ===");
//        pal.insertarPais(p);
//        
//    }
//}
//                
//       
//     PaisControlador controlador = new PaisControlador();
//        controlador.imprimirPaises();
//        System.out.println("=== lista de paises ===");
//        prueba.conectar();  
//        System.out.println("=== cierre de lista===");
//    }
//}
//
//      PaisControlador controlador = new PaisControlador();
//        Pais p = new Pais( "Urcuqui", "Costa");
//        System.out.println("=== Iniciando actualización ===");
//        controlador.actualizarPais(p);
//        
//    }
//}  
//
PaisControlador controlador = new PaisControlador();
Pais paisAEliminar = new Pais( "Urcuqui", "");
controlador.eliminarPais(paisAEliminar);

System.out.println("\n--- Se a eliminado el pais ---");
controlador.imprimirPaises();
    }
}

////
///
///
///append concatena hasta el final
///fichero un archivo aexportar con file
///directorio es una carpeta 
///  //UPCASTING : CREAR UN OBJETO (PADRE)
        //USANDO LOS CONSTRUCTOR SU (HIJO) O SUBCLASE
//        Persona maria=new Estudiante();
//        maria.setNombre("María");
//        maria.setApellido("Correa");
//        maria.setCedula(1002003001);
//        
//        
//        //DOWNCASTING
//        //Transformar o cambiar el tipo de Objeto
//        //del Padre al Hijo conservando sus comportamientos
//        Estudiante eMaria=(Estudiante)maria;
//        eMaria.setIdEstudiante(100);
//        System.out.println(eMaria.getIdEstudiante()+"\n"+eMaria.getNombre()+" "+eMaria.getApellido()+eMaria.getCedula());
//        
//    }
//    
//}
//    public class file {
//    public static void main(String[] args) throws IOException {
//        try {
//            FileWriter writer=new FileWriter("mi archivo.txt");
//            writer.write("Hola");
//            writer.close();
////            
//            FileReader reader=new FileReader("mi archivo.txt");
//            BufferedReader bufferedReader=new BufferedReader(reader);
//            String linea;
//            while((linea=bufferedReader.readLine())!=null){
//                System.out.println(linea);
//            }
//            bufferedReader.close();
//            reader.close();
//        } catch (IOException e) {
//            System.out.println("Error al manejar el fichero"+e.getMessage());
//        }
//    }
// }
//   }  

    
