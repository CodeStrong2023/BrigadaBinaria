class Persona: #Se hereda de la clase Object
    def __init__(self, nombre, edad):
        self._nombre = nombre 
        self._edad = edad
        
    @property # para nombre
    def nombre(self):
        return self._nombre
    @nombre.setter
    def nombre(self, nombre): 
        self._nombre = nombre
        
    @property # para la edad
    def edad(self):
        return self._edad
    @edad.setter
    def edad(self, edad): 
        self._edad = edad
      
    def __str__(self):
        return f"Persona: [Nombre: {self._nombre}, Edad: {self._edad} ]"
        
class Empleado(Persona): #Hija de la clase persona
    def __init__(self,nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo
       
    @property  # para el sueldo
    def sueldo(self):
        return self._sueldo
    @sueldo.setter
    def sueldo(self, sueldo): 
        self._sueldo = sueldo
    
    def __str__(self):
        return f"Empleado: [Sueldo: {self._sueldo}] {super().__str__()}"
    
empleado1 = Empleado("Angi", 18, 500000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

#Tarea: encapsular los atributos y agregar los métodos getters and setters
#Crear otro objeto, pasar los datos para nombre, edad y sueldo
#Mostrar estos datos, luego modificar y mostrar nuevamente 

# Crear otro objeto Empleado
empleado2 = Empleado("Mateo", 25, 700000)

# Mostrar los datos del segundo empleado
print("\nDatos del segundo empleado:")
print("Nombre: ", empleado2.nombre)
print("Edad: ", empleado2.edad)
print("Sueldo: ", empleado2.sueldo)

# Modificar los datos del segundo empleado
empleado2.nombre = "Carlos"
empleado2.edad = 30
empleado2.sueldo = 800000

# Mostrar los datos modificados del segundo empleado
print("\nDatos modificados del segundo empleado:")
print("Nombre: ", empleado2.nombre)
print("Edad: ", empleado2.edad)
print("Sueldo: ", empleado2.sueldo)