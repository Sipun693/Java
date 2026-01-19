import java.util.Scanner;

public class MenuDrivenSwitch {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("ADD");
        System.out.println("SUBTRACT");
        System.out.println("MULTIPLY");
        System.out.println("DIVIDE");
        System.out.println("Enter 2 NUMBER ");
        int a = st.nextInt();
        int b = st.nextInt();
        st.nextLine();
        System.out.println("Enter Option choice");
        String Option = st.nextLine();
        Option = Option.toUpperCase();
        switch (Option) {
            case ("ADD"):
                System.out.println("Addition of two numbers is: " + (a + b));
                break;
            case ("SUBTRACT"):
                System.out.println("Subtraction of two numbers is: " + (a - b));
                break;
            case ("MULTIPLY"):
                System.out.println("Multiplication of two numbers is: " + (a * b));
                break;
            case ("DIVIDE"):
                System.out.println("Division of two numbers is: " + (a / b));
                break;
            default:
                System.out.println("Invalid Option");

        }
        st.close();
    }

}
