
package integrador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import integrador.bean.RegistroModelo;
import integrador.db.ConexionDB;

public class RegistroDao {
    
     public String registerUser(RegistroModelo registerBean)
 {
 String nombre = registerBean.getNombres();
 String apellido = registerBean.getApellidos();
 String email = registerBean.getEmail();
 String ruc = registerBean.getRuc_dni();
 String password = registerBean.getPassword();
 String tipo = registerBean.getTipo();
 
 Connection con = null;
 PreparedStatement preparedStatement = null;
 
 try
 {
 con = ConexionDB.createConnection();
 String query = "insert into usuarios(id_usuario,nombres,apellidos,email,ruc_dni,passwords,tipo) values (NULL,?,?,?,?,?,?)"; 
 preparedStatement = con.prepareStatement(query); 
 preparedStatement.setString(1, nombre);
 preparedStatement.setString(2, apellido);
 preparedStatement.setString(3, email);
 preparedStatement.setString(4, ruc);
 preparedStatement.setString(5, password);
 preparedStatement.setString(6, tipo);

 
 int i= preparedStatement.executeUpdate();

 if (i!=0)  
 return "SUCCESS";}
 catch(SQLException e){
 e.printStackTrace();
 }
 return "Oops.. Something went wrong there..!"; 
 }
}
