var nombre = "Angelina"; 
var apellido = "Pizzolatto"; 
var nombreCompleto = nombre+ " "+ apellido; 
console.log(nombreCompleto);
var nombreCompleto2 = "Abril"+""+"Pérez"; 
console.log("El resultado es: ", nombreCompleto2)
var juntos = nombre + 219; //Lee de izquierda a derecha siguiendo la cadena lee el número como str
console.log(juntos); 
juntos = nombre + 78 + 235; //si queremos sumarlo se deben colocar paréntesis
console.log(juntos);
juntos = 34 + 456 +nombre; //primero suma y luego concatena
console.log(juntos);

nombre += apellido; //Concatenación con el operador simplificado
console.log(nombre);

//Hoy en día ya no se utiliza var, se utilizan len y const
let nombre2 = "Marti"; 
console.log(nombre2);

const apellido2 = "Riveros"; 
console.log(apellido2); 

let x,y; //Se pueden crear varias variables dentro de una misma línea 
x = 17, y = 23; //Se pueden realizar varias asignaciones dentro de una misma línea
let z = x + y; 
console.log(z); 

//No se pueden definir variables con un número al inicio, ni con una palabra reservada
// len 24mono = 23; 
// len break = mono; 