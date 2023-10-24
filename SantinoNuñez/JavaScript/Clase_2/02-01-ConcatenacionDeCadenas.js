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