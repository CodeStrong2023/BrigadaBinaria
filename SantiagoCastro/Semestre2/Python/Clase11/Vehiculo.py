"""
Definir una clase padre llamada vehículo y dos clases hijas llamadas Auto y Bicicleta, las cuales heredan de la clase
pare vehículo. La clase padre debe tener los sgtes atributos y metodos:

Vehiculo (Clase padre)
-Atributos(color, ruedas)
-Métodos(__init__(color,ruedas) y __str__ ())

Auto (Clase hija de vehículo)
-Atributos (velocidad (km/hr))
-Metodos(__init__(color,ruedas,velocidad) y __str__ ())

Bicicleta(Clase hija de vehículo)
-Atributos (tipo (urbana,montaña,etc.))
-Metodos (__init__(color,ruedas,velocidad,tipo) y __str__ ())

Crear un objeto de cada clase
"""

class Vehiculo:
    def __init__(self,color,ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return "[Color:"+(self.color)+"], [Ruedas:"+str(self.ruedas)+"]"

vehiculo1 = Vehiculo("Rojo",6)
print(vehiculo1)

class Auto(Vehiculo):
    def __init__(self,color,ruedas,velocidad):
        super().__init__(color,ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__()+"[Velocidad:"+str(self.velocidad)+"km/h]"

vehiculo2 = Auto("Amarillo patito",4,210)
print(vehiculo2)

class Bicicleta(Vehiculo):
    def __init__(self,color,ruedas,tipo):
        super().__init__(color,ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__()+"[Tipo: "+self.tipo+"]"

vehiculo3 = Bicicleta("Azul como el mar",2,"Montaña")
print(vehiculo3)