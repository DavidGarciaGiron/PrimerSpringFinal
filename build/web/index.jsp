<%-- 
    Document   : index
    Created on : 02-oct-2018, 5:47:35
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html langn="en">
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
            integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
            crossorigin="anonymous">
        <link rel="shortcut icon" href="img/Icon.png" type="image/png">

        <title>PAGINA DE INCIO</title>
        
        
    </head>
    
    <style>
        *{
            padding: 0;
            margin: 0;
        }
        body{
            background-image: url("img/fondo.jpg");
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;        
        }
        .titulo h1{
            text-align: center;
            font-family: fantasy;
            font-size: 60px;            
        }
        .titulo p{
            text-align: center;
            font-family: initial;
            font-size: 40px;
        }
        .header{
            border-radius: 7px;
            background: rgba(20, 130, 160, 0.8);
            border: 3px black;
            border: 3px solid green;
        }
        
        .contenido1{
            width: 45%;
            float: left;
            margin-left: 4%;
            margin-rigth: 1%;
            margin-top: 5%;
            color: white;
            border: 2px solid rgba(20, 130, 160, 0.8); 
            background: rgba(45, 59, 117, .6);
            padding-right: 5%;
            
        }
        .contenido2{
            width: 45%;
            float: left;
            margin-rigth: 4%;
            margin-left: 1%;
            margin-top: 5%;
            color: white;
            border: 2px solid rgba(20, 130, 160, 0.8);
            background: rgba(19, 19, 21, .6);
            padding-right: 5%;
        }
        
        .img1{
            margin: 5%;
            
            width: 80%;
        }
        h2{
            color: blanchedalmond;
            border-bottom: 2px solid rgba(20, 130, 160, 0.8); 
            font-family: fantasy;
            margin-top: 10%;
            margin-left: 10%;
            margin-rigth: 10%;
            
            
        }
        .contenido1 p{
            font-family: fantasy;
            color: blanchedalmond;
            font-size: 24px;
            text-align: justify;
            margin-left: 10%;
            margin-rigth: 10%;
        }
        .contenido2 p{
            font-family: fantasy;
            color: blanchedalmond;
            font-size: 24px;
            text-align: justify;
            margin-left: 10%;
            margin-rigth: 10%;
        }
        a{
            margin:7%;
        }
        
        
        

    </style>
    
    <body>
        
        
            
            <div class="row header">
                <div class="col-md-8 titulo">
                    <h1>BTC - BlockChain y Transporte </h1>
                </div> 
                <div class="col-md-4">
                    <a href="Login.jsp"  class="btn btn-success">INICIAR SESION</a>
                </div>
            </div>
        
            <div class="contenido1">
                <h2>REGISTRO CLIENTE</h2>
                <hr>
                <p>El Cliente podra realizar cualquier pedido a la empresa teniendo como opciones la busqueda de diversos producto entre todo la seleccion permitida para despues poder por todo el proceso correspondiente, en la parte del cliente este podra solicitar en todo momento durante el proceso de entrega consultas acerco del estado y ubicacion del producto mediante una opcion de mensajeria que mantendra contacto entre ambas partes, pero tambien podra ver la ubicacion del producto expresado en mapas como los de google maps donde podra saber el estado donde se encuentra el producto.</p>
                <br>
                <a href="Registro.jsp"  class="btn btn-success btn-lg btn-block">REGISTRO CLIENTE</a>
            </div>     
            <div class="contenido2">
                <h2>REGISTRO PROVEEDOR</h2>
                <hr>
                <p>El Proveedor es aquel encargado que cuando inicie seccion el tendra que publicar nuevos productos segun la empresa y de lo cual el cliente podra elejir para el proceso, se planifica que el proveedor tenga la opcion de modificar los procesos y hitos que se recorren segun politica de empresa , por parte del el chat y la ubicacion es compromizo de la empresa que debe hacer lo posible para poder responder a todas las nesecidades del clente como tambien nesecidades de saber donde estan los productos en todo momento que el cliente require y el estado en el cual se encuentra.</p>
                <br>
                <a href="RegistroP.jsp"  class="btn btn-success btn-lg btn-block">REGISTRO EMPRESA</a>
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
