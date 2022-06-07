import csv
import json

with open('GLOBANT.csv', newline='') as archivo:
    archivo_entrada = csv.reader(archivo, delimiter='\t')

    with open('test.csv', 'w', newline='') as documento:
        archivo_salida = csv.writer(documento, delimiter='\t')

        lista_de_numeros = []

        next(archivo_entrada)

        for fila in archivo_entrada:
            if (float(fila[1]) > 235):
                lista_de_numeros.append(fila[1])
            # fila
            # archivo_salida.writerow([fila])

        maximo = max(lista_de_numeros)

# print(lista_de_numeros)

    data = {}

    data['papa'] = maximo
    data['arroz'] = 456
    data['huevos'] = 789

    with open('mercado.json', 'w', newline='') as documento:
        json.dump(data, documento)


# mercado = ["SUBE", "SUBE", "BAJA", "SUBE", "queso", "cereal", "pan", "pan", "huevos"]
# print(mercado)

# print(mercado.count("SUBE"))

edad = []
tipo = []
nombre = []

diccionario2 = {
    1: 5,
    
}

diccionario = {
    "edad": [12, 23, 45],
    "tipo": ["canino", "felino", "canino"],
    "nombre": ["test1", "test2", "test3"],
}

print(diccionario)