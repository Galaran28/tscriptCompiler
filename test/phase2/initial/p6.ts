console.log(0);

var n;
var j;

n = 5;
j = 0;

while (n < 10)
{
  console.log(n);
  try {
    console.log(1999);
    while (j < 10)
    {
      console.log(n); console.log(j);
      if (n + j == 11)
      {
        j = 0;
        throw 1918;
      }
      j = j + 1;
    }
    console.log(1066);
  }
  catch (e)
  {
    console.log (e);
  }
  n = n + 1;
}

