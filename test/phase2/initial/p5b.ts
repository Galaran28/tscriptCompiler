var i;
var j;
var k;
var l;

i = 1;
j = 2;
k = 1;
l = 19;

while (i < 17)
{
  console.log(i);
  k = k + 2;
  if (i + j == k) continue;
  i = i + 1;
}

console.log(i + j + k + l + 17);

