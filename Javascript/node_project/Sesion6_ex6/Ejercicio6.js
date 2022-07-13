// Crea un archivo JS que contenga las siguientes líneas

// - Una variable que contenga la lista de la compra (mínimo 5 elementos)
const lista_compra = ["huevos", "pan", "leche", "nutella", "mango"]

// - Modifica la lista de la compra y añádele "Aceite de Girasol"
lista_compra.push("Aceite de girasol")
console.log(lista_compra)

// - Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"
lista_compra.splice((lista_compra.length-1),2)
console.log(lista_compra)

// - Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha)
const peliculas = [
    {titulo: 'La llegada', directorx: 'Denis Villeneuve', Fecha: 2016},
    {titulo: 'Animales nocturnos', directorx: 'Tom Ford', Fecha: 2016},
    {titulo: 'El quinto elemento', directorx: 'Luc Besson', Fecha: 1997}
]

// - Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)
const classics = peliculas.filter(obj => obj.Fecha < 2010)
console.log(classics)

// - Una nueva lista que contenga los directores de la lista de películas original (utilizando map)
const direc = peliculas.map(obj => obj.directorx)
console.log(direc)

// - Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)
const titulos = peliculas.map(obj => obj.titulo)
console.log(titulos)

// - Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)
const direc_titulos = titulos.concat(direc)
console.log(direc_titulos)

// - Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación)
const facProp = [...titulos,...direc]
console.log(facProp)
