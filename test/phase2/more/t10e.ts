
var i;
i = 1;

var x;
x = function () { return function () { console.log(i); i = i + 1;};}()();
console.log(x);
x = function () { return function () { console.log(i); i = i + 1;};}()();
console.log(x);
x = function () { return function () { console.log(i); i = i + 1;};}()();
console.log(x);
x = function () { return function () { console.log(i); i = i + 1;};}()();
console.log(x);
x = function () { return function () { console.log(i); i = i + 1;};}()();
console.log(x);

