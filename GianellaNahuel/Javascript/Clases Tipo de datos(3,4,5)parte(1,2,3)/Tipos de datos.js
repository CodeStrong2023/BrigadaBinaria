//TIPOS DE DATOS 

//Tipo String, definimos:
var nombre = "Gianella";
console.log(typeof nombre);

//Las variables se pueden reutilizar, no hace falta especificar si es tipo str o int o float, definimos:
nombre = 7;
console.log(typeof nombre)
nombre = 12.3;

//Tipo numerico y su definicion
var numero = 200;
console.log(typeof numero);

//Tipo Object y su definicion
var objeto = {
    nombre : "Gianella",
    apellido : "Nahuel",
    DNI : "46.061.882"
}
console.log(typeof objeto);

//Tipo Boolean (true or false) y su definicion
var bandera = true;
console.log(typeof bandera);

//Tipo de datos funcion y su definicion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de datos symbol y su definicion
var simbol = Symbol("Mi simbolo");
console.log(typeof miFuncion);

//Tipo de dato clase (es una funcion) y su definicion
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);

//Tipo de dato undefined y su definicion
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

//null -palabra similar pero se comporta diferente-significa ausencia de valor
var y = null; // no es un tipo de dato, pero su origen es object
console.log(y) 

//Tipo de dato array
var autos = ["Audio","Mercedes","BMW","Porsche","Bugatti"];
console.log(autos);

//Tipo de dato Empty String 
var z = ""; //Esto es una cadena vacio
console.log(z);


