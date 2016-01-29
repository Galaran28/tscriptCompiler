//
// This tests the single semantic error detected by the system
// prior to evaluating the program. The system is responsible
// for detecting that the left-hand-side of an assignment is
// illegal.
//

var abc;

console.log(abc = 1);
console.log(1 = abc);

