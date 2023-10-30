#Ejercicio 2: Operaciones conjuntos con listas.
#Escribir un programa que tenga 2 listas y que a continuacion cree las siguientes listas
#1- Lista de las palabras que aparecen en la lista
#2- Lista de las palabras que aparecen en la primera lista, pero no en la segunda
#3- lista de palabras que aparecen en la segunda lista, pero que no aparecen en la primera
#4- Lista de palabras que aparecen en ambas listas

#Ultomos ganadores del balon de oro
lista1 = ["Benzema","Messi","Messi","Modric","Cristiano Ronaldo","Cristiano Ronaldo","Ronaldinho","Ronaldo Nazario","Zidane"]
lista2 = ["Messi","Cristiano Ronaldo","Cristiano Ronaldo","Messi","Messi","Kaká","Cannavaro","Owen","Figo"]

conjunto1=set(lista1)
conjunto2=set(lista2)

#1 Palabras que aparecen en la lista
print("Las dos listas juntas")
union = list(conjunto1 | conjunto2)
print(union)
#2 Palabras que aparecen en la primera lista, pero no en la segunda
print("Lista 1:")
primerLista = list(conjunto1 - conjunto2)
print(primerLista)
#3- lista de palabras que aparecen en la segunda lista, pero que no aparecen en la primera
print("Lista 2:")
segundaLista = list(conjunto2 - conjunto1)
print(segundaLista)
#4- Lista de palabras que aparecen en ambas listas
print("Elementos compartidos entre listas")
compartidos = list(conjunto1 & conjunto2)
print(compartidos)