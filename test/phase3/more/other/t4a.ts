
var x;

x = 1;

if (isFinite(x))
{
  console.log(42);
}

x = NaN;

if (isFinite(x))
{
  console.log(43);
}

x = Infinity;

if (isFinite(x))
{
  console.log(43);
}

