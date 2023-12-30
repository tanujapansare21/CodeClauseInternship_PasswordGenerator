import java.security.SecureRandom;
import java.util.Scanner;

public class MyClass {

    // Define the characters that can be used in the password
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

    // Method to generate a random password
    public static String generatePassword(int length) {
        if (length <= 7) {
            throw new IllegalArgumentException("Password length must be greater than or equal to 8");
        }

        // Use SecureRandom for secure random number generation
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        // Generate random characters for the password
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        // Set the desired length of the password
        // int passwordLength = 12;

        // Generate and print a random password
        
        int a = 1;
        
        
        do{
            Scanner sc = new Scanner(System.in);
        System.out.println("Length of Password (Greater than 8)");
        int passwordLength = sc.nextInt();
        
        String randomPassword = generatePassword(passwordLength);
        System.out.println("Generated Password: " + randomPassword);
        
        System.out.println("Do you Want to Continue (press 1):");
        a = sc.nextInt();
        
        }while(a == 1);
        
        
    }
}
