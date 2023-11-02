// Ejercio1: calcular estacion del año
let mes = 6;
let estacion = " ";

if(mes==1 || mes==2 || mes==3){
    estacion= "Verano"
}
else if(mes==4 || mes==5 || mes==6 ){
    estacion = "Otoño"
}
else if(mes==7 || mes==8 || mes==9 ){
    estacion = "Invierno"
}
else if(mes==10 || mes==11 || mes==12 ){
    estacion = "Primavera"
}
else{
    console.log("Valor incorrecto")
}
console.log(estacion)

// Ejercicio2: Hora del dia
let hora = 22;
let mensaje = "";
if(hora >=6 && hora <=12){
    mensaje = "Bom Dia"
}
else if(hora >=13 && hora <=19 ){
    mensaje = "Boa Tarde"
}
else if(hora >=20 && hora <=23 ){
    mensaje = "Boa Noite"
}
else{
    mensaje = "Hora incorrecta"
}
console.log(mensaje);

// Caso con switch
switch(mes){
    case 1: case 2: case 3:
        estacion = "Verano";
        break;
    case 4: case 5: case 6:
        estacion = "Otoño";
        break;
    case 7: case 8: case 9:
        estacion = "Invierno";
        break;
    case 10: case 11: case 12:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto"
}
console.log(estacion)