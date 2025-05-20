//callback
const hello = (name) => {
    console.log(`Hello, there! ${name}`);
}

const greet = (name,hello) => {
    console.log(`Hello ${name}`);
    hello(name);
}

greet("Henry", hello);

// setTimeout(() => {
//     console.log('This ia  a timeout');
// },2000);

// setInterval(() => {
//     console.log('THis is an interval.');
// },3000);


//Closure

const outerFunction = () => {
    let person = 'John';
    function innerFunction(){
        console.log(`Hi ${person}`);
    }
    return innerFunction;
};

console.log(outerFunction()); //output --> [Function: innerFunction]

const callOuterFunction = outerFunction();
callOuterFunction();

//promises

const internship = true;

const promise = new Promise (function(resolve, reject){
    if(internship){
        resolve('I will visit you.')
    }
    else{
        reject('I am looking for a job.')
    }
});

promise
.then(() => {
    console.log('I have an internship.');
})
.catch(()=>
console.log('There is still to get a job.'))
.finally(()=> {
    console.log('I enjoyed my time at AkiraChix.');
});

console.log({promise});

const tour =new Promise((resolve,reject) =>{
    setTimeout(()=>{
        // resolve("I want to tour Mombasa.")
        reject('I do not want to tour' )
    },4000);
}
);

async function visitPlaces (){
    try{
        const visit = await tour;
            console.log({visit});
    }
    catch(error){
        console.log({error});
    }
}

visitPlaces()