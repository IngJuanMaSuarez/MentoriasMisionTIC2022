numero_a_consultar = 457

for numero in range(2, numero_a_consultar):
    if (numero_a_consultar % numero == 0):
        print(str(numero_a_consultar) + " no es un numero primo")
        break
    if (numero == numero_a_consultar - 1):
        print(str(numero_a_consultar) + " es un numero primo")