<%-- 
    Document   : HomeProveedor
    Created on : 11-oct-2018, 13:54:00
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOME</title>
        
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
            integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
            crossorigin="anonymous">
        <link rel="shortcut icon" href="img/Icon.png" type="image/png">
        
    </head>
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
    <body>
        <div class="marco">
     <center><h2>PAGINA PRINCIPAL CLIENTE</h2></center>
     BIENVENIDO <%=request.getAttribute("userName") %> <!-- Refer to the video to understand how this works -->
     <div style="text-align: right"><a href="LogoutServlet">CERRAR SECIÓN</a></div>
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
