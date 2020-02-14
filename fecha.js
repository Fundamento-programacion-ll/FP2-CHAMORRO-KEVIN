const moment = require("moment");
moment.locale('es');
var fecha = new Date();
//const horaactual=moment().format('h:mm:ss a');
console.log(fecha);
console.log(fecha.getDate(),fecha.getMonth()+1,fecha.getFullYear());
console.log(moment().format('MMMM Do YYYY, h:mm:ss a'));
console.log(moment().format('dddd'));
console.log(moment().subtract(3,'hours').toString());
console.log(fecha.toISOString());
console.log(fecha.toUTCString());
console.log(fecha.toDateString());
console.log(moment().startOf('week').toString());
console.log(moment('2010-10-20').isBetween('2010-10-19', '2010-10-25'));



