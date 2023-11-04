//Ejercicio 1: Calcualr estacion del año
let mes = 6;
let estacion;

if(mes == 1 || mes == 2 || mes == 3){
    estacion = "Vernao";
}
else if(mes = 4 || mes == 5 || mes == 6){
    estacion ="Otoño";
}
else if(mes = 7 || mes == 8 || mes == 9){
    estacion ="Invierno";
}
else if(mes = 10 || mes == 11 || mes == 12){
    estacion ="Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("Ese mes corresponde a "+estacion);