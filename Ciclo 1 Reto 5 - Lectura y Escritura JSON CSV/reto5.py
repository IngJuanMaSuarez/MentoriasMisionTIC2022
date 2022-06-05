import csv
import json

def solucion():

    with open('TESLA.csv', 'r', newline='') as archivo:
        archivo_entrada = csv.reader(archivo, delimiter=',')

        with open('TESLA_analisis.csv', 'w', newline='') as archivo:
            archivo_salida = csv.writer(archivo, delimiter='\t')
            archivo_salida.writerow(['Fecha analizada', 'Comportamiento de la accion', 'Ajuste Cuadratico de Close'])

            lista_precios_apertura = []
            lista_fechas = []
            lista_volumen_acciones = []

            next(archivo_entrada)

            for fila in archivo_entrada:

                fecha_del_dato = fila[0]
                precio_apertura = float(fila[1])
                precio_mas_alto = float(fila[2])
                precio_mas_bajo = float(fila[3])
                precio_de_cierre = float(fila[4])
                precio_de_cierre_ajustado = float(fila[5])
                volumen_acciones = float(fila[6])
                
                if ((precio_de_cierre - precio_apertura) > 0):
                    concepto = 'SUBE'
                elif ((precio_de_cierre - precio_apertura) < 0):
                    concepto = 'BAJA'
                else:
                    concepto = 'ESTABLE'
                
                lista_fechas.append(fecha_del_dato)
                lista_precios_apertura.append(precio_apertura)
                lista_volumen_acciones.append(volumen_acciones)

                archivo_salida.writerow([fecha_del_dato, concepto])

            precio_minimo = min(lista_precios_apertura)
            indice_precio_minimo = lista_precios_apertura.index(precio_minimo)

            date_lowest_open = lista_fechas[indice_precio_minimo]

            mean_volume = sum(lista_volumen_acciones) / len(lista_volumen_acciones)
            print(mean_volume)
        
        data = {}
        data["date_lowest_open"] = date_lowest_open
        data["mean_volume"] = mean_volume
        data["precio_minimo"] = precio_minimo

        with open('TESLA_analisis.json', 'w', newline='') as archivo:
            json.dump(data, archivo)