package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Login</title>\n");
      out.write("<script> \n");
      out.write("function validate()\n");
      out.write("{ \n");
      out.write("var dni = document.form.dni.value; \n");
      out.write("var password = document.form.password.value;\n");
      out.write("if (dni==null || dni==\"\")\n");
      out.write("{ \n");
      out.write("alert(\"Dni no puede estar en blanco\"); \n");
      out.write("return false; \n");
      out.write("}\n");
      out.write("else if(password==null || password==\"\")\n");
      out.write("{ \n");
      out.write("alert(\"Password no puede estar en blanco\"); \n");
      out.write("return false; \n");
      out.write("} \n");
      out.write("}\n");
      out.write("</script> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div style=\"text-align:center\"><h1>Login application in Java using MVC and MySQL </h1> </div>\n");
      out.write("<br>\n");
      out.write("<form name=\"form\" action=\"LoginServlet\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("<!-- Do not use table to format fields. As a good practice use CSS -->\n");
      out.write("<table align=\"center\">\n");
      out.write(" <tr>\n");
      out.write("<td>Tipo de Usuario</td>\n");
      out.write("<td><select name=\"tipo\">\n");
      out.write("  <option value=\"cliente\">Cliente</option>\n");
      out.write("  <option value=\"proveedor\">Proveedor</option>\n");
      out.write("</select></td>\n");
      out.write("</tr>   \n");
      out.write("<tr>\n");
      out.write("<td>Dni</td>\n");
      out.write("<td><input type=\"text\" name=\"dni\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Contraseña</td>\n");
      out.write("<td><input type=\"password\" name=\"password\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr> <!-- refer to the video to understand request.getAttribute() -->\n");
      out.write("<td><span style=\"color:red\">");
      out.print((request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage"));
      out.write("</span></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td><input type=\"submit\" value=\"Login\"></input><input\n");
      out.write("type=\"reset\" value=\"Reset\"></input></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
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
