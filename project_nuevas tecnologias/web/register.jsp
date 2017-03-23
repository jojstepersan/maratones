<%-- 
    Document   : registrer
    Created on : 19/03/2017, 03:00:05 PM
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type"   content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="css/style.css">
        <%@include file="header.jsp"%>
    </head>
    <body>
        <section>
        <form action="registro" method="POST" class="res">
            <h2>Registro</h2>
            <div class="imgcontainer">
                <img src="images/user.png" alt="User" class="user">
            </div>
            <div class="container">
                <label><strong>Nombres</strong></label>
                <input type="text" placeholder="Ingrese nombres" name="name" required>
                <label> <strong>Usuario</strong> </label>
                <input type="text" placeholder="Ingrese Usuario" name="user" required>
                <label> <strong>Contraseña</strong> </label>
                <input type="password" placeholder="Ingrese contraseña" name="pass" required>
                <label> <strong>Correo</strong> </label>
                <input type="email" placeholder="Ingrese correo valido" name="email" required>
                <label> <strong>Fecha de Nacimiento</strong> </label>
                <input type="date" name="date" required>
                <button type="submit">Registrar</button>
            </div>
            <div class="container" style="background-color:#f1f1f1">
                <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
                <span class="psw">Forgot <a href="#">password?</a></span>
            </div>
            
        </form>
        </section>
        
   
         
    </body>
</html>
