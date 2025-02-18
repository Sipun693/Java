import java.util.*;
//4! = 4*3*2*1 = 24  
//5! = 5*4*3*2*1 = 120  

public class factorial{
      public static void main(String[] args)
    {
        Scanner st=new Scanner(System.in);
        System.out.println("enter your number");
        int num= st.nextInt();
        int z=num;
        if(num==0||num==1)
        {
            System.out.println("Factorial of "+num+" is 1");

        }
        for(int i=1;i<=num-1 && num!=0; i++)
        {
            z=z*num;

        }

        System.out.println("factorial is"+" "+ z);
        st.close();
    }

}