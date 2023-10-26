class Persona: #Creamos nuestra primera clase
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): 
        #self es el parámetro por default y al método se lo llama Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni #atributo encapsulado de manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
    #pass significa que no se procesa más 
    
    def mostrar_detalle(self):
        print(f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad}, la dirección es: {self.args}, los datos importantes son: {self.kwargs}")
        
#print(type(Persona))

persona1 = Persona("Angelina", "Pizzolatto", 21219394, 18) #Tarea: Hacer el print igual que con el objeto2
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")


persona2 = Persona("Martín", "Guzmán", 18543954, 32)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

persona1.nombre = "Antonella"
persona1.apellido = "Russo"
persona1.edad = 24
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")


#Los atributos son características 
#Los métodos son el comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle() #La refrencia se pasa de manera automática
persona2.mostrar_detalle()

#Clase 9 
#Persona.mostrar_detalle()  hay que pasarle una referncia para el self o dará error
persona1.celular = "2604806669"
print(f"Este es el número telefónico de {persona1.nombre} - {persona1.celular}")

#print(persona2.celular) El objeto persona2 no tiene este atributo, por lo que da error
persona3 = Persona("Agustina", "Martínez",32345796, 23, "Celular", 2605796629, "Calle Perú", 432, "Departamento", 8, Altura = 1.83, Peso = 70, ColorFav = "Rosa")
persona4 = Persona("Sofía", "Mancini",21508432, 32, "Celular", 26034549439, "Calle Corrientes", 942, "Departamento", 43, Altura = 1.60, Peso = 56, ColorFav = "Amarillo")

persona3.mostrar_detalle()
persona4.mostrar_detalle()
print(persona3._dni) #esto no se debe utilizar así
#el doble guión __ (__nombre) evita que el atributo sea modificado (queda totalmente encapsulado)