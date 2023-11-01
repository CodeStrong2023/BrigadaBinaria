//Javascript es de tipado dinámico como Python (no se especifica el tipo de variable)
var nombre = "German";
console.log(typeof nombre);
var nombre = 45.7
console.log(typeof nombre);

var objeto = {
    animal : "perro",
    nombre_mono : "Flofi"
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

const sujeto1 = new Persona("Micaela","Roux") //creamos un objeto con la clase Persona
console.log(sujeto1)

//Tipo de dato undefined 
var x; 
console.log(x); 
console.log(typeof x); 

x = undefined; 
console.log(typeof x); 

// nul: significa que no tiene valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object 
console.log(y); 
console.log(typeof y); //es un objeto

//Tipo de dato array y Empty String
//los arreglos son de tipo objeto
var autos = ['Ford','Peugeot','BMW','Audi']; //contiene cualquier tipo de dato
console.log(autos); 
console.log(typeof autos);

var z; 
console.log(z); //es undefined

var z = ""; 
console.log(z);//es una string vacia