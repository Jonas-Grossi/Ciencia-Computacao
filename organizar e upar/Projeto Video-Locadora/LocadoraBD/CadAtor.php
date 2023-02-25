html>  <!-- Desenha o cadastro de Atores na tela -->
<head>
      <link rel="stylesheet" type="text/css" href="style.css">
<body>
      <table align = center bordercolor = white border = "1" width = 60%>
      <td>
      <h1 align="center">.: Cadastro de Atores :.</h1>
      <h3 align="center">Campos com asterisco são obrigatórios</h3>
      <form action="InserirAtor.php" method="post" enctype="multipart/form-data">

      <table align="center">
      <tr>
           <td align="right">
           Nome:
        </td>
        <td>
           <input type="text" name="nome_ator" maxlength="80" size="20">*<br>
        </td>
       </tr>

        < tr>
           <td align="right">
           Data de Nascimento:
        </td>
        <td>
           <input type="text" name="data_nasc" maxlength="80" size="20">*<br>
        </td>
        </tr>

        <tr>
           <td align="right">
           Código do filme:
        </td>
        <td>
           <input type="text" name="cod_filme" maxlength="80" size="20">*<br>
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
