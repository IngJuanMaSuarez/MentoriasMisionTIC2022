def cambiar_divisas(pesos_colombianos, eleccion):
    if (eleccion == "US"):
        dinero_convertido = round((pesos_colombianos / 4110.49), 2)
        print(str(dinero_convertido) + " " + eleccion)
    elif (eleccion == "EU"):
        dinero_convertido = round((pesos_colombianos / 4265.85), 2)
        print(str(dinero_convertido) + " " + eleccion)
    elif (eleccion == "CH"):
        dinero_convertido = round((pesos_colombianos / 4.75), 2)
        print(str(dinero_convertido) + " " + eleccion)
    else:
        print("Escoja una divisa valida")
    return dinero_convertido

cambiar_divisas(52650, "CH")