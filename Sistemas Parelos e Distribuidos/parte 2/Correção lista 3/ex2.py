estoque = int(input("Entre com a quantidade em estoque:"))

compra = int(input("Entre com a quantidade desejada para compra:"))

if compra < 0:
      print("Valor inválido")
elif compra > estoque:
      print("Pedido não será atendido")
else:
      print("Pedido será atendido")
