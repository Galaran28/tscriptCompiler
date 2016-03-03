var f;
f = function (x) { console.log(x); };
f(42);
f("hello");
f(42 + "hello");

var f2;
f2 = function (f, g, h) { h(f + g); };
f2(17, "25", f);

var i;
f2("hel", "lo", f, i = 9);

f(i + 33);


