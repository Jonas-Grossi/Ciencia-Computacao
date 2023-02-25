<HTML>
<HEAD>
  <TITLE>Lista</TITLE>
  <link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
<BODY>
   <table align= "center" width = 60%  border =  "1" bordercolor = white>
   <td>
<!-- exibimos, aqui, todos os dados inseridos até então no banco
("Filmes" é o nome da tabela) -->
<?php
     include "connect_Mysql.php";
     $pega_dados = mysql_query("SELECT * FROM filmes");
     echo "<font color=red><b>
     SELECT * FROM filmes<b></font><br /><br />";
     
     while($mostra_dados = mysql_fetch_array($pega_dados)){
         $cod_filme = $mostra_dados['cod_filme'];
         $titulo  = $mostra_dados['titulo'];
         $nome_categoria= $mostra_dados['nome_categoria'];


         // Resultados na tela
         echo "<br /><br /><b>Código do Filme:</b> $cod_filme<br />";
         echo "<b>Título:</b> $titulo<br />";
         echo "<b>Categoria:</b> $nome_categoria";
     }

?>
</td>
</table>
</BODY>
</HTML>
