import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the string: ");
        int num = st.nextInt();
        int rev = 0;

        do {
            int num1 = num % 10; // Extract last digit
            rev = rev * 10 + num1; // Append to reversed number
            num /= 10; // Remove last digit num= num/10
        } while (num != 0);

        System.out.println("Reverse of the number is: " + rev);
        st.close();

    }

}
