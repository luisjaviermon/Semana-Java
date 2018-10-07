<%-- 
    Document   : formulario
    Created on : 5/10/2018, 03:13:46 PM
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
        <h1>Formulario</h1>
        <form action="Respuesta.java" method="post">
            <h2>Nombre: </h2><br>
            <input type="text" name="nombre" required><br>
            <h2>Contraseña</h2>
            <input type="password" name="contrasena" required><br>
            <h2>dame dos numeros</h2>
            <input type="text" name="x" required><br>
            <input type="text" name="y" required><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
