html>  <!-- Desenha o cadastro do filmes na tela -->
<head>
      <link rel="stylesheet" type="text/css" href="style.css">
<body>
      <table align = center bordercolor = white border = "1" width = 60%>
      <td>
      <h1 align="center">.: Cadastro de Filmes :.</h1>
      <h3 align="center">Campos com asterisco são obrigatórios</h3>
      <form action="InserirFil.php" method="post" enctype="multipart/form-data">

      <table align="center">
      <tr>
           <td align="right">
           Codigo do Filme:
        </td>
        <td>
           <input type="text" name="cod_filme" maxlength="80" size="20">*<br>
        </td>
       </tr>

        < tr>
           <td align="right">
           Título:
        </td>
        <td>
           <input type="text" name="titulo" maxlength="80" size="20">*<br>
        </td>
        </tr>

        <tr>
           <td align="right">
           Categoria:
        </td>
        <td>
           <input type="text" name="nome_categoria" maxlength="80" size="20">*<br>
        </td>
        </tr>

       <tr>
          <td align="center" colspan="2">
          <input type="reset" name="reset" value="Limpar" />
          <input type="submit" name="submit" value="Enviar" />

       </td>
       </tr>
       </table>
       </form>
       </td>
       </table>
</body>
</html>
