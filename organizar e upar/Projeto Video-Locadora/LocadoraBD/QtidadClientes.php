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
     $resultado = mysql_query( "SELECT count(*) FROM cliente" );
     $array = mysql_fetch_array( $resultado );  // ==> Será só um resultado...

     echo "<font color=red><b>
     SELECT count(*) FROM cliente</b></font><br /><br />";

     echo 'Número de clientes: ' . $array[0]; // Ou array["count"] se lhe deres nome, ou algo do genero

     echo "<br /><br /><a href=\"MenuAdmin.php\">Voltar</a>";
?>
</td>
</table>
</BODY>
</HTML>
