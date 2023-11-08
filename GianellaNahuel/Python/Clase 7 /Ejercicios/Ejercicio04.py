#Crear una función para calcular el total de un pago incluyendo un impuesto aplicado. (IVA)
Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100,
Proporcione el pago sin impuesto: 1000
Proporcione el monto del impuesto: 21%
Pago con impuesto: xxxx'''
#Función que calcula el total del pago con el impuesto
def calcular_pago_con_impuesto(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total del impuesto

pago_sin_impuesto = float(input("\nProporcione el pago sin impuesto: "))
impuesto = float(input("Ingrese el monto del impuesto: "))

pago_final = calcular_pago_con_impuesto(pago_sin_impuesto, impuesto)
print(f"\nEl pago con el impuesto  es de: ${pago_final}")

