<HTML>
<HEAD>
 <link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
     <BODY>
     <table align = "center" border="1" width= 60% bordercolor= white >
     <td>
     <?
         include "connect_Mysql.php";
     ?>
     <form method="POST" action="alteracaoFilme.php">
     <center><p>Digite o C�digo do Filme que deseja alterar:</p>
     <input type="text" size="25" maxlength="100" name="cod_filme"><br><br>
     <input type="reset" name="voltar" value="Voltar">
     <input type="submit" name="enviar" value="Avan�ar">
     </td>
     </table>
     </BODY>

</HTML>
