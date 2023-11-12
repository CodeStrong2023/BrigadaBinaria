class Vehiculo:
    def __init__(self,color,ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f"Color: {self.color} Ruedas: {self.ruedas}"

class Auto(Vehiculo):
    def __init__(self,color,ruedas,velocidad):
        super().__init__(color,ruedas)
        self.velocidad= velocidad

    def __str__(self):
        return super().__str__() + " Velocidad (kmh): " + str(self.velocidad)

class Bicicleta(Vehiculo):
    def __init__(self,color,ruedas,tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo
    def __str__(self):
        return super().__str__()+ " Tipo: "+ self.tipo

# Objeto 1
vehiculo = Vehiculo("Rojo",4);
print(vehiculo);

# Objeto 2
auto = Auto("Blanco",5,230);
print(auto)

# Objeto 3
bici = Bicicleta("Verde",2,"MTB")
print(bici)