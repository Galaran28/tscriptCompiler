
var x;

x = 1;

if (isFinite(x))
{
  console.log(42);
}

if (isNaN(x))
{
  console.log(43);
}

x = x + NaN;

if (isFinite(x))
{
  console.log(43);
}

if (isNaN(x))
{
  console.log(42);
}

x = x + Infinity;

if (isFinite(x))
{
  console.log(43);
}

if (isNaN(x))
{
  console.log(42);
}

x = readln();
while (!(x == null))
{
  console.log(x);
  x = readln();
}

