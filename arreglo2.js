

var arreglo=[
    {nombre:'kevin',
    apellido:'Chamorro',
    edad:25},
    {nombre:'Juan',
    apellido:'Jimenez',
    edad:45}
];
var buscarUnUsuario=(arreglo,usuarioaBuscar)=>{
    var usuarioEncontrado=arreglo.find(usuario=>{
        return usuario.nombre === usuarioaBuscar;
    });
    console.log(usuarioEncontrado);
};
buscarUnUsuario(arreglo,'kevin');

var agregarUsuario=(arreglo,nombre,apellido,edad)=>{
    arreglo.unshift({nombre,apellido,edad});
    console.log(arreglo);
};
agregarUsuario(arreglo,'jhon','Mon',34);

var buscarUnUsuarioYagregar=(arreglo,nombre)=>{
    var usuarioEncontrado=arreglo.find(usuario=>{
        return usuario.nombre === nombre;
    });
    if(usuarioEncontrado===undefined){
        console.log('El usuario no existe');
        agregarUsuario(arreglo,nombre,'Mon',24);
    }else{
        console.log(usuarioEncontrado);
    }

};
buscarUnUsuarioYagregar(arreglo,'Daniel');

var eliminarUsuario= (arreglo,nombre)=>{
    var usuarioEncontrado=arreglo.filter(usuario=>{
        return usuario.nombre !== nombre;
    });
};
