
// Test Cases for Calculator Application

// Test Case 1: Addition of Two Positive Numbers
// Test Case ID: TC_ADD_01
// Test Description: Verify the addition of two positive numbers.
// Preconditions: The calculator application is open and ready for input.
public void testAdditionPositiveNumbers() {
    int result = calculator.add(25, 10);
    assert result == 35 : "Expected result is 35, but got " + result;
}

// Test Case 2: Subtraction of a Larger Number from a Smaller Number
// Test Case ID: TC_SUB_01
// Test Description: Verify subtraction where the second number is larger than the first.
public void testSubtractionLargerFromSmaller() {
    int result = calculator.subtract(15, 25);
    assert result == -10 : "Expected result is -10, but got " + result;
}

// Test Case 3: Multiplication of Decimal Numbers
// Test Case ID: TC_MUL_01
// Test Description: Verify the multiplication of two decimal numbers.
public void testMultiplicationDecimalNumbers() {
    double result = calculator.multiply(2.5, 4.2);
    assert result == 10.5 : "Expected result is 10.5, but got " + result;
}

// Test Case 4: Division of a Number by Zero
// Test Case ID: TC_DIV_01
// Test Description: Verify division by zero displays an error message.
public void testDivisionByZero() {
    try {
        calculator.divide(50, 0);
        assert false : "Expected ArithmeticException for division by zero";
    } catch (ArithmeticException e) {
        assert e.getMessage().equals("Division by zero is not allowed") : "Unexpected error message: " + e.getMessage();
    }
}

// Test Case 5: Handling Non-Numeric Input
// Test Case ID: TC_ERR_01
// Test Description: Verify that entering non-numeric characters displays an error message.
public void testNonNumericInput() {
    try {
        calculator.add("ABC", 10);
        assert false : "Expected IllegalArgumentException for non-numeric input";
    } catch (IllegalArgumentException e) {
        assert e.getMessage().equals("Invalid input") : "Unexpected error message: " + e.getMessage();
    }
}

// Test Case 6: BODMAS Validation
// Test Case ID: TC_BODMAS_01
// Test Description: Verify that the calculator correctly evaluates an expression using BODMAS.
public void testBODMASValidation() {
    double result = calculator.evaluate("2 + 3 * 4");
    assert result == 14 : "Expected result is 14, but got " + result;
}

// Test Case 7: Addition of Negative Numbers
// Test Case ID: TC_ADD_02
// Test Description: Verify the addition of two negative numbers.
public void testAdditionNegativeNumbers() {
    int result = calculator.add(-5, -10);
    assert result == -15 : "Expected result is -15, but got " + result;
}

// Test Case 8: Division Resulting in a Decimal
// Test Case ID: TC_DIV_02
// Test Description: Verify division resulting in a decimal value.
public void testDivisionResultingDecimal() {
    double result = calculator.divide(10, 4);
    assert result == 2.5 : "Expected result is 2.5, but got " + result;
}

// Test Case 9: Multiplication by Zero
// Test Case ID: TC_MUL_02
// Test Description: Verify multiplication of any number by zero.
public void testMultiplicationByZero() {
    int result = calculator.multiply(999, 0);
    assert result == 0 : "Expected result is 0, but got " + result;
}

// Test Case 10: Large Number Addition
// Test Case ID: TC_ADD_03
// Test Description: Verify addition of two large numbers.
public void testLargeNumberAddition() {
    long result = calculator.add(999999, 888888);
    assert result == 1888887 : "Expected result is 1888887, but got " + result;
}
