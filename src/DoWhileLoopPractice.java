/**
 * Hands-On Practice: Do-While Loop
 */

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== DO-WHILE LOOP EXERCISES ===\n");

        // 1. Basic Do-While Count
        System.out.println("TODO 1: Count 1 to 5");
        int count = 1;
        do {
            System.out.print(count + " ");
            count++;
        } while (count <= 5);
        System.out.println("\n");

        // 2. Menu Simulation
        System.out.println("TODO 2: Menu simulation");
        int choice = 1;
        do {
            System.out.println("Menu: 1. Start 2. Exit");
            // Simulasi: langsung ubah ke 2 supaya keluar
            choice = 2;
        } while (choice != 2);
        System.out.println("Exited menu.\n");

        // 3. Input Validation Simulation
        System.out.println("TODO 3: Input validation simulation");
        int inputValue = -1; // Start with invalid
        int attempts = 0;
        do {
            attempts++;
            if (inputValue < 1 || inputValue > 10) {
                System.out.println("Invalid input, attempt " + attempts);
                inputValue = 5; // simulasi: akhirnya jadi valid
            }
        } while (inputValue < 1 || inputValue > 10);
        System.out.println("Valid input accepted: " + inputValue);
        System.out.println();

        // 4. At Least Once Execution
        System.out.println("TODO 4: Executes even when condition is false");
        boolean condition = false;
        do {
            System.out.println("This runs once even if condition is false!");
        } while (condition);
        System.out.println();

        // 5. Sum Until Zero
        System.out.println("TODO 5: Sum until zero");
        int[] numbers = {5, 3, 8, 2, 0, 7, 1};
        int index = 0;
        int sum = 0;
        do {
            if (numbers[index] == 0) break;
            sum += numbers[index];
            index++;
        } while (index < numbers.length);
        System.out.println("Sum until zero: " + sum);
        System.out.println();

        // 6. Reverse Number
        System.out.println("TODO 6: Reverse number 12345");
        int number = 12345;
        int reversed = 0;
        do {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        } while (number > 0);
        System.out.println("Reversed: " + reversed);
        System.out.println();

        // 7. Find Character
        System.out.println("TODO 7: Find 'a' in 'programming'");
        String text = "programming";
        int charIndex = 0;
        char target = 'a';
        do {
            if (text.charAt(charIndex) == target) {
                break;
            }
            charIndex++;
        } while (charIndex < text.length());
        System.out.println("Found 'a' at index: " + charIndex);
        System.out.println();

        // 8. Countdown Timer
        System.out.println("TODO 8: Countdown timer");
        int timer = 5;
        do {
            System.out.println(timer);
            timer--;
        } while (timer >= 1);
        System.out.println("Go!");
        System.out.println();

        // 9. Password Attempts
        System.out.println("TODO 9: Password attempts simulation");
        String correctPassword = "secret123";
        String enteredPassword = "wrong"; // Start with wrong password
        int attemptCount = 0;
        int maxAttempts = 3;
        do {
            attemptCount++;
            System.out.println("Attempt " + attemptCount + ": " + enteredPassword);
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Access Granted!");
                break;
            } else {
                // simulasi: pada percobaan ke-2, masukkan password benar
                if (attemptCount == 2) {
                    enteredPassword = "secret123";
                }
            }
        } while (attemptCount < maxAttempts);
        if (!enteredPassword.equals(correctPassword)) {
            System.out.println("Access Denied!");
        }
        System.out.println();

        // 10. Game Level Completion
        System.out.println("TODO 10: Game level completion");
        int currentLevel = 1;
        int targetLevel = 5;
        do {
            System.out.println("Completed level " + currentLevel);
            currentLevel++;
        } while (currentLevel <= targetLevel);
        System.out.println("All levels completed!");
    }
}

