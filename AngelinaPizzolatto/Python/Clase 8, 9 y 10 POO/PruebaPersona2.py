from Persona2 import Persona2
print("Creación de objetos".center(50,'-'))
if __name__ == '__main__':
    persona3 = Persona2("Emilia", "Mernes", 23)
    persona3.mostrar_detalles()

    print(__name__)
    
print("Eliminación de Objetos".center(50, '-'))
del persona3