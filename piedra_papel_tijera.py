def jugar(eleccion_jugador):
    import random

    figuras = ["piedra", "papel", "tijera"]

    puntaje_jugador = 0
    puntaje_maquina = 0

    while ((puntaje_jugador < 2) and (puntaje_maquina < 2)):
        eleccion_maquina = random.choice(figuras)
        if (eleccion_jugador == eleccion_maquina):
            print("Empate")
        elif ((eleccion_jugador == "piedra" and eleccion_maquina == "tijera") or 
            (eleccion_jugador == "papel" and eleccion_maquina == "piedra") or
            (eleccion_jugador == "tijera" and eleccion_maquina == "papel")):
            puntaje_jugador += 1
            print("Ganaste")
        else:
            puntaje_maquina += 1
            print("Perdiste")

        print("Jugador: " + str(puntaje_jugador))
        print("Maquina: " + str(puntaje_maquina))
        print("Tu sacaste " + eleccion_jugador + " y la maquina saco " + eleccion_maquina)
        print("")

jugar("tijera")