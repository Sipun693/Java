package Array;

import java.util.*;

public class Print2DArray {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = st.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = st.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = st.nextInt(); // This is used to take the input of the 2D array
            }
        }
        System.out.println("The 2D array is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // This is used to print the next row in the new line
        }

        // System.out.println((Arrays.deepToString(arr)));
        st.close();

    }

}
