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

const apellido2 = "Riveros";  //El apellido es una constante
console.log(apellido2); 

let x,y; //Se pueden crear varias variables dentro de una misma línea 
x = 17, y = 23; //Se pueden realizar varias asignaciones dentro de una misma línea
let z = x + y; 
console.log(z); 

//No se pueden definir variables con un número al inicio, ni con una palabra reservada
// len 24mono = 23; 
// len break = mono; 

//Ampliando el uso de var, let y const
/*Con var puede reasignar en cualquier momento,
este forma parte del ámbito global 
Un error es que se sobreescriba  
*/

var nombre3 = "Francesco"; 
nombre3 = "Leonardo"; 
console.log(nombre3); 

function saludar() {
    var nombre3 = "Agustín"; 
    console.log(nombre3); 
}
console.log(nombre3); //Acá no lee el dato en la función

if(true){
    var edad = 46; 
    console.log(edad); 
}
console.log(edad); //En la función anda correctamente, en la estructura if falla

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ámbito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una función 
*/
function saludar(){
    let nombre4 = "Alessandro"; 
    console.log(nombre4)
}
//console.log(nombre4); 
saludar()
if (true){
    let edad2 = 33; 
    console.log("Edad:", edad2 );
}
//console.log(edad2); 

/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const nacimiento = 2005; 
console.log(nacimiento); 
//nacimiento = 2003; 
console.log(nacimiento); //solo se ejecuta el console anterior, el segundo NO ya que es una constante y no se puede cambiar