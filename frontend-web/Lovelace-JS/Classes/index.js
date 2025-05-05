function Person(name,age){
    this.name = name;
    this.age = age;
    this.greet = function(){
        return `Hello my name is ${this.name} and I am ${age} years old.`
    }
}

const anne = new Person('Anne',22);
console.log({anne});

Person.prototype.nationality = 'Kenyan';
console.log({anne});
console.log(anne.nationality);

function Driver(name, carModel, rating, location){
    this.name = name;
    this.carModel = carModel;
    this.rating = rating;
    this.location = location;
}

Driver.prototype.getDetails = function() {
    return `The driver's name is ${this.name} and the car model is ${this.carModel}. `
}

Driver.prototype.isTopRated = function() {
    return this.rating > 4.5 ? true : false;
}

Driver.prototype.location = 'Nairobi';

const mark = new Driver("Mark", "Subaru", 3.7,"AA");
console.log({mark});
console.log(mark.getDetails());
console.log(mark.isTopRated());
mark.location = 'Kigali'
console.log(mark.location);

const john = new Driver("John", "BMW",6.5);
console.log({john});
console.log(john.getDetails());
console.log(john.isTopRated());


class Car{
    constructor(model, color, plateNumber){
        this.model = model;
        this.color = color;
        this.plateNumber = plateNumber
    }
    accelerate(speed){
        return `${this.model} accelerates at ${speed} km/hr. `
    }
}

const toyota = new Car("Toyota", "White", "KCY233k")
console.log({toyota});
console.log(toyota.accelerate(50));


/*you are creating a backend structure for an online platform.
write a student class that accepts name, course , and
 scores (an array of numbers) as arguments */

class Student{
    constructor(name, course, scores)
       { 
        this.name = name;
        this.course = course;
        this.scores = scores;
    }
}

Array.prototype.sum = function(){
   return this.reduce((total,score) => total + score,0);
}

Student.prototype.isPassing = function (){
    // return this.scores.sum()/this.scores.length > 50 ? true : false;
    return this.getAverageScore() > 50 ? true : false;
}

Student.prototype.getAverageScore = function (){
    return this.scores.sum()/this.scores.length;
}


Student.prototype.totalScore = function (){
    return this.scores.sum();
    // return this.getAverageScore() * this.scores.length;
   
}

const student1 = new Student("Mark", "JS",[50,89,78,90,67]);
console.log({student1});
console.log(`The average for ${student1.name} is ${student1.getAverageScore()}`);
console.log(`Has ${student1.name} passed? ${student1.isPassing()}`);
console.log(`${student1.name} has a total score of ${student1.totalScore()}`);

const student2 = new Student("Alice","JS",[30,67,43,23,35]);
console.log({student2});
console.log(`The average for ${student2.name} is ${student2.getAverageScore()}`);
console.log(`Has ${student2.name} passed? ${student2.isPassing()}`);
console.log(`${student2.name} has a total score of ${student2.totalScore()}`);


//inheritance

class Bus extends Car {
    constructor(model, color, plateNumber, seats){
        super(model, color, plateNumber);
        this.seats = seats;
    }
    capacity(){
        return `${this.model} has ${this.seats} seats.`
    }
}
const matatu = new Bus("Mazda", "grey", "KBV 0022G", 14 );
console.log({matatu});
console.log(matatu.accelerate(34));
console.log(matatu.capacity());

//