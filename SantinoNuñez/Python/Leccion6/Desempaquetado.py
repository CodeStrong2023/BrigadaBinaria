# Desempaquetado de listas o list Unpacking
def show(name, lastname):
    print(name+ " "+lastname)
persona = ["Santino", "Nuñez"]
show(persona[0],persona[1])     # Pasamos los datos uno por uno en la lista, recibe los parametros
show(*persona)      # Mostramos todo junto, no recibe los parametros

#Se puede hacer con tuplas
persona2 = ("Viviana","Sáez")
show(*persona2)

# Tambien con diccionarios
persona3 = {"Lastname":"Nuñez","Name": "Nicolas"}
show(**persona3)    #Dos * para clave y valor