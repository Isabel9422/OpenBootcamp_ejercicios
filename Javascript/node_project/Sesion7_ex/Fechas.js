// Crea un archivo llamado fechas.js que contenga las siguientes líneas

// - La fecha de hoy
const fechaActual = new Date()
console.log(fechaActual)

// - La fecha de tu nacimiento
const fecNac = new Date(1994, 11, 22)
console.log(fecNac)

// - Un variable que indique si hoy es más tarde (>) que la fecha de tu nacimiento
let compara = (fechaActual > fecNac)
console.log(compara)

// - Una variable que contenga el día de tu nacimiento
let dia = fecNac.getDate()
console.log(dia)

// - Una variable que contenga el mes de tu nacimiento (recuerda que Enero es mes 0)
let mes = fecNac.getMonth()
console.log(mes+1)

// - Una variable que contenga el año de tu nacimiento (con 4 dígitos)
let año = fecNac.getFullYear()
console.log(año)

