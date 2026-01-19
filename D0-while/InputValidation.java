import java.util.Scanner;

public class InputValidation {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter the number");
            n = st.nextInt();
        } while (n <= 0);
        st.close();
    }
}
