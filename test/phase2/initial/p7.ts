var f;
var g;

f = function () { var f; f = 17; console.log(f+25); };
f();

g = f;
g();

f = function () {
  var f;
  f = function() { var f; f = 17; console.log(f+25); };
  f();
};
f();


