var nombre = "Gianella";
var apellido = "Nahuel";
var nombreCompleto = nombre+" "+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = "Gianella"+" "+"Nahuel";
console.log(nombreCompleto2);
var juntos = nombre + 250;
console.log(juntos);
juntos = nombre + 20 + 70; //Para que se realice la suma una buena forma de hacerlo es separar con parentesis
console.log(juntos);
juntos = nombre + (20 + 70);
console.log(juntos)
juntos = 20 + 70 + nombre; 
console.log(juntos);

//Otra forma de concatenar (Con operador simplificado)
nombre+=apellido;//Con operador simplificado
console.log(nombre);
