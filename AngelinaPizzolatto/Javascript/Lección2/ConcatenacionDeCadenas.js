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