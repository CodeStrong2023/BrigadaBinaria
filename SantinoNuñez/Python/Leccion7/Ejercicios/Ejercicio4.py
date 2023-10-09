"""
Ejercicio 4: Calculadora de impuestos
Crear una funcion para calcular el total de un pago incluyendo un
impuesto aplicado (IVA).
Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
Proporcione el pago sin impuestos: 1000
Proporcione el monto del impuesto: 21%
Pago con impuesto: xxxx
"""
"""
def monto_total(monto):
    pago_sin_impuestos = monto
    impuesto = 21
    pago_total = pago_sin_impuestos + pago_sin_impuestos * (impuesto/100)
    print(f"Pago sin impuestos: {pago_sin_impuestos}")
    print("Impuestos: 21%")
    print(f"Pago con impuestos: ${pago_total:.2f}")
# pedimos el monto y ejecutamos
monto = float(input("Ingrese el monto: "))
monto_total(monto)
"""
def monto_total(pago_sin_impuestos,impuesto):
    pago_total = pago_sin_impuestos + pago_sin_impuestos * (impuesto / 100)
    return pago_total

pago_sin_impuestos = float(input("Ingrese el pago sin impuestos: "))
impuesto = float(input("Ingrese el monto del impuesto: "))
pago_con_impuestos = monto_total(pago_sin_impuestos,impuesto)
print(f"Pago con impuestos: ${pago_con_impuestos:.2f}")
