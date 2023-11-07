//Ejercicio 1: Calcular estación del año
let mes = 6;
let estación;

if(mes == 1 || mes == 2 || mes == 3){
    estación = "Verano";
}
else if(mes = 4 || mes == 5 || mes == 6){
    estación ="Otoño";
}
else if(mes = 7 || mes == 8 || mes == 9){
    estación ="Invierno";
}
else if(mes = 10 || mes == 11 || mes == 12){
    estación ="Primavera";
}
else{
    estación = "Valor incorrecto";
}
console.log("Ese mes corresponde a "+estación);
