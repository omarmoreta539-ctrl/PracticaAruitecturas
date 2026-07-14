/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import MODELO.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import controlador.ConexionBDD;
import java.util.ArrayList;

/**
 *
 * @author AMARU
 */
public class PaisControlador {

//INSTANCIAR LA CONEXIÓN A LA BASE DE DATOS
    ConexionBDD conectar = new ConexionBDD();
    //CLASE QUE ME PERMITA CONECTARME DIRECTAMENTE A MYSQL
    Connection conectado = (Connection) conectar.conectar();
    //CLASE QUE ME PERMITE EJECUTAR MI SENTENCIA SQL
    PreparedStatement ejecutar;
    //OBTENER RESULTADOS DE LA CONSULTA
    ResultSet resultado;

    //MÉTODOS DE TRANSACCIONABILIDAD
  public void insertarPais(java.sql.Connection conectado, Pais p) {
        //1.- UTILIZAR EXCEPCIÓN
        try {//LANZAR TESTEAR UN CONJUNTO DE CÓDIGO 
            String sentenciaSQL = "INSERT INTO Paises(nombre,capital)values "
                    + "('" + p.getNombre() + "','" + p.getCapital() + "');";
            ejecutar = conectado.prepareCall(sentenciaSQL);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, 
                        "País Creado con éxito");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, 
                        "El País no ha sido creado,"
                        + " revise que los datos ingresados sean correctos");
            }
            conectado.close();

        } catch (SQLException e) {
            //CAPTURAR PARA DARLE UN TRATAMIENTO 
            JOptionPane.showMessageDialog(null, 
                    "Comuniquese con el Administrador para solicitar ayuda");
            System.out.println("---------------" + e);
        }
        
    }
    
  public ArrayList<String[]> obtenerPaises() {
        ArrayList<String[]> lregistros = new ArrayList<>();
        try {
            String sentenciaSQL = "select *from paises;";//slect nombre
            ejecutar = conectado.prepareCall(sentenciaSQL);
            ResultSet res = ejecutar.executeQuery();
            
         
            
            while (res.next()) {
                 String[] listaPaises = new String[3];//ArrayList<String[]> listaPaises = new ArrayList<>();
                listaPaises[0] = res.getInt("id_pais") + "";// sesult set una clase para crear objetos dentro de la posicion que se encuentra sesult set viene de libreria para consultar la base de datos
                listaPaises[1] = res.getString("nombre"); //lista dinamica estatica  istaPaises.add sin la poscicon            
                listaPaises[2] = res.getString("capital");
                lregistros.add(listaPaises);
            }
             ejecutar.close();
            conectado.close();
            return lregistros;
        } catch (SQLException e) {
            System.out.println("------" + e);
        }
            return lregistros;
    }

public void imprimirPaises() {
  System.out.println(" ");
  for (String[] pais : obtenerPaises()) {
      System.out.println(" " + pais[1]);
 
              PaisControlador pc=new PaisControlador();
        ArrayList<String[]>paises= pc.obtenerPaises();
        Object[] nombrePaises=new Object[paises.size()];
        
            for (int i = 0; i <paises.size(); i++) {
                nombrePaises[i]=paises.get(i)[1];
                System.out.println("-------"+paises.get(1)[2]);
                          
        }
       JOptionPane.showInputDialog(
                null, 
                "Selecciona tu país de residencia:", 
                "Lista Desplegable", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                nombrePaises, 
                nombrePaises[0]);
       }
  }

    public boolean actualizarPais(java.sql.Connection conectado, Pais p) {
        try {
            ejecutar = conectado.prepareStatement("UPDATE Paises SET nombre=?, capital=? WHERE id_pais=?;");
            ejecutar.setString(1, p.getNombre());
            ejecutar.setString(2, p.getCapital());
            ejecutar.setInt(3, p.getIdPais());
            
            return ejecutar.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e);
        }
        return false;
    }


    public boolean eliminarPais(java.sql.Connection conectado, int idPais) {
        try {
            ejecutar = conectado.prepareStatement("DELETE FROM Paises WHERE id_pais=?;");
            ejecutar.setInt(1, idPais);
            
            return ejecutar.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e);
        }
        return false;
    }


    }
    
        
    
      

 


