let a='Hello';
let b="HELLO";
console.log(a===b);
console.log(a[-1]);
a[2]='f';
console.log(a);
console.log(a.slice(2,5));
console.log(a.slice(2,a.length));

console.log(a.replace(a[2],'f'));
//a=Array(a);
//console.log(a);
//console.log(a[2]);

//string concatenation
let c='everyone';
console.log(a.concat(' ', c));
console.log(a + ' ' + c);
let d=`${a} ${c}`
console.log(d);

