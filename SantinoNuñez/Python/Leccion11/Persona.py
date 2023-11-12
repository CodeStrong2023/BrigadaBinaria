class Persona:      # Hereda de la clase Object
    def __init__(self,nombre,edad):
        self._nombre = nombre
        self._edad = edad
    @property
    def nombre(self):
        return self._nombre
    @nombre.setter
    def nombre(self,nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad
    @edad.setter
    def edad(self,edad):
        self._edad = edad

    def __str__(self):  # Override = sobreescribir
        return f"Persona Nombre:{self._nombre} Edad:{self._edad}"

class Empleado(Persona):    # Hereda de la clase Persona
    def __init__(self,nombre,edad,sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self,sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f"Empleado: [Sueldo: {self._sueldo}] {super().__str__()}"

empleado1 = Empleado("Santino",18,450000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

    # Tarea
empleado2 = Empleado("Viviana",48, 680000)
print(f"Nombre: {empleado2.nombre} Edad: {empleado2.edad} Sueldo: {empleado2.sueldo}")
empleado2.nombre = "Vivi"
empleado2.edad = 42
empleado2.sueldo = 550000
print(f"Nombre: {empleado2.nombre} Edad: {empleado2.edad} Sueldo: {empleado2.sueldo}")