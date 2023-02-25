turma = int(input("Entre com a quantidade de alunos:"))

tempo = 0

if turma % 3 == 0:
      tempo = 20*(turma/3)      
      print(tempo, " minutos")
elif turma % 2 == 0:
      tempo = 20*(turma/2)      
      print(tempo, " minutos")
else:
      tempo = 10*turma      
      print(tempo, " minutos")
