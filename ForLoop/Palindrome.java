
import java.util.*;

public class Palindrome {

    public static void main(String[] args){

        Scanner st= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= st.nextInt();
        int temp=num;
        
        int reversenum=0;
        while(temp>0)
        {
            int a= temp%10;
            reversenum = a*10+ reversenum;
            temp /=10;

        }
        if (reversenum== num)
        {
            System.out.println("it is a palindrome number");
        }
        else
        {
            System.out.println("its is a not palindrome number");
        }
    }
}
