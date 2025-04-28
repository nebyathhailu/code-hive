let students = ["Jane" , "Amanda", "Hellen"];
console.log(students);
// reassign value 
students[1] = "Tom";
console.log(students);

//add an item to an array
students.push("Susan");
console.log(students)
students.push("Janet", "Mark");
console.log(students);
students.unshift("Anne");
console.log({students});

//Remove items
students.pop();
console.log({students});
students.shift();
console.log({students});

//Loops

let nums = [10,20,30,40];
let double = nums.map(item =>  item*2)
console.log({double});

//Sum of all elements

let count=0;
nums.forEach (item => count += item);
console.log({count});

const total = nums.reduce((acc,item) => acc + item, 0);
console.log({total});
let multiple=[];
for(let i=0; i < nums.length; i++)
{
    multiple.push(nums[i]**2);
}
console.log({multiple})
//filter
const items = [5,2,8,9,1,12,15];
const even = items.filter(item => item% 2 === 0 );
console.log(even);

//find - gives you the first occurrence only

const discover =items.find(item => item > 1);
console.log({discover});

//Destructuring

const [a, b, ...c] = nums;
console.log({a});
console.log({b});
console.log({c});
console.log({nums});




let name=new Array("nebyat","merry") ;
let name2=name.splice(0,1);
console.log(name2);