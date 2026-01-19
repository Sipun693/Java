import java.util.Scanner;

public class printnumber {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = st.nextInt();
        // int n = 5;
        if (i <= 5) {
            do {
                System.out.println(i);
                i++;
            } while (i <= 5);
        } else {
            System.out.println("Invalid number");
        }
        st.close();
    }

}
