/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class el10 {
    private int id_live;
    private String name;
    private int money;

    public el10() {
    }

    public el10(int id_live, String name, int money) {
        this.id_live = id_live;
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getId_live() {
        return id_live;
    }

    public void setId_live(int id_live) {
        this.id_live = id_live;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
    return "ID: " + id_live + ", Name: " + name + ", Money: " + money;
    }

    public ArrayList<el10> listaobj() {
        ArrayList<el10> listadoCarreras = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement consulta = null;
        ResultSet resultado = null;

        try {
            ConnectionDB connectionDB = new ConnectionDB();
            conexion = connectionDB.getConnection();

            String sql = "SELECT * FROM live";
            consulta = conexion.prepareStatement(sql);
            resultado = consulta.executeQuery();

            while (resultado.next()) {
                el10 obj10 = new el10();
                obj10.setId_live(resultado.getInt("id_live"));
                obj10.setName(resultado.getString("name_npc"));
                obj10.setMoney(resultado.getInt("money"));
                listadoCarreras.add(obj10);
            }

        } catch (SQLException ex) {
            Logger.getLogger(el10.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoCarreras;
    }


    public void insertarDatos(int id_live, String name, int money) {
    Connection conexion = null;
    PreparedStatement consulta = null;

    try {
        ConnectionDB connectionDB = new ConnectionDB();
        conexion = connectionDB.getConnection(); 

        String sql = "INSERT INTO live (id_live, name_npc, money) VALUES (?, ?, ?)";
        consulta = conexion.prepareStatement(sql);
        consulta.setInt(1, id_live);
        consulta.setString(2, name);
        consulta.setInt(3, money);
        consulta.executeUpdate();

        System.out.println("Datos insertados correctamente.");

    } catch (SQLException ex) {
        Logger.getLogger(el10.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    public void actualizar (int id,String name,int cant){
        Connection conexion = null;
        PreparedStatement consulta = null;
        try {
            ConnectionDB connectionDB = new ConnectionDB();
            conexion = connectionDB.getConnection();

            String sql = "UPDATE live SET name_npc = ?, money = ? WHERE id_live = ?";
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, name);
            consulta.setInt(2, cant);
            consulta.setInt(3, id);
            consulta.executeUpdate();

            System.out.println("Datos actualizados correctamente.");

        } catch (SQLException ex) {
            Logger.getLogger(el10.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
    public void eliminacion(int id){
        Connection conexion = null;
        PreparedStatement consulta = null;

        try {
            ConnectionDB connectionDB = new ConnectionDB();
            conexion = connectionDB.getConnection();

            String sql = "delete from live where id_live = ?";
            consulta = conexion.prepareStatement(sql);

            consulta.setInt(1, id);
            int filasAfectadas = consulta.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Datos borrados correctamente.");
            } else {
                System.out.println("No se encontró ningún registro con el ID especificado.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(el10.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    }
