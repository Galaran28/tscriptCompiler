F = {};

this.x = 42;

console.log(this.x);

x = new testThis();
x.printXYZ();

x = new F();
x.f = testThis;
x.f();
console.log(x.xyz);

