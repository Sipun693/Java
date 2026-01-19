package Array;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = st.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = st.nextInt();
        }
        int largest = arr[0];
        int secondlargest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                int temp = largest;
                largest = arr[i];
                // int secondLargest = arr[0];
                if (secondlargest < temp && temp < largest) {
                    secondlargest = temp;
                }
            } else if (arr[i] > secondlargest) {
                secondlargest = arr[i];
            }

        }
        System.out.println("second largest element is: " + secondlargest);
        System.out.println("largest element is: " + largest);
        st.close();

    }

}
