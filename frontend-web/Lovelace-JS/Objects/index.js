
const person = {
    age:20,
    name:"Jane",
    gender:"female",
    greet: function(){
        console.log('inside object:',this);
        console.log(`Hello ${this.name}`);
    }
}
console.log(person.age);
console.log(person["name"]);
console.log({person});
person.country = "Kenya";
console.log({person});

person.age = 22;
console.log({person});

delete person.country;
console.log({person});
//JSON placeholder--> to be read

person.greet();

console.log(this);
person.introduction = () => {
    console.log(`My name is ${person.name} and I am ${person.age} years old`);
    // return `My name is ${name}`;
}
person.introduction()
person.introduction = function (age){
    return `My name is ${this.name} and I am ${age} years old.`;
}
console.log(person.introduction(20));


//given an array of objects with a student name and score properties, return an array with students who scored more than 50.

const scores =[
    {
        name:"Max",
        score:20.3
    },
    {
        name:"Jane",
        score:50
    },
    {
        name:"Mark",
        score:60
    },
    {
        name:"Tom",
        score:55
    }
]

function grade(scores){
    let a = [];
    for (studScore of scores){
     if(studScore.score > 50){
        a.push(studScore.name);
     }
   }
   return a;
}
console.log(grade(scores));
function grading(scores){
   return scores.filter(studentScore => studentScore.score > 50)
 }

console.log(grading(scores));


// constructors 
function Car(model,color,brand){
    this.model = model;
    this.color = color;
    this.brand = brand;
}

const car = new Car('Maybach','Black','Mercedes');

console.log(car.color);
console.log({car});

car.description = function(){
    console.log(`This is ${this.brand}.`);
}

car.description();

const toyota = new Car('Corolla','Blue','Toyota');
console.log({toyota});
console.log({car});