package Array;

import java.util.*;

public class Insertion {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = st.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = st.nextInt();
        }
        System.out.println("Enter the new elements: ");
        int newElement = st.nextInt();
        System.out.println("Enter the position: ");
        int position = st.nextInt();
        int[] arr1 = new int[n + 1];
        for (int i = n - 1; i < n; i--) {
            if (i == position) {
                arr1[i + 1] = arr[i];
                arr1[i] = newElement;
            } else if (i > position) {

                arr1[i + 1] = arr[i];
            } else if (i < position && i >= 0) {
                arr1[i] = arr[i];
            } else {
                break;
            }
        }
        System.out.println("Array after insertion:" + (Arrays.toString(arr1)));
        st.close();

    }

}
