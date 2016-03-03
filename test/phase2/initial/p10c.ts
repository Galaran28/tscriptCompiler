var f;
f = function (x) { var g; g = function (y) { return x + y;}; return g;};

var f1;
f1 = f(19);

console.log(f1(23));

var f2;
f2 = f(3);

console.log(f2(39));

