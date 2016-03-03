
var pitch;
pitch = 99;

try {
  var x;
  x = 13;
  throw 66;
}
catch (pitch) {
  var y;
  y = pitch;
  console.log(y);
  console.log(pitch);
}
finally {
  var z;
  z = 17;
}


console.log(x + y + z + pitch);

