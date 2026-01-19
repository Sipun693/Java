import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = st.nextInt();
        int i = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        st.close();

    }

}
