// strings containing floating-point numeric literals

var x;
x = ".1";
console.log(x*1);
x = "1.";
console.log(x*1);
x = "1.1e1";
console.log(x*1);
x = "1.1e-1";
console.log(x*1);
x = "1.1e+1";
console.log(x*1);
x = "1e1";
console.log(x*1);
x = "0";
console.log(x*1);
x = "100.0";
console.log(x*1);
x = "1.2345678901234567890";
console.log(x*1);
x = ("1.0" * 1) + ("0.2345678901234567890" * 1);
console.log(x);
x = "1.234e-8";
console.log(x*1);
x = "7e-9";
console.log(x*1);
x = "7e90";
console.log(x*1);
x = "1.234e90";
console.log(x*1);

