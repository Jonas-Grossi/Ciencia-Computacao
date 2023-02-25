<HTML>
<HEAD>
  <link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
       <BODY>
       <table align = "center" border="1" width= 60% bordercolor= white >
        <td>
       <?php
            include "connect_Mysql.php";
            $cod_filme = $_POST["cod_filme"];
            $titulo = $_POST["titulo"];
            $nome_categoria= $_POST["nome_categoria"];

            $consulta = mysql_query( "UPDATE filmes SET cod_filme='$cod_filme'  titulo='$titulo',
            nome_categoria='$nome_categoria'
            WHERE cod_filme='$cod_filme'");

            $verificacao = mysql_query($consulta) or die ("ERRO: " . mysql_error());
            if($verificacao==true) {
                             echo "<p>Dados do Cliente alterados";
            }

       ?>
       </td>
       </table>
       </BODY>
</HTML>
