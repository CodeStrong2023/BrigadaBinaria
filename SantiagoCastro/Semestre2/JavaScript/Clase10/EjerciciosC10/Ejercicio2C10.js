/*
Ejercicio 2: Hora del dia (se realiza con las 24hs)
De 6 a 11 nos saluda: Buen dia!
De 14 a 19 nos saluda: Buenas tardes!
De 20 a 23 nos saluda: Buenas noches! 
*/

let hora = 9;
let mensaje;

if(hora >= 6 && hora <=11){
    mensaje = "Buen dia!"
}
else if(hora >= 14 && hora <= 19){
    mensaje = "Buenas tardes!"
}
else if(hora >= 20 && hora <= 23){
    mensaje = "Buenas noches!"
}
else{
    mensaje="Valor incorrecto";
}
console.log(mensaje)