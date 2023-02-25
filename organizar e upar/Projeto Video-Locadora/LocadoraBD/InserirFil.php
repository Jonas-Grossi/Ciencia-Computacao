<html>
<head>
      <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
      <table align = center bordercolor = white border = "1" width = 60%>
      <td>
<?php
     include "connect_Mysql.php";
     $cod_filme = $_POST["cod_filme"];
     $titulo = $_POST["titulo"];
     $nome_categoria = $_POST["nome_categoria"];

     $query =mysql_query(" INSERT INTO filmes (cod_filme, titulo, nome_categoria)
                        VALUES('$cod_filme', '$titulo','$nome_categoria')");

     if($_POST["cod_filme"] == "") {
                    echo "<p><font color='red'>Campo código não inserido!</font>";
                    $rsp == FALSE;
            }else if($_POST["titulo"] == "") {
                   echo "<p><font color='red'>Campo título não inserido!</font>";
                   $rsp == FALSE;
            } else if($_POST["nome_categoria"] == "") {
                   echo "<p><font color='red'>Campo gênero não inserido!</font>";
                   $rsp == FALSE;
            }

            if($query == TRUE) {
                    echo "<p>Operação realizada com sucesso!<br /><br />";
                    echo "<font color=red><b>
                    INSERT INTO filmes (cod_filme, titulo, nome_categoria)
                        VALUES($cod_filme, '$titulo','$nome_categoria')</b></font>";
                    echo "<br /><br /><a href=\"MenuAdmin.php\">Voltar</a>";


            } else {
                    echo "<p><font color='red'>Erro ao incluir os dados no BD!</font>";
            }

            ?>
        </td>
        </table>
       </BODY>
</HTML>


