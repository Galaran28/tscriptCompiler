var i;
var j;
var k;

i = 1;
j = 2;
k = 3;

if (i < 17)
  j = 23;
else
  k = 13;

if (j < k)
  i = 2;
else
  j = 4;

if (i < j) k = 8;

if (i > j) k = 9;

console.log(i + j + k + 29);

