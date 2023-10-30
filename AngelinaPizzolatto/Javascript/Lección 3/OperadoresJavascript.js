//Ejercicio para encontrar números pares 
let numero = 10; 
if(numero %2 ==0){
    console.log("El número es par");
}
else {
    console.log("El número es impar")
}

//Ejercicio: Es mayor de edad
let edad = 32; 
if(edad >=18){
    console.log('Es mayor de edad');
}
else {
    console.log('Es menor de edad');
}

//Ejercicio dentro de un rango 
let dentroRango = 16
let valorMin = 0, valorMax = 20; 
if (dentroRango >= valorMin && dentroRango <=valorMax) {
    console.log("Está dentro de rango")
}
else {
    console.log("No está dentro del rango")
}

//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = false, descanso = false; 
if (!vacaciones || !descanso ) {
    console.log("El padre puede asistir al jugo de su hijo")
}
else{
    console.log("El padre no puede asistir al juego de su hijo")
}

//Operador ternario 
let resultado = 3 > 2 ? "Verdadero" : "Falso"; 
console.log(resultado)
let num = 9; 
resultado = num % 2 == 0 ? "Es un número PAR" : "Es un número IMPAR"
console.log(resultado) 

//Convertir String a Number
let miNumero = "10"; 
console.log(typeof miNumero)
let edad1 = Number(miNumero); 
console.log(typeof edad1)
//Función isNaN
if(isNaN(edad1)){ //significa no es un número(devuelve un booleano)
    console.log("${miNumero} no contiene solo números")
}
else {
    if (edad1>= 18){
        console.log("Puede votar")
    }
    else {
        console.log("No puede votar")
    }
}

//Operador ternario 
let resultado1 = edad1 >= 18 ? "Pude votar" : "No puede votar"; 
console.log(resultado1)
