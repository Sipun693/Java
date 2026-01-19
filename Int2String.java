import java.util.Scanner;

public class Int2String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Read the integer from input

        // Convert the integer to a string
        String str = String.valueOf(num);

        // Check if the conversion was successful and print the result
        if (str.equals(Integer.toString(num))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}
