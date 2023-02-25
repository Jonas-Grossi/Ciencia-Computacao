<html>
<head>
      <link rel="stylesheet" type="text/css" href="style.css">
</head
<body>
 <table align = center bordercolor = white border = "1" width = 60%>
 <td>
<?php
     include "connect_Mysql.php";
     $nome_ator = $_POST["nome_ator"];
     $data_nasc = $_POST["data_nasc"];
     $cod_filme = $_POST["cod_filme"];

     $query =mysql_query(" INSERT INTO ator (nome_ator,data_nasc,cod_filme)
                        VALUES('$nome_ator','$data_nasc','$cod_filme')");

     if($_POST["nome_ator"] == "") {
                    echo "<p><font color='red'>Campo código não inserido!</font>";
                    $rsp == FALSE;
            }else if($_POST["data_nasc"] == "") {
                   echo "<p><font color='red'>Campo título não inserido!</font>";
                   $rsp == FALSE;
            } else if($_POST["cod_filme"] == "") {
                   echo "<p><font color='red'>Campo gênero não inserido!</font>";
                   $rsp == FALSE;
            }

            if($query == TRUE) {
                    echo "<p>Operação realizada com sucesso!<br /><br />";
                    echo "<font color=red><b>
                    INSERT INTO ator (nome_ator,data_nasc,cod_filme)
                        VALUES('$nome_ator','$data_nasc','$cod_filme')</b></font>";
                    echo "<br /><br /><a href=\"MenuAdmin.php\">Voltar</a>";
            } else {
                    echo "<p><font color='red'>Erro ao incluir os dados no BD!</font>";
            }

            ?>
       </td>
       </table>
       </BODY>
</HTML>


