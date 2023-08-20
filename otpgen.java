import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OTPGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the length of OTP
        System.out.print("Enter the length of OTP: ");
        int length = scanner.nextInt();
        
        if (length <= 0) {
            System.out.println("Invalid length. OTP length should be greater than 0.");
        } else {
            // Generate and display the OTP
            System.out.println("Generated OTP: " + generateOTP(length));
        }
    }

    public static String generateOTP(int length) {
        if (length <= 0) {
            return "Invalid length. OTP length should be greater than 0.";
        }

        // Create a list of digits (0 to 9)
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }

        // Shuffle the list to randomize the order of digits
        Collections.shuffle(list);

        // Build the OTP using the shuffled digits
        StringBuilder otpBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            otpBuilder.append(list.get(i)); // Append the digit to OTP
        }

        // Return the generated OTP
        return otpBuilder.toString();
    }
}
