
var i;

i = { a : 12, b : 10, c : 20 };
console.log(i.a + i.b + i.c);

i = { a : "a", b : "b", c : "c" };
console.log(i.a + i.b + i.c);
console.log(i[i.a] + i[i.b] + i[i.c]);

var j;
var k;
j = 2;
k = 4;
i = { a : 12, b : j + 8, c : j + k +14 };
console.log(i.a + i.b + i.c);

i.d = i;
i.d.a = 12;
i.d.b = 10;
i.d.c = 20;
console.log(i.d.a + i.d.b + i.d.c);
console.log(i["d"]["a"] + i["d"]["b"] + i["d"]["c"]);

i.a = 42;
i.b = 0;
i.c = 0;
console.log(i.a + i.b + i.c);
console.log(i["a"] + i["b"] + i["c"]);


