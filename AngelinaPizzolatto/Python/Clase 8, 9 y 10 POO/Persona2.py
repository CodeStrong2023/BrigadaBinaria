class Persona2: 
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido 
        self._edad = edad 
    
    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")
    
    @property    
    def nombre(self): #Método get
        print("Método get nombre")
        return self._nombre 
    
    @nombre.setter
    def nombre(self,nombre): #Método setter
        print("Método set nombre")
        self._nombre = nombre
        
    #Crear métodos getters y setters para apellido y edad
    
    # APELLIDO
    @property    
    def apellido(self): #Método get
        print("Método get apellido")
        return self._apellido 
    
    @apellido.setter
    def apellido(self,apellido): #Método setter
        print("Método set apellido")
        self._apellido = apellido
        
    # EDAD
    @property    
    def edad(self): #Método get
        print("Método get edad")
        return self._edad 
    
    @edad.setter
    def edad(self,edad): #Método setter
        print("Método set edad")
        self._edad = edad
        
    #Función para borrar (método destructor)
    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")
        
    
        
if __name__ == '__main__':
    persona1 = Persona2("Angi", "Pizzolatto", 18)
    print(persona1.nombre) #Se llama al método getter
    persona1.nombre = "Vale" #Llamamos al método setter
    print(persona1.nombre)
    #apellido y edad
    print(persona1.apellido)
    persona1.apellido = "Fernández"
    print(persona1.apellido)
    persona1.edad = 20
    print(persona1.edad) 
    #Mostramos los datos finales
    print(persona1.mostrar_detalles())

    #Un atributo que no tiene set se lo conoce como atributo read-only (no se lo puede modificar, solo mostrar)

    #Tarea: Crear tres objetos más, utilizando los método getter and setter
    # para modificar y mostrar los cambios 
    print("\nTAREA")
    primo = Persona2("Joaquín", "Fer", 15)
    amiga = Persona2("Ariana", "Senarega", 17)
    amiga2 = Persona2("Rosario", "Acosta", 18)

    #modificamos los datos de primo 
    primo.mostrar_detalles()
    primo.nombre = "Joaco"
    primo.apellido = "Fernández"
    primo.edad = 16
    print(f"Datos modificados: " + primo.nombre, primo.apellido, primo.edad)

    #modificamos los datos de amiga
    amiga.mostrar_detalles()
    amiga.nombre = "Ari"
    amiga.edad = 19
    print(f"Datos modificados: " + amiga.nombre, amiga.apellido, amiga.edad)

    #modificamos los datos de amiga2
    amiga2.mostrar_detalles()
    amiga2.nombre = "Rulo"
    amiga2.edad = 19
    print(f"Datos modificados: " + amiga2.nombre, amiga2.edad)

print(__name__)