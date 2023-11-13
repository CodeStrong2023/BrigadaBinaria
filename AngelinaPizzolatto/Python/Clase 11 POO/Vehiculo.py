class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f"Vehiculo: [Color: {self.color}, Ruedas: {self.ruedas}]"

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return f"Auto: [Color: {self.color}, Ruedas: {self.ruedas}, Velocidad: {self.velocidad} km/h]"

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return f"Bicicleta: [Color: {self.color}, Ruedas: {self.ruedas}, Tipo: {self.tipo}]"

#Creamos los objetos de cada clase 
vehiculo_generico = Vehiculo("Rojo", 4)
auto = Auto("Azul", 4, 120)
bicicleta = Bicicleta("Verde", 2, "Urbana")

# Mostrar información de cada objeto
print(vehiculo_generico)
print(auto)
print(bicicleta)



''' Definir una clase padre llamada Vehiculo y dos clases hijas llamadas
Auto y Bicicleta, las cuales heredan de la clase padre Vehiculo. 
La clase padre debe tener los siguientes atributos y métodos:

Vehiculo (clase padre)
-Atributos(color, ruedas)
-Métodos (__init__(color, ruedas) y __str__())

Auto(clase hija de Vehiculo)
-Atributos(velocidad (km/hr))
-Métodos(__init__ (color, ruedas, velecidad) y __str__())

Bicicleta(clase hija de Vehiculo)
-Atributos (tipo(urbana/montaña/etc.)
-Métodos (__init__(color, ruedas, tipo) y __str__()

Crear un objeto de cada clase'''
