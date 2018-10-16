<%-- 
    Document   : Login
    Created on : 02-oct-2018, 6:43:42
    Author     : DIEGO
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>INICIO DE SESION</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
            integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
            crossorigin="anonymous">
        <link rel="shortcut icon" href="img/Icon.png" type="image/png">
<script> 
    
function validate()
{ 
var dni = document.form.dni.value; 
var password = document.form.password.value;
if (dni==null || dni=="")
{ 
alert("Dni no puede estar en blanco"); 
return false; 
}
else if(password==null || password=="")
{ 
alert("Password no puede estar en blanco"); 
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
            padding: 10%;
            margin-top: 10%;
        }

        
        
        

    </style>
</head>
<body>
    <div class="marco">
<div style="text-align:center"><h1>INICIAR SECIÓN BLOCKCHAIN-TRASPORTE</h1> </div>
<br>
<form name="form" action="LoginServlet" method="post" onsubmit="return validate()">
<!-- Do not use table to format fields. As a good practice use CSS -->
<table align="center">
 <tr>
     <td><label>Tipo de Usuario</label></td>
<td><select name="tipo" class="form-control">
  <option value="cliente" class="form-control">Seleccione</option>
  <option value="cliente" class="form-control">Cliente</option>
  <option value="proveedor" class="form-control">Proveedor</option>
</select></td>
</tr>   
<tr>
    <td><label>Dni o Ruc</label></td>
<td><input type="text" name="dni" class="form-control"/></td>
</tr>
<tr>
    <td><label>Contraseña</label></td>
<td><input type="password" name="password" class="form-control"/></td>
</tr>
<tr> <!-- refer to the video to understand request.getAttribute() -->
<td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? "": request.getAttribute("errMessage")%></span></td>
</tr>
<tr>

<td colspan="2"><input type="submit" value="INGRESAR" class="btn btn-success btn-lg btn-block"></td>
</tr>
<tr>
   
    
    <td colspan="2"><a href="index.jsp" class="btn btn-success btn-lg btn-block">VOLVER</a></td>
</tr>
</table>
</form>
    </div>
 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" 
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" 
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" 
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" 
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" 
        crossorigin="anonymous"></script>
</body>
</html>