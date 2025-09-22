/**
 * Hands-On Practice: If Statement
 *
 * LEARNING OBJECTIVES:
 * 1. Understand basic if statement syntax
 * 2. Practice writing conditions using comparison operators
 * 3. Learn to make decisions based on conditions
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Experiment with different values
 */

public class IfStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== IF STATEMENT EXERCISES ===\n");

        // TODO 1: Age Verification
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        }

        // TODO 2: Password Strength
        String password = "mypassword123";
        if (password.length() >= 8) {
            System.out.println("Password is strong enough!");
        }

        // TODO 3: Grade Check
        char grade = 'A';
        if (grade == 'A') {
            System.out.println("Excellent grade!");
        }

        // TODO 4: Number Sign
        int number = 15;
        if (number > 0) {
            System.out.println("Number is positive!");
        }

        // TODO 5: Temperature Check
        double temperature = 32.5;
        if (temperature > 30) {
            System.out.println("It's hot today!");
        }

        // TODO 6: Array Length
        int[] numbers = {1, 2, 3, 4, 5};
        if (numbers.length > 3) {
            System.out.println("Array has sufficient elements!");
        }

        // TODO 7: String Check
        String name = "John";
        if (name.equals("John")) {
            System.out.println("Hello John!");
        }

        // TODO 8: Boolean Check
        boolean isStudentActive = true;
        if (isStudentActive) {
            System.out.println("Student is active!");
        }

        // TODO 9: Score Range
        int score = 85;
        if (score >= 80 && score <= 100) {
            System.out.println("High score achieved!");
        }

        // TODO 10: Complex Condition
        double gpa = 3.7;
        int studentAge = 22;
        if (gpa >= 3.5 && studentAge <= 25) {
            System.out.println("Eligible for scholarship!");
        }
    }
}
