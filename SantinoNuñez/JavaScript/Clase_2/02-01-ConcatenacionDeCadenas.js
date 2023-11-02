var nombre = "Santino ";
var apellido = "Nuñez";
var nombreCompleto = nombre+' '+apellido;   // Primera concatenacion con variables
console.log(nombreCompleto);
var nombreCompleto2 = "Viviana"+" "+"Saez"; // Segunda concatenacion directa
console.log(nombreCompleto2);
var juntos = nombre + 235;  // Lee de izq a der siguiendo la cadena lee el numero como string 
console.log(juntos);
juntos = nombre + 45 + 34;  // los ()separa. Como el primer datos es str el resto los lee como srt al menos q este con ()
console.log(juntos);
juntos = 45 + 23 + nombre; // suma y luego concatena nombre
console.log(juntos);

nombre += apellido; // Concatenamos nombre con apellido, operador simplificado
console.log(nombre);

// Hoy no se usa var, se utilizar let y const
let nombre2 = "Roberto";
console.log(nombre2);

const apellido2 = "Fernandez";
// apellido2 = "Sainz";  Una const no se puede modificar
console.log(apellido2);

let x,y; // Se pueden declarar varias variables en una linea
x = 34, y =25;
let z = x+y;  //Se asigna el valor de la operacion  
console.log(z);

        // No se pueden utilizar numeros en el incio de un nombre de una variable ni palabras