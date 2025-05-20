const add = (a,b) => {
    return a + b;
}

const multiple = (p,q,callback) => {
     y = callback(p,q);
     return y * 10;
}

console.log(multiple(9,9,add));

