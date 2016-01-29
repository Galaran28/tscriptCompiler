//
// test simple assignment
//

var abc;

abc = 42;
console.log(abc);

console.log(abc = 42);

var def;
console.log(def);
console.log(abc = (def = 42) + 1);

var x;
x = 12;
x = "12";

var y;

y = x;
console.log(y);
y = "123";
console.log(y);
y = 123;
console.log(y);

var x2;
x2 = "12";
console.log(x2);
x2 = 12;
console.log(x2);
x2 = y;
console.log(x2);

