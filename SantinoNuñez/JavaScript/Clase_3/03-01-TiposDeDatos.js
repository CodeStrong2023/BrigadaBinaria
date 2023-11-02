// Ejercicio para encontrar números pares
let num = 33;
if(num %2 == 0 ){
    console.log(num+" Es un número Par")
}
else{
    console.log(num+" Es un número IMPAR")
}

// Ejercicio mayor de edad
let edad = 23;
if(edad>=18){
    console.log("Es mayor de edad")
}
else{
    console.log("Es menor de edad")
}

//Ejercicio dentro de un rango 
let dentroRango = 78;
let valMax=100, valMin=0;
if(dentroRango>= valMin && dentroRango<=valMax){
    console.log("El valor está dentro del rango")
}
else{
    console.log("El valor NO está dentro del rango")
}

// Ejercicio si el padre puede asistir al juego del hijo
let vacaciones = false;
let diaLibre = false;
if(vacaciones || diaLibre){     // el operador or es ||
    console.log("Puede asistir al partido")
}
else{
    console.log("No puede asistir al partido")
}

// Operador Ternario
let resultado2 = 3 > 6 ? "Verdadero":"Falso";
console.log(resultado2)
let numero = 37;
resultado2 = numero %2 == 0 ? "Es número Par":"Es número Impar";
console.log(resultado2)

// Convertir String en Number
let miNumero = "23";   // numero cadena
console.log(typeof miNumero)
let edad2 = Number(miNumero)     // Esta es una funcion 
console.log(typeof edad2)

// Función isNan
if(isNaN(edad2)){          // isNan compara si solo hay números. Is not a number (devuelve booleano)
    console.log("La variable no contiene solo numeros")
}
else{
    if(edad2 >= 18){
        console.log("Puede votar a Milei")
    }
    else{
        console.log("No puedes votar")
    }
}

//Ternario
let resultado3 = edad2>= 18 ? "Puede votar":"No puede votar"
console.log(resultado3)