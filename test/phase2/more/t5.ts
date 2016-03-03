
var i;
var j;

i = 1;
j = 1;
while (i < 6) {
  while (j < 10) {
    break;
    console.log(j);
    j = j + 1;
  }
  console.log(i);
  i = i + 1;
  if (i == 4) break;
}
console.log(i);
console.log(i + 1);

