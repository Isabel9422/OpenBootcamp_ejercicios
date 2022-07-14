// Crea un archivo llamado objetos.js que contenga las siguientes líneas

// - Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)
const dats_pers = {
    nombre: "Isabel",
    apellido: "Serna",
    edad: 27,
    altura: 157,
    eresDesarrollador: true
}

// - Una variable que obtenga tu edad a partir del objeto anterior
const mi_edad = dats_pers.edad
console.log(mi_edad)

//-Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s
const amigo1 = {
    nombre: "Antonio",
    apellido: "Garcia",
    edad: 21,
    altura: 187,
    eresDesarrollador: true
    }
const amigo2 = {
    nombre: "Fran",
    apellido: "Serrano",
    edad: 30,
    altura: 177,
    eresDesarrollador: false
    }
const lista = [dats_pers, amigo1, amigo2]
console.log(lista)

// - Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor
console.log(lista.sort((a, b) => b.edad - a.edad))