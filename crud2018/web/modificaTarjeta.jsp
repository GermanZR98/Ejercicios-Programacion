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
        <% request.setCharacterEncoding("UTF-8");%>
        <div>

            <br><br>
            <div>
                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud3", "root", "");
                    Statement s2 = conexion2.createStatement();

                    ResultSet listado2 = s2.executeQuery("SELECT * FROM localidades");
                %>
                <div class="names2">Modificación de socio</div>
                <form method="get" action="grabaTarjetaModificada.jsp">
                    <div class="names"> 
                        <label>&nbsp;&nbsp;ID:&nbsp;</label><input type="text" size="5" name="socio_id" value="<%= Integer.valueOf(request.getParameter("socio_id"))%>" readonly>
                    </div>
                    <div class="names">
                        <td><select name="localidad_id" >
                                <%
                                    while (listado2.next()) {
                                        out.println("<option value='" + listado2.getString("localidad_id") + "'>" + listado2.getString("nombre_localidad") + "</option>");
                                    }
                                %>

                            </select></td>
                    </div>
                    <!-----------------------------------FORMULARIO---------------------------------------------------->
                    <div class="names">
                        <label>&nbsp;&nbsp;Nombre:&nbsp;</label><input type="text" size="30" name="nombre" value="<%= request.getParameter("nombre")%>">
                        <label>&nbsp;&nbsp;Tipo Somático:&nbsp;</label><input type="text" size="15" name="tipo_somatico" value="<%= request.getParameter("tipo_somatico")%>">
                    </div>
                    <div class="names">
                        <label>&nbsp;&nbsp;Peso:&nbsp;</label><input type="text" name="peso" size="5" value="<%= Double.valueOf(request.getParameter("peso"))%>">
                    </div>
                    <hr>
                    <button <a href="index.jsp" class="t1" type="submit">Cancelar</button</a>
                    <button class="t1" type="submit">Aceptar</button><br><br>
                </form>
            </div>
        </div>
    </body>
</html>
