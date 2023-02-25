print('''
1     Solteiro
2     Casado
3     Viúvo
4     Enrolado
5     Não desejo declarar
''')

estado = int(input("Qual o seu estado civil?"))

if estado == 1:
      print("Solteiro")
elif estado == 2:
      print("Casado")
elif estado == 3:
      print("Viúvo")
elif estado == 4:
      print("Enrolado")
elif estado == 5:
      print("Não desejo declarar")
