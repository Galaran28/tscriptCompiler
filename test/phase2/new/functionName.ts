var arg;
var sum;

var g = function f() {
  if (arg > 0) {
    sum = sum + 1;
    arg = arg - 1;
    f();
  }
};

arg = 10;
sum = 0;
g();
console.log(sum);

