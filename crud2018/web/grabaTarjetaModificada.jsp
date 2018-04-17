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
        <div class="tomate"><h2>Actualizacion completada</h2></div>
        <STYLE>A {text-decoration: none;} </STYLE>
        
        <!------------------------------CONEXIÓN-------------------------------->
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud3", "root", "");
            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");

            String actualizacion = "UPDATE estructura_gym SET "
                    + "localidad_id='" + request.getParameter("localidad_id")
                    + "', nombre='" + request.getParameter("nombre")
                    + "', tipo_somatico='" + request.getParameter("tipo_somatico")
                    + "', peso=" + Double.valueOf(request.getParameter("peso"))
                    + " WHERE socio_id=" + Integer.valueOf(request.getParameter("socio_id"));
            s.execute(actualizacion);

            conexion.close();
        %>
        
        <!----------------------FIN DE LA CONEXIÓN------------------------------>
        <br>
        <div class="tomate">
            <a href="index.jsp" type="submit" >Página principal</a>
        </div>
    </body>
</html>