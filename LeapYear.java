import java.util.Scanner;

public class LeapYear {
    
    public static void main(String args[])
    {
        Scanner st= new Scanner(System.in);
        System.out.println("Enter a year");
        int i= st.nextInt();
        if(i%4==0 && i%100 != 0 || i%400==0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
        st.close();
    }
    
    
    
    
}
