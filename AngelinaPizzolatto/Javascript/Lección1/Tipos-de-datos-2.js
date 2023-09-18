//Javascript es de tipado dinámico como Python (no se especifica el tipo de variable)
var nombre = "Facundo";
console.log(typeof nombre);
var nombre = 45.7
console.log(typeof nombre);

var objeto = {
    animal : "Chimpancé",
    nombre_mono : "César"
}
console.log(typeof objeto)
console.log(objeto)

//Tipo de dato boolean 
var bandera = true; 
console.log(bandera);
console.log(typeof bandera);

//Tipo de dato función 
function my_funcion(){}
console.log(typeof my_funcion);

var simbolo = Symbol("Escribo cualquier cadena"); //Symbol sirve para escribir datos únicos e inmutables 
console.log(typeof simbolo)
console.log(simbolo)

//Tipo de dato clase 
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre; 
        this.apelllido = apellido; 
    }
}
console.log(typeof Persona)
console.log(Persona)

const sujeto1 = new Persona("Angelina","Pizzolatto") //creamos un objeto con la clase Persona
console.log(sujeto1)
