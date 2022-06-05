import csv

with open('JANDJ.csv', 'r', newline='') as archivo:
    archivo_entrada = csv.reader(archivo, delimiter=',')

    with open('TESLA_analisis.csv', 'w', newline='') as archivo:
        archivo_salida = csv.writer(archivo, delimiter='\t')
        archivo_salida.writerow(['Fecha analizada', 'Comportamiento de la accion', 'Ajuste Cuadratico de Close'])

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
        
            operacion = abs(precio_de_cierre - precio_apertura)

            archivo_salida.writerow([fecha_del_dato, concepto, operacion])