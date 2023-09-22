"""
Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
Hacer un programa donde el usuario ingrese en una frase, se le devolvera la misma frase
pero sin espacios en blanco, y ademas un contador de cuantos caracteres tiene la frase sin espacios
Ejemplo:  frase = viva mas manito
          frase = vivamasmanito
          n caracteres = 13
"""
frase1 = input("Digite una frase")
frase2 = " "
for i in frase1:
    if i != " ":    # Eliminamos los espacios
        frase2 += i
frase1 = frase2
print(f"Frase final: {frase1}")
print(f"N° de caracteres: {len(frase1)}")