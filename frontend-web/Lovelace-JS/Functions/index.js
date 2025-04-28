//add
function add(num1,num2){
    return num1+num2;
}

console.log(add(4,5));
let b=60;
function subtract(num1,num2){
    let a=65;
    const result= num1-num2;
    console.log({result});
    return result;
    console.log({bInside:b});
    console.log({aInside:a});
}
console.log(subtract(20,10));
console.log({bOutside:b});
// console.log({aOutside:a});

// function expression
const greet= function (name){
    return `Hello ${name}`;
};
console.log(greet('Amanda'));

const personAge = (birthYear) => {
    const age= new Date().getFullYear()-Number(birthYear);
    return age;
}
console.log(personAge(2002));

//IIFE --> is 
z = (function(){
    const a=30;
    return a;
})();
console.log(z);
console.log(z+30)

let num=[1,2,3,4,5,6];
let number = num.reduce((previous,current)=> previous + current,10);
console.log(number);