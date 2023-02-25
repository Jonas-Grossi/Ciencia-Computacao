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
       <form method="POST" action="remocaoCliente.php">
       <center><p>Digite o código do cliente que deseja excluir:</p>
       <input type="text" size="10" maxlength="30" name="cod_cliente"><BR><BR>
       <input type="reset" name="voltar" value="Voltar"/>
       <input type="submit" name="enviar" value="Avançar"/>

</BODY>
</HTML>
