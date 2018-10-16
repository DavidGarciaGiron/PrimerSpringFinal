<%-- 
    Document   : RegistroP
    Created on : 11-oct-2018, 14:03:50
    Author     : DIEGO
--%>
<pre><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
            integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
            crossorigin="anonymous">
        <link rel="shortcut icon" href="img/Icon.png" type="image/png">
<title>Registro de Empresas</title>
<script>
function validate()
{
var nombres = document.form.nombre.value;
var email = document.form.email.value;
var ruc = document.form.ruc.value;
var password = document.form.password.value;
var conpassword= document.form.conpassword.value;

if (nombres==null || nombres=="")
{
alert("Nombre no puede estar en blanco");
return false;
}
else if (email==null || email=="")
{
alert("Email no puede estar en blanco");
return false;
}
else if (ruc==null || ruc=="")
{
alert("Ruc no puede estar en blanco");
return false;
}
else if(password.length<6)
{
alert("Por favor ingrese una contraseña mayor a 6 caracteres.");
return false;
}
else if (password!=conpassword)
{
alert("La confimación de la contraseña no coincide");
return false;
}
}
</script>

 <style>

        body{
            background-image: url("img/fondo.jpg");
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;   
            color: white;
            padding-left: 20%;
            padding-right: 20%;
            
        }
        h2{
            color: white;
        }
        label{
            margin-right: 20%;
        }
        table{
            width: 40%;
            
        }
        .marco{
            background: rgba(20, 130, 160, 0.8); 
        }

        
        
        

    </style>
</head>
<body>
<div class="marco">
<center><h2>Registro de Proveedor</h2></center>
<form name="form" action="RegistroServletP" method="post" onsubmit="return validate()">
<table align="center">
<tr>
    <td><label>Nombre Empresa</label></td>
    <td><input type="text" name="nombre" class="form-control"/></td>
</tr>
<tr>
    <td><label>Ruc</label></td>
    <td><input type="text" name="ruc" class="form-control"/></td>
</tr>
<tr>
    <td><label>Email</label></td>
    <td><input type="text" name="email" class="form-control"/></td>
</tr>
<tr>
    <td><label>Password</label></td>
    <td><input type="password" name="password" class="form-control"/></td>
</tr>
<tr>
    <td><label>Confirm Password</label></td>
    <td><input type="password" name="conpassword" class="form-control"/></td>
</tr>
<tr>
    <td><input type="hidden" name="tipo" value="proveedor"/></td>
</tr>
<tr>
    <td><%=(request.getAttribute("errMessage") == null) ? ""
    : request.getAttribute("errMessage")%></td>
</tr>
<br><br>
<tr>
   
    <td></td>
    <td></td>
</tr>
<tr>
   
    <td colspan="2"><input type="submit" value="REGISTER" class="btn btn-success btn-lg btn-block"></td>
    
</tr>
<tr>
   
    
    <td colspan="2"><a href="index.jsp" class="btn btn-success btn-lg btn-block">VOLVER</a></td>
</tr>
</table>
</form>
 
</body>
</html>