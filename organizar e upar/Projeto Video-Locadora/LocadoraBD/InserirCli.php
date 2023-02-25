<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<table align = center bordercolor = white border = "1" width = 60%>
<td>
<?php
     include "connect_Mysql.php";
     $cod_cliente = $_POST["cod_cliente"];
     $nome_cliente = $_POST["nome_cliente"];
     $telefone = $_POST["telefone"];
     $endereco = $_POST["endereco"];

     $query =mysql_query(" INSERT INTO cliente (cod_cliente, nome_cliente, telefone,endereco)
                        VALUES('$cod_cliente', '$nome_cliente', '$telefone','$endereco')");

     if($_POST["cod_cliente"] == "") {
                    echo "<p><font color='red'>Campo código não inserido!</font>";
                    $rsp == FALSE;
            }else if($_POST["nome_cliente"] == "") {
                   echo "<p><font color='red'>Campo título não inserido!</font>";
                   $rsp == FALSE;
            } else if($_POST["endereco"] == "") {
                   echo "<p><font color='red'>Campo gênero não inserido!</font>";
                   $rsp == FALSE;
            }

            if($query == TRUE) {
                    echo "<p>Operação realizada com sucesso!<br /><br />";
                    echo "<font color=red><b>
                     INSERT INTO cliente (cod_cliente, nome_cliente, telefone,endereco)
                                 VALUES($cod_cliente, '$nome_cliente', $telefone,'$endereco')</b></font>";
                    echo "<br /><br /><a href=\"MenuAdmin.php\">Voltar</a>";
            } else {
                    echo "<p><font color='red'>Erro ao incluir os dados no BD!</font>";
            }
            
            ?>

       </td>
       </table>
       </BODY>
       
</HTML>


