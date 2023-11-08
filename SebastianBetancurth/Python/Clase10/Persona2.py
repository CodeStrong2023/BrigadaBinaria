class persona2:
    def __init__(self, nombre, apellido, edad):  # Encapsulado.
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def Detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property  # Decorador.
    def nombre(self):  # Método Getter
        print("Estamos utilizando el método get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Método Setter
        print("Estamos utilizando el método set")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
        

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")
if __name__ == "__main__":
    Persona1 = persona2("Sebastian", "Betancurth", 20)
    print(Persona1.nombre)  # Llamada al método Getter
    Persona1.nombre = "Ariel Betancud"
    print(Persona1.nombre)  # Se llama otra vez al método Getter.
    Persona1.Detalles()  # Llamada al método Detalles.
    # Persona1.edad = 40 -- Atributo read-only sería la edad porque no tiene el método set.
    print(Persona1.edad)

    # Tarea: crear tres objetos más, utilizando los métodos getter y setter para modificar y mostrar los cambios.

    # Objeto 1
    Persona2 = persona2("Lauren", "Perla", 23)
    print(Persona2.nombre)
    print(Persona2.apellido)
    print(Persona2.edad)

    Persona2.nombre = "Pablo"
    Persona2.apellido = "Betancur"
    Persona2.edad = 21

    Persona2.Detalles()

    # Objeto 2
    Persona3 = persona2("Ximena", "Spano", 16)
    print(Persona3.nombre)
    print(Persona3.apellido)
    print(Persona3.edad)

    Persona3.nombre = "Camila Casanova"
    Persona3.apellido = "Betancur"
    Persona3.edad = 18

    Persona3.Detalles()

    # Objeto 3
    Persona4 = persona2("Angela", "Romina", 51)
    print(Persona4.nombre)
    print(Persona4.apellido)
    print(Persona4.edad)

    Persona4.nombre = "Andrea Viviana"
    Persona4.apellido = "Betancur"
    Persona4.edad = 45

    Persona4.Detalles()

    print(__name__)
