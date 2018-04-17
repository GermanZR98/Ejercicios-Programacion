package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <title>Gimnasio Germán</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"todo\">\n");
      out.write("            <div >\n");
      out.write("                <br><br>\t\t\t\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"uno\"><h2>Zambrana´s GYM</h2></div>\n");
      out.write("\n");
      out.write("                    <!-------------------- FORMULARIO PARA AÑADIR SOCIO --------------------------------------------------->\n");
      out.write("\n");
      out.write("                    ");

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud3", "root", "");
                        Statement s = conexion.createStatement();

                        ResultSet listado2 = s.executeQuery("SELECT * FROM localidades");
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <table class=\"t1\">\n");
      out.write("                        <tr><th>ID</th><th>Localidad</th><th>Nombre</th><th>Tipo Somático</th><th>Peso</th></tr>\n");
      out.write("                        <form method=\"get\" action=\"grabaTarjeta.jsp\">\n");
      out.write("                            <tr><td><input type=\"text\" name=\"socio_id\" onkeypress=\"return valida(event)\"size=\"5\"></td>\n");
      out.write("                                <td><select name=\"localidad\" >\n");
      out.write("                                        ");

                                            while (listado2.next()) {
                                                out.println("<option value='" + listado2.getString("localidad_id") + "'>" + listado2.getString("nombre_localidad") + "</option>");
                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </select></td>\n");
      out.write("\n");
      out.write("                                <td><input type=\"text\" name=\"nombre\" maxlength=\"30\" maxlength=\"30\" size=\"30\"></td>\n");
      out.write("                                <td><input type=\"text\" name=\"tipo_somatico\" maxlength=\"9\" size=\"15\"></td>\n");
      out.write("                                <td><input type=\"text\" name=\"peso\" onkeypress=\"return valida(event)\" maxlength=\"6\" size=\"5\"></td>\n");
      out.write("                                <td><button type=\"submit\" value=\"Añadir\" class=\"boton\"><span class=\"glyphicon glyphicon-plus\"></span> Añadir</button></td><td></td></tr>   \n");
      out.write("                        </form>\n");
      out.write("                        <!------------------------FIN AÑADIR SOCIO------------------------------------------------------------>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-------------------- LISTADO DE SOCIOS --------------------------------------------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                            ResultSet listado = s.executeQuery("SELECT * FROM estructura_gym");

                        
      out.write("                           \n");
      out.write("\n");
      out.write("                        ");
                            Connection conexion3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud3", "root", "");

                            while (listado.next()) {
                                out.println("<tr><td>");
                                out.println(listado.getString("socio_id") + "</td>");

                                Statement s3 = conexion3.createStatement();
                                ResultSet tipo = s3.executeQuery("SELECT nombre_localidad FROM localidades  WHERE localidad_id ='" + listado.getString("localidad_id") + "' ");

                                tipo.next();

                                String p = tipo.getString("nombre_localidad");

                                out.println("<td>" + p + "</td>");
                                out.println("<td>" + listado.getString("nombre") + "</td>");
                                out.println("<td>" + listado.getString("tipo_somatico") + "</td>");
                                out.println("<td>" + listado.getString("peso") + "</td>");
                        
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            <form method=\"get\" action=\"modificaTarjeta.jsp\">\n");
      out.write("                                <input type=\"hidden\" name=\"socio_id\" value=\"");
      out.print(listado.getString("socio_id"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"localidad_id\" value=\"");
      out.print(listado.getString("localidad_id"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"nombre\" value=\"");
      out.print(listado.getString("nombre"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"tipo_somatico\" value=\"");
      out.print(listado.getString("tipo_somatico"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"peso\" value=\"");
      out.print(listado.getString("peso"));
      out.write("\">\n");
      out.write("                                <button type=\"submit\"  class=\"boton\"><span class=\"glyphicon glyphicon-pencil\"></span> Modificar</button>\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <form method=\"get\" action=\"borraTarjeta.jsp\">\n");
      out.write("                                <input type=\"hidden\" name=\"socio_id\" value=\"");
      out.print(listado.getString("socio_id"));
      out.write("\"/>\n");
      out.write("                                <button type=\"submit\"class=\"boton\">Eliminar</button>\n");
      out.write("                            </form>\n");
      out.write("                        </td></tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!------------------------------------FIN ELIMINADO SOCIO------------------------------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"names\">German Zambrana Ruiz<br></br>\n");
      out.write("                    ✆ germangym@gmail.com</div>\n");
      out.write("            </div>\n");
      out.write("        </div>       \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!------------------------------------FUNCIONES------------------------------------->\n");
      out.write("        <script>\n");
      out.write("            function valida(e) {\n");
      out.write("                tecla = (document.all) ? e.keyCode : e.which;\n");
      out.write("\n");
      out.write("                //Tecla de retroceso para borrar, siempre la permite\n");
      out.write("                if (tecla == 8) {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Patron de entrada, en este caso solo acepta numeros\n");
      out.write("                patron = /[0-9-.]/;\n");
      out.write("                tecla_final = String.fromCharCode(tecla);\n");
      out.write("                return patron.test(tecla_final);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!------------------------------------FIN FUNCIONES------------------------------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
