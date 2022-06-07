def sumar(numero1, numero2, mensaje):
    nombre = "Juan"
    suma = numero1 + numero2
    print(nombre)
    print(mensaje)
    return suma

def restar(numero1, numero2):
    resta = numero1 - numero2
    return resta

def multiplicar(numero1, numero2):
    multiplicacion = numero1 * numero2
    return multiplicacion

mensaje = "python"
suma = sumar(5, 4, mensaje)

print(restar(5, 4))
print(multiplicar(5, 4))

__test__ = 45
print(__test__)