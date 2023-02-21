/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author maike
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultasProducto extends Conexion{
    /*FUNCION PARA CONSULTAR PRODUCTOS*/
    public boolean registrar(Producto pro){
        PreparedStatement ps=null;
        Connection con=getConexion();
        
        String sql = "INSERT INTO producto (codigo, nombre, precio, cantidad) VALUES (?,?,?,?)";
        
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getCantidad());
            ps.execute();
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
            con.close();
        }catch (SQLException e){
                System.err.println(e);
        }
    }      
}
    /* Fin de Registrar(Producto)*/
    
/*FUNCION PARA MODIFICAR PRODUCTOS*/    
    
public boolean modificar(Producto pro){
    PreparedStatement ps =null;
    Connection con =getConexion();
    
    String sql = "UPDATE producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE id=?";
    
    try{
        ps=con.prepareStatement(sql);
        ps.setString(1, pro.getCodigo());
        ps.setString(2, pro.getNombre());
        ps.setDouble(3, pro.getPrecio());
        ps.setInt(4, pro.getCantidad());
        ps.setInt(5, pro.getId());
        ps.execute();
        return true;
    }catch(SQLException e){
        System.err.println(e);
        return false;
    }finally{
        try{
            con.close();
        }catch(SQLException e){
            System.err.println(e);
        }
    }
}

/*FIN DE MODIFICAR PRODUCTO
}
