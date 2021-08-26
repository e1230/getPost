<%-- 
    Document   : ContactoVTA
    Created on : 19/08/2021, 03:54:24 PM
    Author     : Edgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Página 1</title>
    </head>
    <body>
        <h1>Hola mundo!</h1>
        <form method="post" action="ContactoCTO?accion=crear">
            <legend>Formulario de contacto</legend>
            <fieldset>
                <label>Nombre:</label>
                <input type="text" name="txtNombre" required>
                <label>Correo:</label>
                <input type="email" name="txtCorreo" required>
                <label>Asunto:</label>
                <input type="text" name="txtAsunto" required>
                <label>Descripción:</label>
                <textarea type="text" name="txtMensaje" required></textarea>
                <input type="submit" value="Enviar comentario">
                <input type="reset" value="Limpiar">
            </fieldset>      
        </form>
    </body>
</html>
