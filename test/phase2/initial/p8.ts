var f;

f = function () {
  var g;
  g = function () { return 42; };
  return g;
};

var f1;
f1 = f();
console.log(f1());

