<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <STYLE TYPE="text/css">
        body{
            font-family: Arial;
        }
        #main-container{
            margin: 52px ;
            width: 1200px;
        }
        table{
            background-color: white;
            text-align: left;
            border-collapse: collapse;
            width: 86%;
            position: static;
            left: 90%;
            margin-left: 355px;
            top: 300%;
            margin-top: -20px;
        }
        th, td{
            padding: 20px;
        }
        thead{
            background-color: #243cd6;
            border-bottom: solid 5px #0F362D;
            color: white;
        }
        tr:nth-child(even){
            background-color: #ddd;
        }
        tr:hover td{
            background-color: #d54b80;
            color: white;
        }
        .caja1{
            background-color: #ddd;
            width: 250px;
            height: 900px;
            position: absolute;
            margin-top: 30px;
            left: 1%;
            margin-left: 60px;
            margin-right: 50px;
        }
        .caja2{
            background-color: #ddd;
            width: 300px;
            height: 930px;
            position: absolute;
            margin-top: 30px;
            left: 1%;
            margin-left: 40px;
            margin-right: 50px;
        }
    </STYLE>

</head>
<body>

<main>
    <div class="card-header my-5"></div>
    <div class="container">
        <div class="row">
            <h3 class="text-dark">LISTA DE CLIENTES</h3>
        </div>
    </div>
</main>

<div id="main-container">
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>N° Categorias</th>
            <th>N°Peliculas</th>
        </tr>
        </thead>
        <tr>
            <td>12345</td>
            <td>Mario</td>
            <td>Montaneda</td>
            <td>20152014</td>
        </tr>

    </table>
</div>



<script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>