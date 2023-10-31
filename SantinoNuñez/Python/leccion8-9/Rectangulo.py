class Rectangulo:
    """
    Crear una clase llamada rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo será calcular_area utilizando la formula:
    area = base * altura. pero la base y la altura deben ser ingresadas por
    el usuario y los objets deben ser tres.
    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    # Metodo para calcular
    def calcular(self):
        return self.base * self.altura

base = int(input("Ingrese la base del rectangulo: "))
altura = int(input("Ingrese la altura del rectangulo: "))
rectangulo1 = Rectangulo(base,altura)
print(f"El area del rectangulo es: {rectangulo1.calcular()}")