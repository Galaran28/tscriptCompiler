// first create an object to serve as a prototype object
// the prototype will contain a single field to be inherited, f
var x;
x = { f : 1066 };

// now create a constructor and set its "prototype" property to point
// to the prototype object
var y;
y = { prototype : x};

// finally, use the constructor to create another object, whose internal
// protoptype will be set to the prototype object
var z;
z = new y();

// note that the f field will be inherited (dynamically) from the prototype
console.log(z.f);


