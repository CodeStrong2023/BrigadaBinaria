/*
Hacer un ejercicio similar al que está hecho en el video, pero ahora con los meses de año,
debes hacerlo con la estructura switch y luego con la funcion en la opcion mejorada
*/

let mes = "Junio";

switch (mes){
    case "Enero":
        console.log("Se encuentra en "+mes);
        break;
    case "Febrero":
        console.log("Se encuentra en "+mes);
        break;
    case "Marzo":
        console.log("Se encuentra en "+mes);
        break;
    case "Abril":
        console.log("Se encuentra en "+mes);
        break;
    case "Mayo":
        console.log("Se encuentra en "+mes);
        break;
    case "Junio":
        console.log("Se encuentra en "+mes);
        break;
    case "Julio":
        console.log("Se encuentra en "+mes);
        break;
    case "Agosto":
        console.log("Se encuentra en "+mes);
        break;
    case "Septiembre":
        console.log("Se encuentra en "+mes);
        break;
    case "Octubre":
        console.log("Se encuentra en "+mes);
        break;
    case "Noviembre":
        console.log("Se encuentra en "+mes);
        break;
    case "Diciembre":
        console.log("Se encuentra en "+mes);
        break;
    default:
        console.log("Mes equivocado, ingrese un mes del año");
    }

    //Opcion mejorada

let Mes2 = ["enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"];

function getMes(n){
    if (n<1 || n>12){
        throw new Error ("Fuera de rango");
    }
    else{
        return Mes2[n-1];
    }
}
console.log(getMes(6));


