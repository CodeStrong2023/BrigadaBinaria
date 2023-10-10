# Recorrer una lista
numbers = [1,2,3,4,5,6]
for n in numbers:
    print(n)
    if n==3:
        break
else:
    print("Finalizó")

# Lsta comprehension, lista de comprensió.  Extrar solo datos empezados con P
names = ["Paola","Rodrigo","Fede", "Sofia","Pamela"]
alongP = [p for p in names if  p[0] == "P"]     # Esto regresa una nueva lista
print(alongP)

# Con diccionario
bottleC =[{"name":"Quilmes", "country":"Arg"},
          {"name":"Corona", "country":"Mx"},
          {"name":"Stella", "country":"Belguim"}]
# Extraer solo datos especifico, retorna en lista
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)