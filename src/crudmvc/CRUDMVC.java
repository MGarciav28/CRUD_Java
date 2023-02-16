/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmvc;

import Modelo.Conexion;
/**
 *
 * @author maike
 */
public class CRUDMVC {
    public static void main(String[] args) {
     Conexion nueva = new Conexion(); 
     nueva.getConexion();
    }
    
}