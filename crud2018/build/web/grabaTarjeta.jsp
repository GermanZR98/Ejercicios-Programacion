<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="css/estilos.css">
        <title>Zambrana´s GYM</title>
        
    </head>
  <body>
      <!-----------------------------CONEXION----------------------------------->
      
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud3","root", "");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      
      //---------------------COMPROBACÓN DE LA TARJETA--------------------------
      
  

      String consultaNumSocio = "SELECT * FROM estructura_gym WHERE socio_id="
                                + Integer.valueOf(request.getParameter("socio_id"));      
      
      ResultSet numeroDeSocios = s.executeQuery (consultaNumSocio);
      numeroDeSocios.last();
      
      if (numeroDeSocios.getRow() != 0) {
        out.println("Lo siento, no se ha podido dar de alta, ya existe una tarjeta con el número "
                    + request.getParameter("socio_id") + ".");
      } else {
        String insercion = "INSERT INTO estructura_gym VALUES (" 
                           + Integer.valueOf(request.getParameter("socio_id"))
                           + ", '" + Integer.valueOf(request.getParameter("localidad"))
                           + "', '" + request.getParameter("nombre")
                           + "', '" + request.getParameter("tipo_somatico")
                           + "', " + Double.valueOf(request.getParameter("peso")) + ")";
        s.execute(insercion);

        
      }
      conexion.close();
    %>
    
    
    <!------------------------FIN DE LA CONEXIÓN----------------------------->
    
    
    <br>
    <div class="tomate">
      <h2>Socio dada de alta correctamente.</h2><br>
    <a href="index.jsp"><span></span> Página principal</a>
    </div>
  </body>
</html>