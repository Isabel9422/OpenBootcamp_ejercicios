// Crea un archivo JS que contenga las siguientes líneas

const { rejects } = require("assert")

// - Una función sin parámetros que devuelva siempre "true"
function alwaystrue () {
    return true
}

console.log(alwaystrue())

// - Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado
const promise5sec = new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log('Hola soy una promesa');
    }, '5000')
    if(setTimeout){
        resolve()
    }else{
        reject()
    }
})
console.log(promise5sec.then(() => console.log("Se ha ejecutado correctamente")))
console.log(promise5sec.catch(() => console.log("No se ha ejecutado correctamente")))
console.log(promise5sec.finally(() => console.log("Esto se ejecuta siempre")))

// const miPromesa = new Promise((resolve, reject) => {
//     const i = 2
//     // Si está todo correcto
//     if (i !== 0) {
//         resolve()
//     } else {
//         reject()
//     }
// })

// miPromesa
//     .then(() => console.log("Se ha ejecutado de forma correcta"))
//     .catch(() => console.log("ERROR"))
//     .finally(() => console.log("Yo me ejecuto siempre"))


// - Una función generadora de índices pares automáticos
function* paresAutomaticos() {
    let numero = 0
    let salir = true
    while(salir){
    numero++
    if (numero % 2 ==0){
        yield numero
    }
    if (numero === 10) salir = false
}
}
const func = paresAutomaticos()
console.log(func.next())
console.log(func.next())
console.log(func.next())
console.log(func.next())
console.log(func.next())
console.log(func.next())
