"""
Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
Hacer un programa donde el usuario ingrese en una frase, se le devolverá la misma frase
pero sin espacios en blanco, y además un contador de cuantos caracteres tiene la frase sin espacios
Ejemplo:  frase = vivir por siempre en paz
          frase = vivrporsiempreenpaz
          n caracteres = 13
"""
frase1 = input("Digite una frase")
frase2 = " "
for i in frase1:
    if i != " ":          frase2 += i
frase1 = frase2
print(f"Frase final: {frase1}")
print(f"N° de caracteres: {len(frase1)}")

Funciones py

#Definimos una función 
def mi_funcion(nombre):
    print(f"buen dia {nombre} ¿Cómo estás?")


mi_funcion("Gianella") #Llamamos a la función 
#Las funciones se pueden llamar varias  cantidad de veces
#No se puede llamar a una función que no este definida
