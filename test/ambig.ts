// test with variables that have ambiguous types

var x;
console.log(x);
x = 17;
console.log(x);
x = "abc";
console.log(x);
var y;
x = y;
console.log(x);

