import java.util.*;

public class EvenOdd {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number");
        int i= keyboard.nextInt();
        if (i%2==0)
        {
            System.out.println("its a even number");
        }
        else
        {
            System.out.println("number is a odd number");
        }
        keyboard.close();
    }
}
