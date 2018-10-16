
package integrador.controller;

import integrador.bean.LoginModelo;
import integrador.dao.LoginDao;
import integrador.db.ConexionDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


public class LoginServlet extends HttpServlet {
    
    public LoginServlet(){
    }
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String usuario = request.getParameter("dni");
        String password = request.getParameter("password");
        String tipo = request.getParameter("tipo");
        String nombre = "" ;
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet2 = null;
        
        try {
            con = ConexionDB.createConnection(); 
            statement = con.createStatement(); 
            resultSet2 = statement.executeQuery("select nombres from usuarios where ruc_dni ='"+usuario+"'");
            while(resultSet2.next()) {
                nombre = resultSet2.getString("nombres");
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        
        LoginModelo loginBean = new LoginModelo(); 
        loginBean.setRuc_dni(usuario);
        loginBean.setPassword(password);
        loginBean.setTipo(tipo);
        LoginDao loginDao = new LoginDao(); 
        String userValidate = loginDao.authenticateUser(loginBean); 
        String vista;
        
        if(tipo.equals("proveedor")){
            vista = "/HomeProveedor.jsp";
        }else{
            vista = "/Home.jsp";
        }
        
        
        if(userValidate.equals("SUCCESS")) 
        {
        request.setAttribute("userName", nombre); 
        request.getRequestDispatcher(vista).forward(request, response);
        }
        else
        {
        request.setAttribute("errMessage", userValidate); 
        request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
        }

    }




