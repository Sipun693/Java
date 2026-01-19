package Array;

import java.util.*;

public class Math {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        // Input for the first array
        System.out.println("Enter the number of rows of 1st array: ");
        int m1 = st.nextInt();
        System.out.println("Enter the number of columns of 1st array: ");
        int n1 = st.nextInt();

        int arr1[][] = new int[m1][n1];
        System.out.println("Enter the elements of the 1st array: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = st.nextInt();
            }
        }

        // Input for the second array
        System.out.println("Enter the number of rows of 2nd array: ");
        int m2 = st.nextInt();
        System.out.println("Enter the number of columns of 2nd array: ");
        int n2 = st.nextInt();

        int arr2[][] = new int[m2][n2];
        System.out.println("Enter the elements of the 2nd array: ");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                arr2[i][j] = st.nextInt();
            }
        }

        // Check if arrays have the same dimensions
        if (m1 != m2 || n1 != n2) {
            System.out.println("The 2D arrays are not of the same size");
            return;
        }

        // Create a new array to store the sum
        int arr3[][] = new int[m1][n1];

        // Adding the two arrays
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Print the result
        System.out.println("The result of the array addition is: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        st.close();
    }
}
