
var F;

F = {};

// first create an object to serve as a prototype object
// the prototype will contain a single field to be inherited, f
var x;
x = new F();
x.f = 14;

// now create a constructor and set its "prototype" property to point
// to the prototype object
var Y;
Y = new F();
Y.prototype = x;

// now use the constructor to create objects, whose internal
// protoptype will be set to the prototype object
var z1;
z1 = new Y();
var z2;
z2 = new Y();
var z3;
z3 = new Y();

// the f field will be found in the prototype
console.log(z1.f+z2.f+z3.f);

// the f field can be changed in the prototype
x.f = 355;

// the f field will be found in the prototype
console.log(z1.f+z2.f+z3.f+1);

