#Creamos una clase llamada rectangulo, deberá tener 2 atributos: altura y base el nombre del metodo será calcular
#area utilizando la formula: area = base * altura. Pero la base y la altura deben ser ingresadas por el usuario
#y los objeros deben ser 3.

class Rectangulo:
    #Creamos el metodo con sus parametros
    def __init__(self,altura,base):
        self.altura = altura
        self.base = base
    def calcular(self):
        return self.altura * self.base

#Ingresamos las medidas
altura = int (input("INGRESE LA ALTURA DEL RECTANGULO"))
base = int (input("INGRESE LA BASE DEL RECTANGULO"))

#Instanciamos el objeto
rectangulo1 = (Rectangulo(base,altura))

#Mostramos el rectangulo
print(f"El area del rectangulo es: {rectangulo1.calcular()}")