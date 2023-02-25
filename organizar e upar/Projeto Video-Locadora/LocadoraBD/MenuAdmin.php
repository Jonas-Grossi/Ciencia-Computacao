<HTML>
<html>
<HEAD>
 <TITLE>MenuAdmin</TITLE>
 <link rel="stylesheet" type="text/css" href="style.css">
</HEAD>
<BODY>
 <table border=4% width= 100% bordercolor= white background= black>
         <td>
         <ul id="menu">

         <li>
            <div align="center"><font><b>CLIENTES</b></font>
            <a href="CadCliente.php" title="meu link">Inserir</a>
            <a href="MostrarCli.php" title="meu link">Listar</a>
            <a href="AlteraCli.php" title="meu link">Alterar</a>
            <a href="RemoveCli.php" title="meu link">Remover</a>

         </li>

         <li>
            <div align="center"><font><b>FILMES </b></font>
            <a href="CadFilme.php" title="meu link">Inserir</a>
            <a href="MostrarFilm.php" title="meu link">Listar</a>
            <a href="AlteraFil.php" title="meu link">Alterar</a>
            <a href="removeFil.php" title="meu link">Remover</a>

         </li>

          <li>

            <div align="center"><font><b>ATORES </b></font>
            <a href="CadAtor.php" title="meu link">Inserir</a>
            <a href="MostrarAtor.php" title="meu link">Listar</a>
            <a href="RemoveAtor.php" title="meu link">Remover</a>
          </li>


           <li>
            <div align="center"><font><b>CONTAGEM</b></font>
            <a href="QtidadClientes.php" title="meu link">Clientes</a>
            <a href="QtidadFilmes.php" title="meu link">Filmes</a>

           </li>
           

         </ul>
         <?php
         echo "<br /><a href=\"index.php\">Voltar</a>";
         ?>
         
	 </td>
</table>
</body>
</html>
      

