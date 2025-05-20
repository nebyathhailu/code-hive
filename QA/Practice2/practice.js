//1. function to revere a string

 const reverseString=(string)=>{
    let x = string.split("").reverse().join("");
    return x;
}


//2.capitalize first letter of each word

const capitalizeWord=(string)=>{
    return string.split(" ").map(item =>item.charAt(0).toUpperCase() + item.slice(1)).join(" ");
}

//3. calculate factorial

function calculateFactorial(num){
    if (num == 0){
      return 1;
    }
    else{
     return  num * calculateFactorial(num-1);
    }
  }


  //4. check if number is even

  const checkEven=(number)=>{
    if (number % 2 == 0){
        return true;
    }
    else {
        return false;
    }
  }


  //5. longest word in sentence

  function longestWord(sentence){
    let y = sentence.split(" ");
    let i = 0;
    let j;
    let word;
    for(i;i<y.length;i++){
        j=i+1;
        if (y[i].length < 3) {
            word = y[j];
        }
        else {
            word = y[i];
    }
  }
  return word;
  }
  console.log(longestWord("My name is Nebyat."));


  //6. flatten a nested array
 
  function flattenArray(arr){
    return arr.flat(Infinity);
  }
  console.log(flattenArray([1, [2, [3, 4]], 5]));

function uncomplete(allModules,completedModulues){
    let uncompletedModules = [];
    for (module of allModules){
        if (completedModulues.includes(module))
          {continue;} 
        else{
            uncompletedModules.push(module);  
        }
           
    }
    return uncompletedModules;
}
console.log(uncomplete(["a","b","c","d"],["c","d"]));
