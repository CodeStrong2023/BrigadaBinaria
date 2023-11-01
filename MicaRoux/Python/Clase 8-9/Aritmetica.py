class Aritmetica: 
    '''
    A este tipo de comentarios se los llama DocString 
    esto es documentación de la clase en python 
    Clase con suma, resta, multiplicación, etc
    '''
    def init(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
        
    #Método para sumar 
    def sumar(self): 
        return self.operandoA + self.operandoB
    
    #Método para restar 
    def restar(self): 
        return self.operandoA - self.operandoB
    
    #Método para multiplicar 
    def multiplicar(self): 
        return self.operandoA * self.operandoB
    
    #Método para dividir 
    def dividir(self): 
        return self.operandoA / self.operandoB
    
aritmetica1 = Aritmetica(50,10) #Se le pasan los argumentos 
# Mostramos los resultados de las operaciones con los métodos
print(f"La suma es: {aritmetica1.sumar()}")
print(f"La resta es:  {aritmetica1.restar()}")
print(f"La multiplicación es: {aritmetica1.multiplicar()}")
print(f"La división es:  {aritmetica1.dividir():.2}")