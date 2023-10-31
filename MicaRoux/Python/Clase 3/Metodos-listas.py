#MÉTODO CON LISTAS LLAMADO PILAS
#Pilas usando listas
pila = [1, 2, 3]
#Agregamos elementos a la pila (siempre agrega al final)
pila.append(4)
pila.append(5)
print(pila)
#Sacamos elementos desde el final (elimina el último)
elemento_eliminado = pila.pop()
print(f"El elemento borrado es: {elemento_eliminado}")
print(pila) #Mostramos la pila sin el último elemento


#MÉTODO CON LISTAS LLAMADO COLA
#Estructura de datos de tipo fifo(first input / first output)
cola = ["Marti", "Sofi", "Ampi", "Ana"]

#Agregamos elementos al final de la cola 
cola.append("Lili")
cola.append("Angi")
print(cola)

#Sacamos elementos de la cola 
se_retira = cola.pop(0)
print(f"Atendido el cliente {se_retira}")
print(cola)
se_retira = cola.pop(0)
print(f"Atendido el cliente {se_retira}")
print(cola)
se_retira = cola.pop(0)
print(f"Atendido el cliente {se_retira}")
print(cola)