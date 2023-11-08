#Estructura de datos de tipo fifo(first input / first output)
cola = ["Flor", "Alison", "aldana", "Agustina"]

#Agregamos elementos al final de la cola 
cola.append("pilar")
cola.append("Cristina")
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

