<%-- 
    Document   : RespuestaFormulario
    Created on : 5/10/2018, 03:21:14 PM
    Author     : proteco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Respuesta</h1>
        <h1>Tu nombre es</h1>
        <%String s = request.getParameter("nombre");
            String con = "123";
            
        %>
        <%= s %>
        <%
            String cont = request.getParameter("nombre");
            if(cont.equals(con)){
        %>
        <h2>Accediste</h2>
        <%}else{%>
        <h2>Contraseña Incorrecta</h2>
        <%}
            int x=Integer.parseInt(request.getParameter("x"));
            int y=Integer.parseInt(request.getParameter("y"));
        %>
        
        <h2>La mult es</h2><%= x*y %>
    </body>
</html>
