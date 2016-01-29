// some simple tests for the type inferencing

// first, the normal case (declare, assign, use, single type)
var x;
x = 17;
console.log(x);

// now, what if var is used before it is assigned?
var y;
console.log(y);

// and now used before it assigned, then assigned
var z;
console.log(z);
z = 1066;
console.log(z);

// addition and multiply

console.log(x + x * x);
console.log(x * x * z);

// delayed ambiguity

var w;
var w2;
w = 17;
console.log(w + w + w);
w = w2;
console.log(w + w + w);

