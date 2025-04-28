jest.mock('./dateUtils'); // this must be at the top
console.log('1. Date is being mocked above');

const dateUtils = require('./dateUtils');
console.log('2. Imported mocked dataUtils module', dateUtils);

const { generateWelcomeMessage } = require('./messageService');
console.log('3. Imported the generated welcome message from message service');

test('should generate welcome  with mocked data', () => {
dateUtils.getFormattedDate.mockReturnValue('April 8,2025');
console.log('mocked ');
const result = generateWelcomeMessage('Jane', new Date ('2025-04-08'));
expect(dateUtils.getFormattedDate).toHaveBeenCalled();
expect(result).toBe('Hello Jane, today is April 8,2025');
});