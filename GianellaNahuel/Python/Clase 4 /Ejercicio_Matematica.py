# Ejercicio de matemáticas 
# Para sacar la raiz cuadrada de un número positivo
numero = int(input("Digite un número: "))
while numero < 0:
    print("Error-> debería ser un número positivo")
    numero = int(input("Digite un número positivo: "))
print(f"\n La raiz cuadrada de {numero} es: {math.sqrt(numero):.2f}")
