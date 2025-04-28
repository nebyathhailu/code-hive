const dateUtils = require('./dateUtils')
function generateWelcomeMessage(username, data){
    const formattedDate = dateUtils.getFormattedDate(Date);
    return `Hello ${username}, today is ${formattedDate}`;
}
module.exports = {generateWelcomeMessage};