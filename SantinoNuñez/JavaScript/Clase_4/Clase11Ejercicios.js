// Evitar repetir el codigo

let days = "Martes"

switch (days) {
    case "Lunes":
        console.log("Hoy es "+days)
        break;
    case "Martes":
        console.log("Hoy es "+days)
        break;
    case "Miercoles":
        console.log("Hoy es "+days)
        break;
    case "Jueves":
        console.log("Hoy es "+days)
        break;
    case "Viernes":
        console.log("Hoy es "+days)
        break;
    case "Sabado":
        console.log("Hoy es "+days)
        break;
    case "Domingo":
        console.log("Hoy es "+days)
        break;
    default:
        console.log("Error, Ingrese un dia de la semana")
        break;
}

// Esta opcion es lo mismo que la otra pero mas corta, no se utiliza switch
let days2 = ["Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"]
function getDay(n){
    if(n<1 || n>7){
        throw new Error("out of range")
    }
    return days2[n-1]
}
console.log(getDay(7))

//Hacer ejercicio similar al que está hecho, pero ahora
//con los meses del año, debes hacerlo con la estructura switch
//y luego con la función en la opción mejorada

let mes = "Junio"
switch (mes) {
    case "Enero":
        console.log("Estas en "+mes)
        break;
    case "Febrero":
        console.log("Estas en "+mes)
        break;
    case "Marzo":
        console.log("Estas en "+mes)
        break;
    case "Abril":
        console.log("Estas en "+mes)
        break;
    case "Mayo":
        console.log("Estas en "+mes)
        break;
    case "Junio":
        console.log("Estas en "+mes)
        break;
    case "Julio":
        console.log("Estas en "+mes)
        break;
    case "Agosto":
        console.log("Estas en "+mes)
        break;
    case "Septiembre":
        console.log("Estas en "+mes)
        break;
    case "Octubre":
        console.log("Estas en "+mes)
        break;
    case "Noviembre":
        console.log("Estas en "+mes)
        break;
    case "Diciembre":
        console.log("Estas en "+mes)
        break;
    default:
        console.log("Error, Ingrese un mes del año")
        break;
}

let meses1 = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
function getMes(n){
    if(n<1 || n>7){
        throw new Error("out of range")
    }
    return meses1[n-1]
}
console.log(getMes(5))