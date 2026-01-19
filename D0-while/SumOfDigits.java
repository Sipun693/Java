import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the string: ");
        int num = st.nextInt();
        int sum = 0;

        do {
            int num1 = num % 10; // Extract last digit
            sum = sum + num1; // sum of number
            num /= 10; // Remove last digit num= num/10
        } while (num != 0);

        System.out.println("Sum of the number is: " + sum);
        st.close();

    }

}
