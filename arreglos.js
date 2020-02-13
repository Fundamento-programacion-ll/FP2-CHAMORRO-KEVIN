var arreglojson = [{
    nombre: 'anthony',
    edad: 21
}, {
    nombre: 'juan',
    edad: 25
}, {
    nombre: 'nicolas',
    edad: 22
}, {
    nombre: 'maria',
    edad: 27
}, {
    nombre: 'juana',
    edad: 26
}];
console.log(arreglojson[1].edad);
var suma = 0;
for (let index = 0; index < arreglojson.length; index++) {
    var element = arreglojson[index].edad;
    suma = suma + element;
};
console.log(suma);