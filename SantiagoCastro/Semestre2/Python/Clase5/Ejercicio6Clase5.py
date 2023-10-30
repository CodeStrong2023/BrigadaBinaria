#Ejercicio 6: Mostrar una frase sin espacios sin contar su longitud.
#hacer un programa donde el usuario ingrese una frase, se le devolverá la misma frase pero sin espacios en blanco,
#y ademas un contador de cuantos caracrteres tiene la frase (sin contar los espacion en blanco)
#Ejemplo:
#           frase: A riquelme le digo 5 palabras... crack
#           Frase final: Ariquelmeledigo5palabras...crack
#           N° de caracteres: 32 caracteres

frase = str(input("Ingrese una frase: "))
frase2 = ""
for i in frase:
    if i != " ":
        frase2 += i
frase = frase2
print(f"\nFrase final: {frase}")
print(f"\nNumero de caracteres de la frase: {len(frase)}")








