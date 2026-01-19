import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = st.nextInt();
        int fact = 1;
        do {
            fact = fact * i;
            i--;
        } while (i > 0);
        System.out.println("Factorial of the number is: " + fact);
        st.close();
    }

}
