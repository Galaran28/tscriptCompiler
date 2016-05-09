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
var follow; // set of follow sets
var predict; // set of predict sets
var isLL1; // boolean of LL(1) compliance


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


//*******************DETERMINE FOLLOW SETS**********************//
// initilize follow with known nonterminals
follow = {};
index = 0;
k = keys(nonterm);
while (index < k.length) {
  follow[k[index]] = {};
  index = index + 1;
}

// start set automatically gets EOF
follow[SS]["EOF"] = "EOF";

// calculate follow sets
var curSymbol;
var curFollow;
var changed;
changed = true;
while (changed) {
  index = 0;
  curIndex = 1;
  changed = false;
  while (index < prod.length) {
    // get current production rule
    cur = prod[index];

    // iterate over right hand side symbols
    while (curIndex < cur.length) {
      curSymbol = cur[curIndex];

      // get follow set for current symbol
      curFollow = follow[curSymbol];

      // only care about nonterminal symbols
      if (!(nonterm[curSymbol] == undefined)) {

        // if last symbol in production, add follow set of the left hand side
        // to the follow set of the current symbol
        if (curIndex + 1 == cur.length) {

          // get follow set of the left hand side symbol
          var tmpFollow;
          tmpFollow = keys(follow[cur[0]]);
          var tmpIndex;
          tmpIndex = 0;
          var tmpSymbol;

          // add any new symbols to the current follow set
          while (tmpIndex < tmpFollow.length) {
            tmpSymbol = tmpFollow[tmpIndex];

            // check of current symbol is already in the set before adding
            if (curFollow[tmpSymbol] == undefined) {
              curFollow[tmpSymbol] = tmpSymbol;
              changed = true;
            }

            tmpIndex = tmpIndex + 1;
          }

          break;
        } else { // add first set of remaining symbols

          var firstIndex;
          firstIndex = curIndex + 1;
          // iterate over remaining right hand side symbols
          while (firstIndex < cur.length) {
            firstSymbol = cur[firstIndex];

            // if the symbol is a terminal than add to follow set
            if (!(term[firstSymbol] == undefined)) {
              // check if current symbol is already in the set before adding
              if (curFollow[firstSymbol] == undefined) {
                curFollow[firstSymbol] = firstSymbol;
                changed = true;
              }
              break;
            }

            // if symbol is nonterminal than add its first set to this follow set
            if (!(nonterm[firstSymbol] == undefined)) {
              // get first set of the first symbol
              var tmpFirst;
              tmpFirst = keys(first[firstSymbol]);
              var tmpIndex;
              tmpIndex = 0;
              var tmpSymbol;

              // add any new symbols to the current follow set
              while (tmpIndex < tmpFirst.length) {
                tmpSymbol = tmpFirst[tmpIndex];

                // check of current symbol is already in the set before adding
                if (curFollow[tmpSymbol] == undefined) {
                  curFollow[tmpSymbol] = tmpSymbol;
                  changed = true;
                }

                tmpIndex = tmpIndex + 1;
              }

              // if the nonterminal does not null derive than we are done
              if (nullset[curSymbol] == undefined) {
                break;
              }
            }

            firstIndex = firstIndex + 1;
          }
        }
      }

      curIndex = curIndex + 1;
    }

    index = index + 1;
    curIndex = 1;
  }
}


//*******************DETERMINE PREDICT SET**********************//
predict = {};
var curSymbol;
index = 0;
curIndex = 1;
while (index < prod.length) {
  predict[index] = {};
  curPredict = predict[index];
  cur = prod[index];

  // if right hand side is empty than predict is the follow set
  if (cur.length == 1) {
    // get follow set of the first symbol
    var tmpFollow;
    tmpFollow = keys(follow[cur[0]]);
    var tmpIndex;
    tmpIndex = 0;
    var tmpSymbol;

    // add symbols to predict set
    while (tmpIndex < tmpFollow.length) {
      tmpSymbol = tmpFollow[tmpIndex];
      curPredict[tmpSymbol] = tmpSymbol;
      tmpIndex = tmpIndex + 1;
    }
  }

  while (curIndex < cur.length) {
    curSymbol = cur[curIndex];

    // if the symbol is a terminal than add that to the predict set
    if (!(term[curSymbol] == undefined)) {
      curPredict[curSymbol] = curSymbol;
      break;
    }

    // if symbol is a nonterminal add first to predict set
    if (!(nonterm[curSymbol] == undefined)) {
      // get first set
      var tmpFirst;
      tmpFirst = keys(first[curSymbol]);
      var tmpIndex;
      tmpIndex = 0;
      var tmpSymbol;

      // add symbols to the predict
      while (tmpIndex < tmpFirst.length) {
        tmpSymbol = tmpFirst[tmpIndex];
        curPredict[tmpSymbol] = tmpSymbol;
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


//*******************DETERMINE LL(1)**********************//
//console.log("determine ll1");
isLL1 = true; // assume true untill conflict is found
//var curSymbol;
//var tmpSymbol;

//var prodIndex;
//var prodSeachIndex;
//var predictIndex;
//var predictSearchIndex;

//var curProd;
//var curProdSearch;
//var curPredict;
//var curPredictSearch;

//prodIndex = 0;
// iterate over productions sets
//console.log("just before first loop");
//while (prodIndex < prod.length) {
//console.log("just inside first loop");
  //curProd = prod[index];

  // find another production with the same lhs
  //prodSeachIndex = prodIndex;
  //console.log("just before second loop");
  //while (prodSeachIndex < prod.length) {
  //console.log("at start of second loop");
    //curProdSearch = prod[prodSeachIndex];

    // if lhs do not match, move to the next set
    //if (!(curProdSearch[0] == curProd[0])) {
    //console.log("no match, moving on");
    //prodSeachIndex = prodSeachIndex + 1;
    //continue;
    //}

    // compare predict sets looking for conflicts
    //predictIndex = 0;

    // get an iterator over the current predict set
    //curPredict = keys(predict[prodIndex]);
    // get a set of the other predict set
    //curPredictSearch = predict[prodSeachIndex];

    //while (predictIndex < curPredict.length) {
    //curSymbol = curPredict[predictIndex];
      // if symbol is in another predict set grammer is not LL(1)
      //if (!(curPredictSearch[curSymbol] == unknown)) {
      //isLL1 = false;
      //break;
      //}

      //predictIndex = predictIndex + 1;
      //}

    // if conflict has been found we can exit
    //console.log("at end of loop");
    //if (isLL1) {
    //prodSeachIndex = prodSeachIndex + 1;
    //} else {
      //break;
      //prodSeachIndex = prod.length;
      //}
      //}
  // if conflict has been found we can exit
  //if (isLL1) {
  //prodIndex = prodIndex + 1;
  //} else {
  ////break;
  //prodIndex = prod.length;
  //}
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

console.log("Follow Sets\n");
index = 0;
curIndex = 0;
output = "";
k = keys(follow);
// iterate over  sets
while (index < k.length) {
  output = output + k[index] + ":";

  // extract set for current key
  cur = keys(follow[k[index]]);

  // print set contents
  while (curIndex < cur.length) {
    output = output + " " + cur[curIndex];
    curIndex = curIndex + 1;
  }
  output = output + "\n";
  index = index + 1;
  curIndex = 0;
}
console.log(output);

console.log("Predict Sets\n");
index = 0;
curIndex = 0;
output = "";
// iterate over productions
while (index < prod.length) {
  // print production contents
  cur = prod[index];
  while (curIndex < cur.length) {
    output = output + cur[curIndex] + " ";
    curIndex = curIndex + 1;
  }
  output = output + "\n";

  // print predict contents
  curIndex = 0;
  cur = keys(predict[index]);
  while (curIndex < cur.length) {
    output = output + cur[curIndex] + " ";
    curIndex = curIndex + 1;
  }
  output = output + "\n\n";

  index = index + 1;
  curIndex = 0;
}
console.log(output);

if (isLL1) {
  console.log("The grammer is LL(1).");
} else {
  console.log("The grammer is NOT LL(1).");
}
