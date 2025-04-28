let x="5"; 
let y='5';
//loosely equal
let looselyEqual= (x==y) ? true:false;
console.log({looselyEqual});
console.log(typeof(looselyEqual));

//strict equal
let strictEqual= (x===y) ? true:false;
console.log(strictEqual);
console.log(typeof(x));

//compound assignments
let a=6;
a+=6;
console.log(a);

//increment & decrement
let b=4;
b++;
console.log({b});
b--;
console.log({b});

//comparison operators
let c=5;
let d=10;
let moreThan= (c>=d) ? true:false;
console.log({moreThan});

//logical operators
let logicalAND=(x==y) && (c>=d) ? true:false;
console.log({logicalAND});

let logicalOR= x==y || c>=d ? true:false;
console.log({logicalOR}); 

let userOnline= false;
let logicalNOT= !userOnline ? true : false;
console.log({logicalNOT});
console.log(typeof(logicalNOT));

/*let userOnline= false;
let logicalNOT= !userOnline ?  "online" : "offline";
console.log({logicalNOT});
console.log(typeof(logicalNOT));*/

//implicit coercion
let num = a;
num *= '5';
console.log({num});

let e=+'56'
console.log({e});
console.log(typeof(e));

 let item= 5;
 console.log(typeof item);
 item=String(item);
 console.log(item);
 item=Array(item);
 console.log(item)

 let obj = Object(5);
 console.log({obj});

 //COPIES OF STRING

 let copy = 'I want to copy html.\n';
 console.log(copy.repeat(3));
 





