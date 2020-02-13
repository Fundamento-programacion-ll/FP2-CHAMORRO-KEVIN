const EventEmitter = require('events');

class eventouno extends EventEmitter {}
var instantciaEventouno = new eventouno();
instantciaEventouno.on('saludar', respuesta => {
    console.log('hola mundo', respuesta);
    console.log(`fasdasvcx czx  czx  hola     
    
    czxcz`);
});
instantciaEventouno.emit('saludar', 'Anthony');