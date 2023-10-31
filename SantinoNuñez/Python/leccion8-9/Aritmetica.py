class Aritmetica:
    """
    El nombre de este tipo de documento es: DocString
    esto es documentacion de la clase Python
    vamos a hacer operaciones de: suma, resta, multiplicacion, divicion
    """
    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.opperandoB = operandoB

    # Merodo para sumar
    def sumar(self):
        return self.operandoA + self.opperandoB
    def resta(self):
        return self.operandoA - self.opperandoB
    def multiplicacion(self):
        return self.operandoA * self.opperandoB
    def divicion(self):
        return self.operandoA / self.opperandoB

aritmetica1 = Aritmetica(2,5) # Pasamos los argumentos para los operandos
print(f"La suma de los números es: {aritmetica1.sumar()}")
print(f"La resta de los números es: {aritmetica1.resta()}")
print(f"La multiplicación es: {aritmetica1.multiplicacion()}")
print(f"La divición es: {aritmetica1.divicion():.2f}")