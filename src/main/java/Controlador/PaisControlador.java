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
    public void insertarPais(Pais p) {
        //1.- UTILIZAR EXCEPCIÓN
        try {//LANZAR TESTEAR UN CONJUNTO DE CÓDIGO 
            String sentenciaSQL = "INSERT INTO Paises(nombre,capital)values "
                    + "('" + p.getNombre() + "','" + p.getCapital() + "');";
            ejecutar = conectado.prepareCall(sentenciaSQL);
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
    ArrayList<String[]> paises = obtenerPaises();
    Object[] nombrePaises = new Object[paises.size()];

    for (int i = 0; i < paises.size(); i++) {
        String id = paises.get(i)[0];     
        String nombre = paises.get(i)[1];  
        String capital = paises.get(i)[2]; 
        nombrePaises[i] = nombre;
        System.out.println(id + " - " + nombre + " - " + capital);
    }
    System.out.println(" ");
    JOptionPane.showInputDialog(
            null,
            "Selecciona tu país de residencia:",
            "Lista Desplegable",
            JOptionPane.QUESTION_MESSAGE,
            null,
            nombrePaises,
            nombrePaises[0]);
}

public void actualizarPais(Pais p) {
    try {
        String sentenciaSQL = "UPDATE Paises SET capital = '" + p.getCapital() + "' WHERE nombre = '" + p.getNombre() + "';";
        
        ejecutar = conectado.prepareCall(sentenciaSQL);
        int res = ejecutar.executeUpdate();
        
        if (res > 0) {
            System.out.println(" País actualizado correctamente ");
            ejecutar.close();
        } else {
            System.out.println(" No se realizó ningún cambio(" + p.getNombre() + ")");
        }
        conectado.close();
        
    } catch (SQLException e) {
        System.out.println("Ocurrió un fallo al actualizar " + e.getMessage());
    }
}
    
        
public void eliminarPais(Pais p) {
    try {
        String sentenciaSQL = "DELETE FROM Paises WHERE nombre = '" + p.getNombre() + "';";
        
        ejecutar = conectado.prepareCall(sentenciaSQL);
        int res = ejecutar.executeUpdate();
        
        if (res > 0) {
            System.out.println(" País " + p.getNombre() + " eliminado con éxito.");
        } else {
            System.out.println("No se pudo eliminar, verifique si el nombre existe.");
        }
        ejecutar.close();
    } catch (SQLException e) {
        System.out.println("al eliminar: " + e.getMessage());
    }
}
    
}

 


