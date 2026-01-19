import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the string: ");
        int num2 = st.nextInt();
        int num = num2;
        int rev = 0;

        do {
            int num1 = num % 10; // Extract last digit
            rev = rev * 10 + num1; // Append to reversed number
            num /= 10; // Remove last digit num= num/10
        } while (num != 0);

        if (num2 == rev) {
            System.out.println("The number is Palindrome");
        } else {
            System.out.println("The number is not Palindrome");
        }
        st.close();

    }

}
