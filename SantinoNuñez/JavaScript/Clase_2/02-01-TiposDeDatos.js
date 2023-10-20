// Tipos de datos en Javascript
/*
La sintaxis de comentarios
es identica a la de java 
 */

// nunca se especifica el tipo de variable

var nombre = "Santino"; // Tipo srt
console.log(nombre);

var nombre = 7; // Tipo srt
console.log(nombre);

nombre = 55.5;
console.log(typeof nombre); // Typeof es para ver que tipo de variable es

var numero = 300;   // Tipo numerico

console.log(numero);
// Tipo object
var objeto = {
    nombre : "Santino",
    apellido : "Nuñez",
    telefono : "2604058932"
}
console.log(objeto);

// Tipos booleanos
var bandera = true;
console.log(bandera);

// Tipo de dato funcion, permite reutilizar lineas de código 
function miFuncion(){}
console.log(typeof miFuncion);

// Tipo de dato symbol
var simbolo = Symbol("Olá manito, como tá?");
console.log(simbolo)

// Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona)

// Tipo de dato undefined
var x;
console.log(x);
x = undefined;
console.log(typeof x)

// null: significa ausencia de valor
var y =null; //null no es un tipo de dato, su origen es object
console.log(typeof y);

//Tipo de dato array y Empty String 
var autos = ["BMW", "Audi","Ford","Ferrari"];
console.log(autos);
console.log(typeof autos); // Muestra que tipo de dato es: object

var z = "";
console.log(z); //Cadena vacía
console.log(typeof z);