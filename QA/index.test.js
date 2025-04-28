const product = require('./index');
test ('should provide a product', ()=>{
    expect(product(3,2)).toBe(6)
});