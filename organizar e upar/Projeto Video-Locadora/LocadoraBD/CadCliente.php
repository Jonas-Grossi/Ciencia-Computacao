<html>  <!-- Desenha o cadastro do cliente na tela -->
<head>
      <link rel="stylesheet" type="text/css" href="style.css">
<body>
      <table align = center bordercolor = white border = "1" width = 60%>
      <td>
      <h1 align="center">.: Cadastro do cliente :.</h1>
      <h3 align="center">Campos com asterisco são obrigatórios</h3>
      <form action="InserirCli.php" method="post" enctype="multipart/form-data">

      <table align="center">
      <tr>
           <td align="right">
           Codigo do Cliente:
        </td>
        <td>
           <input type="text" name="cod_cliente" maxlength="80" size="20">*<br>
        </td>
       </tr>
        
        < tr>
           <td align="right">
           Nome:
        </td>
        <td>
           <input type="text" name="nome_cliente" maxlength="80" size="20">*<br>
        </td>
        </tr>
        
        <tr>
           <td align="right">
           Telefone:
        </td>
        <td>
           <input type="text" name="telefone" maxlength="80" size="20">*<br>
        </td>
        </tr>
        
        <tr>
           <td align="right">
           Endereco:
           </td>
       <td>
           <input type="text" name="endereco" maxlength="80" size="20">*<br>

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

<!-- Method = "post"  -> este método transmite toda a informação via formulário,
utilizando post,ele sabe que necessita continuar "ouvindo" para obter a informação-->

<!-- Action  me diz pra onde enviar a informação-->

<!-- Enctype -> do form serve pra ti dizer qual o tipo de conteúdo do form,
enviar fotos ou arquivos em geral através de um formulário.
Sem isso só dá pra enviar texto, sem nada anexado.  -->

<!--  Value  -> Opcional,especifica que texto aparecerá no campo
quando o formulário for exibido.-->
