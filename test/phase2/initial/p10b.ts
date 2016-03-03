
var i;
var j;
var f;

i = 1;
j = 3;
f = function () {
  var i;
  i = j + 14;
  var g;
  g = function () { return (i + j); };
  return g;
};

var f1;
f1 = f();
console.log(f1());
i = 6;
console.log(f1());
j = 6;
console.log(f1());

f1 = f();
console.log(f1());
i = 6;
console.log(f1());
j = 3;
console.log(f1());

