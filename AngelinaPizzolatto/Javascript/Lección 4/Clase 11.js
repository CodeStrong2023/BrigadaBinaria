//Evitar repetir tu código 
//Dry don´t repeat yourself
//let days = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]; 
let days = "Sábado"; 
switch (days) {
    case "Lunes":
        console.log("Hoy es " + days);
        break;
    case "Martes":
        console.log("Hoy es " + days);
        break;
    case "Miércoles":
        console.log("Hoy es " + days);
        break;
    case "Jueves":
        console.log("Hoy es " + days);
        break;
    case "Viernes":
        console.log("Hoy es " + days);
        break;
    case "Sábado":
        console.log("Hoy es " + days);
        break;
    case "Domingo": 
        console.log("Hoy es " + days);
        break;
    default:
        break; 
}

let days2 = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"];
function getDay(x){
    if(x < 1 || x > 7){
        throw new Error("Out of range"); 
    }
    return days2[x-1];
}
console.log(getDay(4)); 

//Hacer ejercicio similar al que está hecho, pero ahora
//con los meses del año, debes hacerlo con la estructura switch
//y luego con la función en la opción mejorada
let meses = 6; 
switch (meses) {
    case 1:
        console.log("ENERO");
        break;
    case 2:
        console.log("FEBRERO");
        break;
    case 3:
        console.log("MARZO");
        break;
    case 4:
        console.log("ABRIL");
        break;
    case 5:
        console.log("MAYO");
        break;
    case 6:
        console.log("JUNIO");
        break;
    case 7: 
        console.log("JULIO");
        break;
    case 8: 
        console.log("AGOSTO");
        break;
    case 9: 
        console.log("SEPTIEMBRE");
        break;
    case 10: 
        console.log("OCTUBRE");
        break;
    case 11: 
        console.log("NOVIEMBRE");
        break;
    case 12: 
        console.log("DICIEMBRE");
        break;
    default:
        console.log("Número incorrecto")
        break; 
}

let meses2 = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
function getMes(y){
    if(y < 1 || y > 12){
        throw new Error("Out of range"); 
    }
    return meses2[y-1];
}
console.log(getMes(4)); 