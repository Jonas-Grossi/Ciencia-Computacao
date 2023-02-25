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

     $pega_dados = mysql_query("SELECT * FROM drama");
     echo "<font color=red><b>
     CREATE VIEW drama AS<br />
     SELECT *    <br />
     FROM filmes  <br />
     WHERE filmes.nome_categoria = 'Drama'  <br /><br />
     
     SELECT * FROM drama</b></font><br /><br />";
     
     
     while($mostra_dados = mysql_fetch_array($pega_dados)){
         $titulo  = $mostra_dados['titulo'];
         $nome_categoria= $mostra_dados['nome_categoria'];
         // Resultados na tela
         echo "<b>Título:</b> $titulo<br />";
         echo "<b>Categoria:</b> $nome_categoria<br /><br />";
     }
?>
</td>
</table>
</BODY>
</HTML>
