
// put a pseudo-constructor for a "basic" object into the global object
BasicObject = {};

// put a prototype object into the global object
BattleOfHastingsPrototype = new BasicObject();
BattleOfHastingsPrototype.date = 1066;

// put another pseudo-constructor into the global
BattleOfHastings = new BasicObject();
BattleOfHastings.prototype = BattleOfHastingsPrototype;

var z;
z = new BattleOfHastings();

console.log(z.date);

// these variables should be in the global object
console.log(NaN);
console.log(Infinity);
console.log(undefined);

console.log(NaN + Infinity);

