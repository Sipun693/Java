package ForLoop;
import java.util.*;
public class Displaydigit {
    public static void main(String[] args)
    {
        Scanner st= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=st.nextInt();
        int a;
        int count =0;
        for(int i=1;num>0;i++)
        {
           
           a= num%10;
           System.out.println("digits are " +a) ;
           num=num/10;
           count++;
        }
        System.out.println("count is " +count) ; // print the count
        st.close();

    }
    
}
