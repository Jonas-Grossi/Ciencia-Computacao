<HTML>
<HEAD>
  <link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
       <BODY>
       <table align= "center" border="1" width= 60% bordercolor= white >
        <td>

       <?php
         include "connect_Mysql.php";

       ?>
       </BODY>
       <form method="POST" action="remocaoAtor.php">
       <center><p>Digite o nome do ator que deseja excluir:</p>
       <input type="text" size="20" maxlength="100" name="nome_ator"><BR><BR>
       <input type="reset" name="voltar" value="Voltar"/>
       <input type="submit" name="enviar" value="Avançar"/>
       
</td>
</table>
</HTML>
