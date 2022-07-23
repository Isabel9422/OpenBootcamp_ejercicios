class Estudiante {
    nombre
    asignaturas

    constructor(nombre, asignaturas) {
        this.nombre = nombre
        this.asignaturas = asignaturas
    }

 getNombre () {
    return this.nombre
}

getAsignaturas () {
    return this.asignaturas
}

setNombre (nombre) {
    this.nombre = nombre
}
setAsignaturas (asignaturas) {
    this.asignaturas = asignaturas
}
 obtenDatos() {
    console.log(this.nombre, this.asignaturas)
}
}
const estudiante = new Estudiante("Isabel", ["Javascript", "HTML", "CSS"])

estudiante.obtenDatos()