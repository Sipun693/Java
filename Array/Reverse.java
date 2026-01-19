package Array;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = st.nextInt();
        int[] arr = new int[n];
        int arr1[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = st.nextInt();
        }
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            arr1[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr1));
        st.close();
    }

}
