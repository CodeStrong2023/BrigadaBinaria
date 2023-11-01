class Cubo: 
    '''
    Crear la clase Cubo con los atributos ancho, alto y profundidad
    con un método llamado calcular_volumen que tendrá la férmula: 
    volumen = (ancho * alto) * profundidad
    el usuario debe ingresar los valores
    '''
    def init(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura 
        self.profundidad = profundidad
        
    def calcular_volumen(self): 
        return self.ancho * self.altura * self.profundidad
    
ancho = int(input("Ingrese el ancho del cubo: "))
altura = int(input("Ingrese la altura del cubo: "))
profundidad = int(input("Ingrese la profundidad del cubo: "))

#Creamos la instancia 
cubo1 = Cubo(ancho, altura, profundidad)
print(f"El volúmen del cubo es: {cubo1.calcular_volumen()}")
