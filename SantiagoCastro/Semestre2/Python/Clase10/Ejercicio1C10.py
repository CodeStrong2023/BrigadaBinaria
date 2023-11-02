"""
Tarea crear tres objetos mas, utilizando los metodos de getter and setter para modificar y mostrar cambios
con el metodo mostrar detalles.
"""

class Perosna:
    def __init__(self,nombre,apellido,edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
    def datos_personas(self):
        print(f"DATOS:nombre-> {self._nombre} apellido->{self._apellido} edad->{self._edad}")
    #Creamos metodo getter
    @property #decorador
    def nombre(self):
        return self._nombre
    #Creamos metodo setter
    @nombre.setter  # decorador
    def nombre(self,nombre):
        self._nombre = nombre
    #Metodo getter
    @property
    def apellido(self):
        return self._apellido
    #Metodo setter
    @apellido.setter
    def apellido(self,apellido):
        self._apellido = apellido
    #Metodo getter
    @property
    def edad(self):
        return self._edad
    #Metodo setter
    @edad.setter
    def edad(self,edad):
        self._edad = edad

#Modificamos con el setter
persona1 = Perosna("Santi","Messi",68)
persona1.nombre = "Santiago"
persona1.apellido = "Castro"
persona1.edad = 18

persona2 = Perosna("Santigo","Ninez",54)
persona2.nombre = "Santino"
persona2.apellido = "Nuñez"
persona2.edad = 18

persona3 = Perosna("Angi","Pizo",10)
persona3.nombre = "Angelina"
persona3.apellido = "Pizzolatto"
persona3.edad = 18

#Mostramos con el getter
print(f"{persona1.nombre}\n{persona1.apellido}\n{persona1.edad}")
print(persona1.datos_personas())
print(f"{persona2.nombre}\n{persona2.apellido}\n{persona2.edad}")
print(persona2.datos_personas())
print(f"{persona3.nombre}\n{persona3.apellido}\n{persona3.edad}")
print(persona3.datos_personas())