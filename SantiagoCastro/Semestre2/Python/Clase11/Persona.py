class Persona: #Clase Padre, hereda de la clase object
    def __init__(self,nombre,edad):
        self.nombre = nombre
        self.edad = edad
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre (self,nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self): #Override = sobreescribir
        return f"Persona: [nombre: {self._nombre}] [edad:{self._edad}]"

class Empleado(Persona): #Clase hija
    def __init__(self,nombre,edad,sueldo):
        super().__init__(nombre,edad)
        self.sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo=sueldo

    def __str__(self):
        return f"Empleado: [Sueldo: {self._sueldo}] {super().__str__()}"

empleado1 = Empleado("Santiago",18,250000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

#Tarea: encapsular los atributos y agregar los metodes getters and setters
#Crear otro objeto, pasar los datos para nombre, edad y sueldo
#Mostrar los datos, luego modificar y mostrar nuevamente

empleado2 = Empleado("Emiliano",72,250000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre="Santino"
empleado2.edad=18
empleado2.sueldo=520045
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
