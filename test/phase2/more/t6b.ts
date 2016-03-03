
try {
  try {
    throw 1;
  }
  catch (e)
  {
    console.log(1);
    throw e;
    console.log(43);
  }
  finally {
    console.log(2);
  }
  console.log(43);
}
catch (y)
{
  console.log(y+2);
}
finally
{
  console.log(4);
}
console.log(5);

