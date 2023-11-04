//Ejercicio 1: Calcular estación del año
let mes = 10; 
let estacion; 

if (mes == 1 || mes==2 || mes ==12 ){
    estacion ="Verano"; 
}
else if (mes == 3 || mes == 4 || mes == 5){
    estacion="Otoño"; 
}
else if (mes == 6 || mes == 7 || mes == 8){
    estacion="Invierno";
}
else if (mes == 9 || mes == 10 || mes == 11){
    estacion="Primavera";
}
else{
    estacion = "Ese valor no existe"; 
}
console.log("El valor corresponde a: " + estacion)


//Ejercicio 2: Hora del día 
let hora = 13;

if (hora >= 6 && hora < 11) {
    // Mañana (6:00 AM - 11:00 AM)
    console.log("Buen día. Es hora de desayunar");
} else if (hora >= 12 && hora < 15) {
    // Tarde (12:00 PM - 3:00 PM)
    console.log("Buenas tardes. Es hora de almorzar");
} else if (hora >= 20 && hora < 24) {
    // Noche (8:00 PM - 12:00 AM)
    console.log("Buenas noches. Es hora de cenar");
}
else{
    console.log("La hora ingresada no corresponde con una comida");
}



//Estructura switch con el break (Ejercicio estación del año)
switch (mes) {
    case 1:
    case 2:
    case 12:
        estacion = "Verano";
        break;
    case 3:
    case 4:
    case 5:
        estacion = "Otoño";
        break;
    case 6:
    case 7:
    case 8:
        estacion = "Invierno";
        break;
    case 9:
    case 10:
    case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Ese valor no existe";
}
console.log("El valor corresponde a: " + estacion);
