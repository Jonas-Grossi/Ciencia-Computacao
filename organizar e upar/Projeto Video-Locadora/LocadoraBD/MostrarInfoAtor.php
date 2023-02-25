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
     $pega_dados = mysql_query("SELECT nome_ator,data_nasc FROM ator");
     echo "<font color=red><b>
     SELECT nome_ator,data_nasc FROM ator</b></font>";
     
     while($mostra_dados = mysql_fetch_array($pega_dados)){
         $nome_ator = $mostra_dados['nome_ator'];
         $data_nasc  = $mostra_dados['data_nasc'];

         // Resultados na tela
         echo "<br /><br /><b>Nome:</b> $nome_ator<br />";
         echo "<b>Data de Nasc.:</b> $data_nasc <br /><br />";

     }

?>
</td>
</table>
</BODY>
</HTML>

