class Cubo:
    """
    Crear la clase cubo con los atributos alto, ancho y profundidad,
    con un método calcular_volumen que tendrá la formula:
    volumen = ancho * altura * profundidad
    que el usuario ingrese los valores
    """
    def __init__(self, alto, ancho, profundidad):
        self.alto = alto
        self.ancho = ancho
        self.profundidad = profundidad

    #Método para calcular volumen
    def calcular_volumen(self):
        return self.alto * self.ancho * self.profundidad

# Pedimos los valores
alto = int(input("Ingrese el ALTO del cubo: "))
ancho = int(input("Ingrese el ANCHO del cubo: "))
profundidad = int(input("Ingrese la PROFUNDIDAD del cubo: "))
cubo1 = Cubo(alto,ancho, profundidad)
print(f"El volumen del cubo es: {cubo1.calcular_volumen()}")