class Rectangulo: 
    '''
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base 
    el nombre del método será calcular_area utilizando la fórmula: 
    area = base * altura. Pero la base y la altura deben ser ingresadas
    por el usuario y los objetos deben ser tres
    '''
    def init(self, base, altura):
        self.base = base
        self.altura = altura
        
    def calcular_area(self): 
        return self.base * self.altura
    
# Pedir al usuario que ingrese la base y altura para los tres rectángulos
base1 = int(input("Ingrese la base del rectángulo 1: "))
altura1 = int(input("Ingrese la altura del rectángulo 1: "))
r1 = Rectangulo(base1, altura1)

base2 = int(input("Ingrese la base del rectángulo 2: "))
altura2 = int(input("Ingrese la altura del rectángulo 2: "))
r2 = Rectangulo(base2, altura2)

base3 = int(input("Ingrese la base del rectángulo 3: "))
altura3 = int(input("Ingrese la altura del rectángulo 3: "))
r3 = Rectangulo(base3, altura3)

# Calculamos y mostramos el area de cada objeto(rectángulo)
print(f"El área del rectángulo1 es de: {r1.calcular_area()}")
print(f"El área del rectángulo2 es de: {r2.calcular_area()}")
print(f"El área del rectángulo3 es de: {r3.calcular_area()}")