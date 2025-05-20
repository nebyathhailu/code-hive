function isValidPassword(password){
    const isCorrectLength = password.length >= 8 && password.length <= 16;
    const hasLetter = /[a-zA-Z]/.test(password);
    const hasNumber = /[0-9]/.test(password);
    const isAlnum = /^[a-zA-Z0-9] + $/.test(password);
    return isCorrectLength && hasLetter && hasNumber && isAlnum;
}

function isValidAge(age){
    return age >= 18 && age <= 60;
}

function bankAllow(money){
    return money > 1000 && money < 10000;
}

function isValidEmail(email){
    const valid = /^[^\s@]+@[^\s@]+\.[^\s@]+$/
}
module.exports ={ isValidPassword, isValidAge, bankAllow, isValidEmail};

console.log(isValidAge(56));