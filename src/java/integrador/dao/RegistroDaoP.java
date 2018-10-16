/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador.dao;

import integrador.db.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import integrador.bean.RegistroModelo;
/**
 *
 * @author DIEGO
 */
public class RegistroDaoP {
    
  public String registerUser(RegistroModelo registerBean)
 {
 String nombre = registerBean.getNombres();
 String email = registerBean.getEmail();
 String ruc = registerBean.getRuc_dni();
 String password = registerBean.getPassword();
 String tipo = registerBean.getTipo();
 
 Connection con = null;
 PreparedStatement preparedStatement = null;
 
 try
 {
 con = ConexionDB.createConnection();
 String query = "insert into usuarios(id_usuario,nombres,apellidos,email,ruc_dni,passwords,tipo) values (NULL,?,NULL,?,?,?,?)"; 
 preparedStatement = con.prepareStatement(query); 
 preparedStatement.setString(1, nombre);
 preparedStatement.setString(2, email);
 preparedStatement.setString(3, ruc);
 preparedStatement.setString(4, password);
 preparedStatement.setString(5, tipo);

 
 int i= preparedStatement.executeUpdate();

 if (i!=0)  
 return "SUCCESS";}
 catch(SQLException e){
 e.printStackTrace();
 }
 return "Oops.. Something went wrong there..!"; 
 }
 }

