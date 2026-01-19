package Array;

import java.util.*;

public class sumOfElement {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = st.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = st.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {

            int num = sum + arr[i];
            sum = num;
        }
        System.out.println("Sum of the elements: " + sum);
        st.close();
    }

}
