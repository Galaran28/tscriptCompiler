//*******************INITILIZE**********************//
// prototypes
var Array;
Array = {length:0};

// loop controls
var cur;
var index;
var curIndex;

// sets and key symbols
var prod; // list of products as found in the input file
prod = new Array();
var SS; // start symbol
var nonterm; // nonterminal symbols
nonterm = new Array();
var term; // terminal symbols
term = new Array();


//*******************PARSE INPUT FILE**********************//
// read productions into list
index = 0;
cur = readln();
while (!(cur == null)) {
  prod[index] = split(cur, " ");
  index = index + 1;
  cur = readln();
}
prod.length = index;


//*******************DETERMINE START SYMBOL**********************//
SS = prod[0][0];


//*******************DETERMINE NONTERMINALS**********************//
index = 0;
while (index < prod.length) {
  cur = prod[index];
  nonterm[cur[0]] = cur[0];
  index = index + 1;
}


//*******************DETERMINE TERMINALS**********************//
var curSymbol;
index = 0;
curIndex = 0;
while (index < prod.length) {
  cur = prod[index];
  while (curIndex < cur.length) {
    curSymbol = cur[curIndex];

    // if the symbol is not a nonterminal than it is a terminal
    if (nonterm[curSymbol] == undefined) {
      term[curSymbol] = curSymbol;
    }

    curIndex = curIndex + 1;
  }
  index = index + 1;
  curIndex = 0;
}


// print productions
//console.log(prod.length);
//index = 0;
//curIndex = 0;
//while (index < prod.length) {
//cur = prod[index];
//console.log(cur.length);
//while (curIndex < cur.length) {
//console.log(cur[curIndex]);
//curIndex = curIndex + 1;
//}
//console.log("\n");
//index = index + 1;
//curIndex = 0;
//}


//*******************DISPLAY RESULTS**********************//
var output;
var k;

console.log("Start Symbol\n");
console.log(SS + "\n");

console.log("Nonterminals\n");
index = 0;
output = "";
k = keys(nonterm);
while (index < k.length) {
  output = output + k[index] + " ";
  index = index + 1;
}
console.log(output + "\n");

console.log("Terminals\n");
index = 0;
output = "";
k = keys(term);
while (index < k.length) {
  output = output + k[index] + " ";
  index = index + 1;
}
console.log(output);
