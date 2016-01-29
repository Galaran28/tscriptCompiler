// test toNumber for strings containing a very big hex constant

var bigHex;
bigHex = "0xffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" * 1;
var infin;
infin = bigHex * bigHex * bigHex * bigHex * bigHex * bigHex * bigHex *
  bigHex * bigHex * bigHex * bigHex * bigHex;
console.log(bigHex);
console.log(infin);

