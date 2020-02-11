var nombre ="kevin jkhuih jkhuk";
var tn= nombre.length;
console.log(nombre.length);
console.log(nombre.indexOf('e'));
function validar_email( email ) 
{
    var regex = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return regex.test(email) ? true : false;
};
console.log(nombre.search('k'));
console.log(nombre.substr(2));
console.log(nombre.charAt(3));

while (tn>=0){
    var n= nombre.charAt(tn);
    tn--;
    console.log(n);
}
console.log(nombre.split(1,-2));
console.log(nombre.split(" "));


var texto = "hola que hace"

console.log('Antes de remplazar')

console.log(texto);

console.log('Despues de remplazar')

var textModificado = texto.replace('que hace','khe')

console.log(textModificado);



var ejemploTrim = "             hola"

console.log(ejemploTrim)

console.log(ejemploTrim.trim())



console.log(ejemploTrim.concat(" ",nombre));

console.log(ejemploTrim.toLowerCase());

ejemploTrim === nombre;

var noticia = 'Realiza fotografías de 20 megapíxeles y puede utilizar un perfil de color Dlog-M de 10 bits, con el que se obtiene un rango dinámico más amplio al registrar hasta mil millones de colores. Esto queda bastante por encima de los 16 millones de colores de los perfiles de 8 bits, pudiendo dejar más margen y libertad en la edición posterior del material. Por su parte, el Mavic 2 Zoom cuenta con un sensor CMOS de 1/2,3 pulgadas y zoom óptico, lo cual da nombre al propio producto. En este caso es capaz de realizar capturas de 12 megapíxeles, disponiendo un zoom automático híbrido (que combina detección de fase y contraste) de una función de "Superresolución" que recurre al zoom óptico para realizar nueve fotografías y componer una sola con todas ellas de 48 megapíxeles (con más detalle).';
var arregloP=noticia.split(" ");
console.log(arregloP);
var textoEs=noticia.replace(' ','_');
console.log(textoEs);

