# Ejercicio 3:Calculadora de impuestos
# Crear una funcion para calcular el total de un pago incluyendo un impuesto aplicado:Iva
# Formula: pago_total= pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
# Proporcione el pago sin impuesto
# Proporcione el monto del impuesto: 21%
# Pago con impuestos: xxxxx

#Creo la funcion del total del pago
def total_pago(sin_impuesto,con_impuesto):
    pago_total = sin_impuesto + sin_impuesto * (con_impuesto/100)
    return pago_total

sin_impuesto = float(input("Ingrese el pago sin impuesto: "))
con_impuesto = float(input("Ingrese el monto del impuesto a aplicar: "))

monto_final = total_pago(sin_impuesto,con_impuesto)

print(f"El pago con impuesto es de {monto_final}")


