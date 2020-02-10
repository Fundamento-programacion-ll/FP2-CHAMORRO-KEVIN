var json={
    nombre: "Kevin",
    edad: 25,
    casado: false,
    mascota:['Cachetes'],
    colegio:{
        nombrecolegio:"ahjh",
        telefono:12233454
    }
};
console.log(json);
console.log('hola');
var a="sd";
console.log(a);
a=true;
console.log(a);
var arreglo= ["jj",124,true,{a:1},["ewr",66]];
console.log(arreglo);

var jsonP={
    nombre:"Kevin",
    apellido:"Chamorro",
    edad:25
};

console.log(json+jsonP);
var nu=34;
console.log(json+nu);




//funciones normales
var mifuncion= function(n1,n2)  {
    //console.log('funcion 1');
    return n1+n2;
};

//funciones de flecha gorda
var mifuncion2=(n1,n2)=>{
    return n1+n2;
};
console.log(mifuncion2(4,5));
console.log(mifuncion(5,4));
