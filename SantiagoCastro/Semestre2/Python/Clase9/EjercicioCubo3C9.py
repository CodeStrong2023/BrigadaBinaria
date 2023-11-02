#Crear la clase Cubo con los atributos, alto, ancho y profundidad, con un metodo calcular_volumen que tendra la formula:
#volumen = ancho * alto * profundidad. que el usuario ingrese los valores

class Cubo:
    #Creamos el metodo con sus parametros
    def __init__(self,alto,ancho,profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad
    def calcular(self):#creamos el metodo de calculo
        return self.ancho * self.alto * self.profundidad

#Ingresamos los valores
ancho = int(input("INGRESE EL ANCHO DEL CUBO-->"))
alto = int(input("INGRESE EL ALTO DEL CUBO-->"))
profundidad = int(input("INGRESE LA PROFUNDIDAD DEL CUBO-->"))

#Instanciamos el objeto
cubo1 = (Cubo(ancho,alto,profundidad))

#Mostramos el volumen del cubo
print(f"\nEl volumen del Cubo es --> {cubo1.calcular()}")