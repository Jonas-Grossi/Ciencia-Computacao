<HTML>
<HEAD>
<link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
       <BODY>
       <?php
            include "connect_Mysql.php";
            $cod_cliente = $_POST["cod_cliente"];
            $consulta = mysql_query ("SELECT * FROM cliente WHERE cod_cliente = $cod_cliente;");

            if($consulta == false) {
               echo "Cliente não existe!";
               include "AlteraCli.php";

             } else {
               while($camp =@mysql_fetch_array($consulta)){
               $cod_cliente = $camp["cod_cliente"];
               $nome_cliente = $camp["nome_cliente"];
               $telefone = $camp["telefone"];
               $endereco = $camp["endereco"];

               }
            }
            print(mysql_error());     //mysql_error ->  Retorna o texto da mensagem de erro da operação anterior do MySQL

         // Resultados na tela
         echo "<br /><br /><b>Código do Cliente:</b> $cod_cliente <br />";
         echo "<b>Nome:</b> $nome_cliente<br />";
         echo "<b>Telefone:</b> $telefone<br />";
         echo "<b>Endereco:</b> $endereco";

       ?>
       </BODY>
       <table align = "center" border="1" width= 60% bordercolor= white >
       <td>
       <table align="center">

       <form method="POST" action="atualizarCli.php">

       <tr>
       <input type="hidden" value="atual" name="atualizarCli.php">
           <td align="right">
           Código do Cliente:
        </td>
        <td>
           <input type="text" name="cod_cliente" maxlength="80" size="20" value="<?php echo $cod_cliente;?>"><br>
        </td>
       </tr>

        < tr>
           <td align="right">
           Nome:
        </td>
        <td>
           <input type="text" name="nome_cliente" maxlength="80" size="20"  value="<?php echo $nome_cliente;?>"><br>
        </td>
        </tr>

        <tr>
           <td align="right">
           Telefone:
        </td>
        <td>
           <input type="text" name="telefone" maxlength="80" size="20" value="<?php echo $telefone;?>"><br>
        </td>
        </tr>

        <tr>
           <td align="right">
           Endereco:
           </td>
       <td>
           <input type="text" name="endereco" maxlength="80" size="20" value="<?php echo $endereco; ?>"><br>

       </td>
       </tr>

       <tr>
          <td align="center" colspan="2">
          <input type="reset" name="reset" value="Limpar" />
          <input type="submit" name="submit" value="salvar alterações"/>
          
       </td>
       </tr>
       </td>
       </table>
       </form>
       </table>


</HTML>
