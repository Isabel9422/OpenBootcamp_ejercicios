export function suma(a, b){
    if(typeof a && b == Number){
    let resultado= a+b
    return resultado
    }else{
    throw new Error("No es un numero")
    }
}

var hola,mundo
console.log(suma(hola,mundo))
