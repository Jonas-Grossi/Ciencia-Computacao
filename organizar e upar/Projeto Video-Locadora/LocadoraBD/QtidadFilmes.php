<HTML>
<HEAD>
  <TITLE>Lista</TITLE>
  <link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
<BODY>
   <table align= "center" width = 100%  border =  "1" bordercolor = white>
   <td>

<?php
     include "connect_Mysql.php";
     $resultado = mysql_query( "SELECT count(*) FROM filmes" );
     $array = mysql_fetch_array( $resultado );  // ==> Ser� s� um resultado...
     
     echo "<font color=red><b>
     SELECT count(*) FROM filmes</b></font><br /><br />";
     
     echo 'N�mero de Filmes: ' . $array[0]; // Ou array["count"] se lhe deres nome, ou algo do genero

     echo "<br /><br /><a href=\"MenuAdmin.php\">Voltar</a>";
?>
</td>
</table>
</BODY>
</HTML>
