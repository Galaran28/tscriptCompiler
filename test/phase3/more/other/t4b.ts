
var x;

x = 1;

if (isNaN(x))
{
  console.log(43);
}

x = NaN;

if (isNaN(x))
{
  console.log(42);
}

x = Infinity;

if (isNaN(x))
{
  console.log(43);
}

