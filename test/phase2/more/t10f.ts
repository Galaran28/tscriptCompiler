
var p;
p = function (x) { console.log(x); return x; };

var f;
f = function(x, y) { if (y == undefined) y = 1; console.log(x + y); };

f(p(1), p(2));
f(p(4));

