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
var SS; // start symbol
var nonterm; // nonterminal symbols
var term; // terminal symbols
var nullset; // set of null deriving symbols
var first; // set of first sets


//*******************PARSE INPUT FILE**********************//
// read productions into list
prod = new Array();
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
nonterm = {};
index = 0;
while (index < prod.length) {
  cur = prod[index];
  nonterm[cur[0]] = cur[0];
  index = index + 1;
}


//*******************DETERMINE TERMINALS**********************//
term = {};
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


//*******************DETERMINE NULLSET**********************//
nullset = {};
var curSymbol;
var changed;
changed = true;
while (changed) {
  index = 0;
  curIndex = 1;
  changed = false;
  while (index < prod.length) {
    cur = prod[index];

    // if right hand side is empty than symbol is null deriving
    if (cur.length == 1) {
      // check of current symbol is already in the set before adding
      if (nullset[cur[0]] == undefined) {
        nullset[cur[0]] = cur[0];
        changed = true;
      }
    }

    while (curIndex < cur.length) {
      curSymbol = cur[curIndex];

      // if the symbol is a terminal than the rule does not null derive
      if (!(term[curSymbol] == undefined)) {
        break;
      }

      // if a nonterminal does not null derive the rule does not null derive
      if (nullset[curSymbol] == undefined) {
        break;
      }

      // if nothing has endend the loop than the rule null derives
      if (curIndex + 1 == cur.length) {
        // check of current symbol is already in the set before adding
        if (nullset[cur[0]] == undefined) {
          nullset[cur[0]] = cur[0];
          changed = true;
        }
      }

      curIndex = curIndex + 1;
    }

    index = index + 1;
    curIndex = 1;
  }
}


//*******************DETERMINE FIRST SETS**********************//
// initilize first with known nonterminals
first = {};
index = 0;
k = keys(nonterm);
while (index < k.length) {
  first[k[index]] = {};
  index = index + 1;
}

// calculate first sets
var curSymbol;
var curFirst;
var changed;
changed = true;
while (changed) {
  index = 0;
  curIndex = 1;
  changed = false;
  while (index < prod.length) {
    // get current production rule
    cur = prod[index];
    // get first set for current production
    curFirst = first[cur[0]];

    // iterate over right hand side symbols
    while (curIndex < cur.length) {
      curSymbol = cur[curIndex];

      // if the symbol is a terminal than add to first set and end parsing
      if (!(term[curSymbol] == undefined)) {
        // check of current symbol is already in the set before adding
        if (curFirst[curSymbol] == undefined) {
          curFirst[curSymbol] = curSymbol;
          changed = true;
        }
        break;
      }

      // if symbol is nonterminal than add its first set to this one
      if (!(nonterm[curSymbol] == undefined)) {
        // get first set of the current symbol
        var tmpFirst;
        tmpFirst = keys(first[curSymbol]);
        var tmpIndex;
        tmpIndex = 0;
        var tmpSymbol;

        // add any new symbols to the current first set
        while (tmpIndex < tmpFirst.length) {
          tmpSymbol = tmpFirst[tmpIndex];

          // check of current symbol is already in the set before adding
          if (curFirst[tmpSymbol] == undefined) {
            curFirst[tmpSymbol] = tmpSymbol;
            changed = true;
          }

          tmpIndex = tmpIndex + 1;
        }

        // if the nonterminal does not null derive than we are done
        if (nullset[curSymbol] == undefined) {
          break;
        }
      }

      curIndex = curIndex + 1;
    }

    index = index + 1;
    curIndex = 1;
  }
}


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
console.log(output + "\n");

console.log("Null-Deriving Nonterminals\n");
index = 0;
output = "";
k = keys(nullset);
while (index < k.length) {
  output = output + k[index] + " ";
  index = index + 1;
}
console.log(output + "\n");

console.log("First Sets\n");
index = 0;
curIndex = 0;
output = "";
k = keys(first);
// iterate over first sets
while (index < k.length) {
  output = output + k[index] + ":";

  // extract first set for current key
  cur = keys(first[k[index]]);

  // print first set contents
  while (curIndex < cur.length) {
    output = output + " " + cur[curIndex];
    curIndex = curIndex + 1;
  }
  output = output + "\n";
  index = index + 1;
  curIndex = 0;
}
console.log(output + "\n");
