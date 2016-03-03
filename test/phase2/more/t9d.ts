var p;
p = function (x) { console.log(x); return x; };

var f;
f = function(x, y) { console.log(x + y + 2); };

f(p(1), p(2), p(3), p(4));

