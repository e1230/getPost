<%-- 
    Document   : UsuarioVTA
    Created on : 24/08/2021, 03:54:28 PM
    Author     : Edgar
--%>

<%@page import="modelo.dto.UsuarioDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Correo</th>
                    <th>Rol</th>
                </tr>
            </thead>
            <tbody>
                <% Object lista = request.getAttribute("lista"); 
                   List<Object> list =(List) lista;
                   for(Object i: list){
                       UsuarioDTO usu = (UsuarioDTO)i;
                   
                %>
                <tr>
                    <td><% usu.getId(); %></td>
                    <td><% usu.getNombre(); %></td>
                    <td><% usu.getCorreo(); %></td>
                    <td><% usu.getRol(); %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </body>
</html>
