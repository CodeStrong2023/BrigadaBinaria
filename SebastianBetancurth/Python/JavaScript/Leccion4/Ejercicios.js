//Ejercicio 1

let Mes = 9;
let Estacion;
if(Mes == 1 || Mes == 2 || Mes == 12){
    Estacion = "Verano";
}
else if (Mes == 3 || Mes == 4 || Mes == 5){
    Estacion = "Otoño";
}
else if (Mes == 6 || Mes == 7 || Mes == 8){
    Estacion = "Invierno";
}
else if (Mes == 9 || Mes == 10 || Mes == 11){
    Estacion = "Primavera";
}
else{
    Estacion = "El valor ingresado es incorrecto";
}

console.log("El valor " + Mes + " corresponde a la estación de: " + Estacion);


switch(Mes){ 
    case 1: case 2: case 12:
        Estacion = "Verano";
        break;
    case 3: case 4: case 5:
        Estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        Estacion = "Invierno";
        break;
    case 9: case 10: case 11:     
        Estacion = "Primavera";
        break
    default:
        Estacion = "El valor ingresado es incorrecto";   
}

console.log("El valor " + Mes + " corresonde a la estación de: " + Estacion);


//Ejercicio 2

let Hora = 14;
let Mensaje;

if (Hora >= 6 && Hora <= 11){
    Mensaje = "Good morning!";
}
else if (Hora >= 12 && Hora <= 16){
    Mensaje = "Good afternoon!";
}
else if (Hora >= 17 && Hora <= 19){
    Mensaje = "Good evening!";
}
else if (Hora >= 20 && Hora <= 23){
    Mensaje = "Good night!";
}
else{
    Mensaje = "El valor ingresado es incorrecto";
}

console.log(Mensaje);
