<html>
<head>
      <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
     <table align = center bordercolor = white border = "1" width = 60%>
     <td>
<?php
     include "connect_Mysql.php";
     $nome_categoria = $_POST["nome_categoria"];

     $consulta =mysql_query(" INSERT INTO categoria (nome_categoria)
                        VALUES('$nome_categoria')");

    if($_POST["nome_categoria"] == "") {
                   echo "<p><font color='red'>Campo g�nero n�o inserido!</font>";
                   $rsp= FALSE;
    }
    if($consulta == TRUE) {
             echo "<p>Opera��o realizada com sucesso!";
             echo "<br /><br /><a href=\"MenuAdmin.php\">Voltar</a>";
       
    } else {
             echo "<p><font color='red'>Erro ao incluir os dados no BD!</font>";
    }

?>
</td>
</table>
</BODY>
</HTML>


