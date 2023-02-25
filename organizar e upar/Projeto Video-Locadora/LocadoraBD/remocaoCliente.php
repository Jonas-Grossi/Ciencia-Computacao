<HTML>
<HEAD>
 <TITLE>Documento PHP</TITLE>
 <link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
<BODY>
       <table border="1" width= 60% bordercolor= white >
       <td>
       <?php
            include "connect_Mysql.php";
            $cod_cliente = $_POST["cod_cliente"];
            $consulta =mysql_query("SELECT cod_cliente FROM cliente WHERE cod_cliente = $cod_cliente");
            if($consulta == TRUE) {
               foreach($_POST as $valor) {
                         echo $valor;
                }
            }
            $sql = "DELETE FROM cliente WHERE cod_cliente = $cod_cliente";
            $resultado = mysql_query($sql);
            if($resultado == FALSE) {
                         echo "Nenhum registro foi deletado...";

            } else {
                          echo "Arquivo deletado com sucesso!<br /><br />";
                          echo "<font color=red><b>
                          DELETE FROM cliente WHERE cod_cliente = $cod_cliente </b></font> ";
                          echo "<br /><br /><a href=\"MenuAdmin.php\">Voltar</a>";
            }

      ?>
</td>
</table>
</BODY>
</HTML>
