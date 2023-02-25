<HTML>
<HEAD>
<link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
       <BODY>
       <?php
            include "connect_Mysql.php";
            $cod_filme = $_POST["cod_filme"];
            $consulta = mysql_query ("SELECT * FROM filmes WHERE cod_filme = $cod_filme;");

            if($consulta == false) {
               echo "Filme não existe!";
               include "AlteraFil.php";

             } else {
               while($camp =@mysql_fetch_array($consulta)){
               $cod_filme= $camp["cod_filme"];
               $titulo = $camp["titulo"];
               $nome_categoria = $camp["nome_categoria"];

               }
            }
            print(mysql_error());     //mysql_error ->  Retorna o texto da mensagem de erro da operação anterior do MySQL

         // Resultados na tela
         echo "<b>Código do filme:</b> $cod_filme<br />";
         echo "<b>Titulo:</b> $titulo<br />";
         echo "<b>Categoria:</b> $nome_categoria";

       ?>
       </BODY>
       <table align = "center" border="1" width= 60% bordercolor= white >
       <td>
       <table align="center">

       <form method="POST" action="atualizarFil.php">

       <tr>
       <input type="hidden" value="atual" name="atualizarFil.php">
           <td align="right">
           Código do Filme:
        </td>
        <td>
           <input type="text" name="cod_filme" maxlength="80" size="20" value="<?php echo $cod_filme;?>"><br>
        </td>
       </tr>

        < tr>
           <td align="right">
           Título:
        </td>
        <td>
           <input type="text" name="titulo" maxlength="80" size="20"  value="<?php echo $titulo;?>"><br>
        </td>
        </tr>

        <tr>
           <td align="right">
           Categoria:
        </td>
        <td>
           <input type="text" name="nome_categoria" maxlength="80" size="20" value="<?php echo $nome_categoria;?>"><br>
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
