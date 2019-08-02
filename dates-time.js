let val;

const today = new Date();

//const birthday = new Date('MM-DD-YYYY');
const birthday = new Date('01-13-1997');
//birthday = new Date('January 13 1997');
//birthday = new Date('01/13/1997');


val = birthday;
val = today.getMonth();
val = today.getDate();
val = today.getDay();
val = today.getFullYear();
val = today.getHours();
val = today.getMinutes();
val = today.getSeconds();
val = today.getMilliseconds();
val = today.getTime();

birthday.setMonth(2);
birthday.setDate(12);
birthday.setFullYear(1995);
birthday.setHours(3);
birthday.setMinutes(30);
birthday.setSeconds(25);


console.log(birthday);