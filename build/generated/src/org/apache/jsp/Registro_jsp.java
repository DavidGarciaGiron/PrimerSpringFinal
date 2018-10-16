package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<pre>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Registro</title>\n");
      out.write("<script>\n");
      out.write("function validate()\n");
      out.write("{\n");
      out.write("var nombres = document.form.nombre.value;\n");
      out.write("var apellido = document.form.apellido.value;\n");
      out.write("var email = document.form.email.value;\n");
      out.write("var ruc = document.form.ruc.value;\n");
      out.write("var password = document.form.password.value;\n");
      out.write("var conpassword= document.form.conpassword.value;\n");
      out.write("\n");
      out.write("if (nombres==null || nombres==\"\")\n");
      out.write("{\n");
      out.write("alert(\"Nombre no puede estar en blanco\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if (email==null || email==\"\")\n");
      out.write("{\n");
      out.write("alert(\"Email no puede estar en blanco\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if (ruc==null || ruc==\"\")\n");
      out.write("{\n");
      out.write("alert(\"Ruc no puede estar en blanco\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if(password.length<6)\n");
      out.write("{\n");
      out.write("alert(\"Por favor ingrese una contraseña mayor a 6 caracteres.\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if (password!=conpassword)\n");
      out.write("{\n");
      out.write("alert(\"La confimación de la contraseña no coincide\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if(apellido==null || apellido==\"\"){\n");
      out.write(" alert(\"Apellido no puede estar en blanco\");   \n");
      out.write(" return false;   \n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center><h2>Registro de Usuario</h2></center>\n");
      out.write("<form name=\"form\" action=\"RegistroServlet\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("<table align=\"center\">\n");
      out.write("<tr>\n");
      out.write("    <td>Nombre</td>\n");
      out.write("    <td><input type=\"text\" name=\"nombre\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Apellido</td>\n");
      out.write("    <td><input type=\"text\" name=\"apellido\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Email</td>\n");
      out.write("    <td><input type=\"text\" name=\"email\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Dni</td>\n");
      out.write("    <td><input type=\"text\" name=\"ruc\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Password</td>\n");
      out.write("    <td><input type=\"password\" name=\"password\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Confirm Password</td>\n");
      out.write("    <td><input type=\"password\" name=\"conpassword\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><input type=\"hidden\" name=\"tipo\" value=\"cliente\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>");
      out.print((request.getAttribute("errMessage") == null) ? ""
    : request.getAttribute("errMessage"));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td></td>\n");
      out.write("    <td><input type=\"submit\" value=\"Register\"></input><input\n");
      out.write("    type=\"reset\" value=\"Reset\"></input></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
