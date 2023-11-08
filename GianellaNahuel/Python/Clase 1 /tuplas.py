Cocina = ("cuchara","cuchillo","Tenedor","plato")
print(Cocina)

cant_elementos = len(Cocina)
print(f" cantidad de elementos es {cant_elementos}")
print(Cocina[2])
print(Cocina[-1])

print(Cocina[0:2])
#elementos de una tupla 
for elemento in Cocina: 
    print(elemento, end=' ') #el end se usa para eliminar saltos de línea
