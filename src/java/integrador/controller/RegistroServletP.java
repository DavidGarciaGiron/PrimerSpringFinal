
package integrador.controller;

import integrador.bean.RegistroModelo;
import integrador.dao.RegistroDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistroServletP extends HttpServlet {

   
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
     
            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String ruc = request.getParameter("ruc");
            String password = request.getParameter("password");
            String tipo = request.getParameter("tipo");

            RegistroModelo registerBean = new RegistroModelo();
           
            registerBean.setNombres(nombre);
            registerBean.setEmail(email);
            registerBean.setRuc_dni(ruc);
            registerBean.setPassword(password); 
            registerBean.setTipo(tipo);

            RegistroDao registerDao = new RegistroDao();

            
            String userRegistered = registerDao.registerUser(registerBean);

            if(userRegistered.equals("SUCCESS")){
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
            }else{
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/RegistroP.jsp").forward(request, response);
            }    
        
        
        
    }
}
