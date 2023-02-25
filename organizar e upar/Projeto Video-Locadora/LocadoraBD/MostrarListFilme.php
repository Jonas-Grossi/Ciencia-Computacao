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
     $pega_dados = mysql_query("SELECT titulo FROM filmes");
     echo "<font color=red><b>
     SELECT titulo FROM filmes</b></font>";
     while($mostra_dados = mysql_fetch_array($pega_dados)){
         $titulo  = $mostra_dados['titulo'];

         // Resultados na tela
         echo "<br /><b>Título:</b> $titulo<br />";
     }
?>
</td>
</table>
</BODY>
</HTML>
