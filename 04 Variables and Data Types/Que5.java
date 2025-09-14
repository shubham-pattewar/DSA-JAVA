// Will the following statement give any error in Java? int $ = 24;

// Variable Naming Convention:
// 1. Must start with a letter, $, or _ (cannot start with a digit).
// 2. Can contain letters, digits, $, or _ after the first character.
// 3. Cannot use Java keywords (like int, class, for).
// 4. Case-sensitive (age and Age are different).

// Naming Conventions (Best Practices):

// 1. Use camelCase for variables and methods: studentAge, totalPrice.
// 2. Use UPPER_CASE for constants (final variables): PI, MAX_USERS.
// 3. Be descriptive: avoid single letters (m, x) except for loop counters.
// 4. Class names use PascalCase: BankAccount, StudentDetails.

public class Que5 {
    public static void main(String[] args) {
        int $ = 24;     
        System.out.println($);      // Variable name can start with $
    }
}
