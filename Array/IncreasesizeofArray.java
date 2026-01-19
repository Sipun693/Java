package Array;

import java.util.*;

public class IncreasesizeofArray {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = st.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = st.nextInt();
        }
        // ************Copy array*********
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }

        // *********Reverse array */
        System.out.println(Arrays.toString(arr1));
        int j = 0;
        for (int i = arr1.length - 1; i < arr1.length; i--) {

            arr2[j] = arr1[i];
            j++;
            if (i == 0) {
                break;
            }

        }

        System.out.println(Arrays.toString(arr2));

        int[] newArray = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArray));
        st.close();
    }

}
