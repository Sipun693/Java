import java.util.*;

public class SumNaturalnum {

    public static void main(String[] args) {
        try (Scanner st = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = st.nextInt();
            int i = 1;
            int sum = 0;
            for (i = 1; i <= num; i++) {
                sum = sum + i;

            }
            System.out.println(+sum);
        }

    }

}
