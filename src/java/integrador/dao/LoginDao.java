
package integrador.dao;

import integrador.bean.LoginModelo;
import integrador.db.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginDao {
    
    public String authenticateUser(LoginModelo loginBean)
{
    String usuario = loginBean.getRuc_dni(); 
    String password = loginBean.getPassword();
    String tipo = loginBean.getTipo();
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
    ResultSet resultSet2 = null;
    String userNameDB = "";
    String passwordDB = "";
    String tipoDB = "";
    String nombre = "";
    try{
        con = ConexionDB.createConnection(); 
        statement = con.createStatement(); 
        resultSet = statement.executeQuery("select ruc_dni,passwords,tipo from usuarios"); 
        while(resultSet.next()) {
        userNameDB = resultSet.getString("ruc_dni"); 
        passwordDB = resultSet.getString("passwords");
        tipoDB = resultSet.getString("tipo");
        if(usuario.equals(userNameDB) && password.equals(passwordDB) && tipo.equals(tipoDB)) {
        return "SUCCESS"; 
        }
    } }catch(SQLException e){
    e.printStackTrace();
    }
    return "Invalid user credentials"; 
}
    
    
}

