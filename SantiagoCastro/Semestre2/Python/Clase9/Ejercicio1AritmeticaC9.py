"""
El nombre de este tipo de comentarios es DocString
Vamos a hacer algunas operaciones de suma, resta multiplicacion y mas
"""
class Aritmetica:
    def __init__(self,operandoA,operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    #metodo para sumar
    def suma(self):
        return self.operandoA + self.operandoB
    #Metodo de resta
    def resta(self):
        return self.operandoA - operandoB
    #Metodo de multiplicar
    def multiplicar(self):
        return self.operandoA * self.operandoB
    #Metodo de dividir
    def dividir(self):
        return self.operandoA / self.operandoB
#Instanciamos el objeto y pasamos argumentos
aritmetica1 = (Aritmetica(4,3))
#Los mosrtamos
print(f"{Aritmetica.suma()}")
print(f"{Aritmetica.resta()}")
print(f"{Aritmetica.multiplicar()}")
print(f"{Aritmetica.dividir():.2f}")

