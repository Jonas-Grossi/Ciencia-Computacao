<HTML>
<HEAD>
  <TITLE>Lista</TITLE>
  <link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
<BODY>
   <table align= "center" width = 60%  border =  "1" bordercolor = white>
   <td>
<!-- exibimos, aqui, todos os dados inseridos até então no banco
("cliente" é o nome da tabela) -->
<?php
     include "connect_Mysql.php";
     $pega_dados = mysql_query("SELECT * FROM cliente");
     echo "<font color=red><b>
     SELECT * FROM cliente<b></font><br />";
     
     while($mostra_dados = mysql_fetch_array($pega_dados)){
         $cod_cliente = $mostra_dados['cod_cliente'];
         $nome_cliente = $mostra_dados['nome_cliente'];
         $telefone = $mostra_dados['telefone'];
         $endereco = $mostra_dados['endereco'];

         // Resultados na tela
         echo "<br /><br /><b>Código do Cliente:</b> $cod_cliente <br />";
         echo "<b>Nome:</b> $nome_cliente<br />";
         echo "<b>Telefone:</b> $telefone<br />";
         echo "<b>Endereco:</b> $endereco";
     }

?>
</td>
</table>
</BODY>
</HTML>
