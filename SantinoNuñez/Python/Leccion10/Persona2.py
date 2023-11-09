class Persona2:
    def __init__(self,nombre,apellido,edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property   # Decorador
    def nombre(self):   # Metodo getter
        print("Estamos utilizando el metodo get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):   # Metodo setter
        print("Estamos utilizando el metodo set")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self,apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self,edad):
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")

if __name__ == "__main__":
    persona1 = Persona2("Santino","Nuñez",18)
    print(persona1.nombre) # Llamamos al metodo getter
    persona1.nombre = "ERNESTO" # Llamamos al metodo setter
    print(persona1.nombre)  # Metodo getter
    print(persona1.mostrar_detalles())   # Llamamos al meodo mostrar_detalles

    # El metodo set modifica
    # Atributo Read-Only (solo lectura) porque no tenemos el metodo set
    # persona1.edad = 36
    print(persona1.edad)

    # Crear tres objetos utilizando los getter and setter
    # para modificar, y mostrar los cambios con el metodo mostrar_detalles

    persona2 = Persona2("Florencia","Martinez",35)
    persona2.nombre = "Flor"
    persona2.apellido = "Nuñez"
    persona2.edad = 39
    print(persona2.mostrar_detalles())

    persona3 = Persona2("Sofia","Perez",32)
    persona3.nombre = "Sofi"
    persona3.apellido = "Gutierrez"
    persona3.edad = 22
    print(persona3.mostrar_detalles())

    persona4 = Persona2("Enrrique", "Muñoz",45)
    persona4.nombre = "Riki"
    persona4.apellido = "Fernadez"
    persona4.edad = 54
    print(persona4.mostrar_detalles())

print(__name__)
