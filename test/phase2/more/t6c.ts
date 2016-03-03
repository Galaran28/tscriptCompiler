var x;

try {
  x = 1;
  console.log(x);
  throw x;
  console.log(42);
}
catch (y)
{
  console.log(y + 1);
}
console.log(3);
console.log(4);
console.log(5);

