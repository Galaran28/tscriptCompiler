
var x;

x = 1;

if (isFinite(x))
{
  print (42);
}

if (isNaN(x))
{
  print (43);
}

x = x + NaN;

if (isFinite(x))
{
  print (43);
}

if (isNaN(x))
{
  print (42);
}

x = x + Infinity;

if (isFinite(x))
{
  print (43);
}

if (isNaN(x))
{
  print (42);
}

x = readln();
while (!(x == null))
{
  print (x);
  x = readln();
}

