//
// This should not be an error as it should insert the "def" property
// into the global object.
//
// But since we are not yet implementing the global object we will treat
// this as an error for now.
//

var abc;

def = 5;

console.log(def + def);
console.log(abc + def);

