import csv
import json

def clima():

    with open('CLIMA.csv', 'r', newline='') as archivo:
        archivo_entrada = csv.reader(archivo, delimiter=',')

        lista_temperatura_1 = []
        lista_temperatura_2 = []
        lista_temperatura_3 = []
        lista_temperatura_4 = []
        lista_temperatura_5 = []

        lista_presion_atmosferica_1 = []
        lista_presion_atmosferica_2 = []
        lista_presion_atmosferica_3 = []
        lista_presion_atmosferica_4 = []
        lista_presion_atmosferica_5 = []

        next(archivo_entrada)

        for fila in archivo_entrada:

            locacion = fila[1]
            temperatura = float(fila[2])
            presion_atmosferica = float(fila[3])

            if(locacion == '1'):
                lista_temperatura_1.append(temperatura)
                lista_presion_atmosferica_1.append(presion_atmosferica)
            elif(locacion == '2'):
                lista_temperatura_2.append(temperatura)
                lista_presion_atmosferica_2.append(presion_atmosferica)
            elif(locacion == '3'):
                lista_temperatura_3.append(temperatura)
                lista_presion_atmosferica_3.append(presion_atmosferica)
            elif(locacion == '4'):
                lista_temperatura_4.append(temperatura)
                lista_presion_atmosferica_4.append(presion_atmosferica)
            else:
                lista_temperatura_5.append(temperatura)
                lista_presion_atmosferica_5.append(presion_atmosferica)

        promedio_temperatura_1 = round((sum(lista_temperatura_1) / len(lista_temperatura_1)), 1)
        promedio_temperatura_2 = sum(lista_temperatura_2) / len(lista_temperatura_2)
        promedio_temperatura_3 = sum(lista_temperatura_3) / len(lista_temperatura_3)
        promedio_temperatura_4 = sum(lista_temperatura_4) / len(lista_temperatura_4)
        promedio_temperatura_5 = sum(lista_temperatura_5) / len(lista_temperatura_5)

        promedio_presion_atmosferica_1 = sum(lista_presion_atmosferica_1) / len(lista_presion_atmosferica_1)
        promedio_presion_atmosferica_2 = sum(lista_presion_atmosferica_2) / len(lista_presion_atmosferica_2)
        promedio_presion_atmosferica_3 = sum(lista_presion_atmosferica_3) / len(lista_presion_atmosferica_3)
        promedio_presion_atmosferica_4 = sum(lista_presion_atmosferica_4) / len(lista_presion_atmosferica_4)
        promedio_presion_atmosferica_5 = sum(lista_presion_atmosferica_5) / len(lista_presion_atmosferica_5)

        data = {}
        data['1'] = [promedio_temperatura_1, promedio_presion_atmosferica_1]
        data['2'] = [promedio_temperatura_2, promedio_presion_atmosferica_2]
        data['3'] = [promedio_temperatura_3, promedio_presion_atmosferica_3]
        data['4'] = [promedio_temperatura_4, promedio_presion_atmosferica_4]
        data['5'] = [promedio_temperatura_5, promedio_presion_atmosferica_5]

        with open('CLIMA_analisis.json', 'w', newline='') as archivo:
            json.dump(data, archivo)

    with open('CLIMA.csv', 'r', newline='') as archivo:
        archivo_entrada = csv.reader(archivo, delimiter=',')

        with open('CLIMA_analisis.csv', 'w', newline='') as archivo:
            archivo_salida = csv.writer(archivo, delimiter='\t')
            archivo_salida.writerow(['id', 'location', 'temperature', 'pressure', 'above_avg_temp', 'above_avg_pres'])

            next(archivo_entrada)

            for fila in archivo_entrada:

                id = fila[0]
                locacion = fila[1]
                temperatura = float(fila[2])
                presion_atmosferica = float(fila[3])

                if(temperatura > promedio_temperatura_1):
                    above_avg_temp = 'SI'

                archivo_salida.writerow([id, locacion, temperatura, presion_atmosferica, above_avg_temp])