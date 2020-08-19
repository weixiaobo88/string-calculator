# String Calculator
This is an excellent Kata for TDD beginners. It leads you through some simple test cases and code, making you follow the rhythm of red-green-refactor.

## User Guide
- Do one task at a time. The trick is to learn to work incrementally.
- There is no need to test for invalid inputs for this kata, assume the string you receive is correctly formatted.


## Step 1
Create a simple String calculator with a method signature:

    int Add(string numbers)
The method can take up to two numbers, separated by commas, and will return their sum.

For example “” or “1” or “1,2” as inputs.

For an empty string it will return 0.

```
• Start with the simplest test case of an empty string and move to one and two numbers
• Remember to solve things as simply as possible
• Remember to refactor after each passing test
```

## Step 2
Allow the Add method to handle an unknown amount of numbers.

## Step 3
Allow the Add method to handle new lines between numbers (instead of commas):

- The following input is valid: “1\n2,3” (will equal 6)

- The following input is NOT valid: “1,\n” (no need to handle this in your code)

## Step 4
Support different delimiters:

- To change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’.

- The first line is optional. All existing scenarios should still be supported (existing tests should still pass).