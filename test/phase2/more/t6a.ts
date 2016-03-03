try {
  console.log(x);
}
catch (y)
{
  console.log(y);
}
finally
{
  console.log("finally");
}
try {
  console.log(42);
}
catch (y)
{
  console.log(43);
  console.log(y);
}
finally
{
  console.log("finally");
}
