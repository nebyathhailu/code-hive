const { isValidPassword, isValidAge, bankAllow} = require('./password-validator');

// describe('password validation',() => {
    // test ('valid password',() => {
        // expect(isValidPassword("password124")).toBe(true);
    // });

    // test('invalid password', () => {
    //     expect(isValidPassword("pass12")).toBe(false);
   
    // });
// });

test(('check if age is valid'), () => {
    expect(isValidAge(18)).toBe(true);
});

test(('allowed amount'), () =>{
    expect(bankAllow(1500)).toBe(true);
});

test(('fewer amount'),() => {
    expect(bankAllow(10001)).toBe(false);
});

describe(('Email validation') , () => {
    
})