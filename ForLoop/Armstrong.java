
import java.util.*;

//************* Armstrongnumber *****************

// public class Armstrong {
//     public static void main(String[] args)
//     {
//         Scanner st= new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num= st.nextInt();
//         int num1= num,sum=0,count =0;
//         int a;
//         int temp=num;
//         for(int i=1;num1>0;i++)
//         {
//            num1=num1/10;
//            count++;
//         }
//        // System.out.println("count is " +count) ; // print the count

//         while(temp>0)
//         {
//             a= temp%10;
//            sum += Math.pow(a,count) ;
//            temp /=10;
//            //System.out.println(+sum);
//         }
        

//         if(sum==num)
//         {
//             System.out.println("it is a amstrong number");
//         }
//         else
//         {
//             System.out.println("it is not a amstrong number");
//         }
        

//     }
// }



public class Armstrong{
    public static void main(String[] args)
    {
        Scanner st=new Scanner(System.in);
        System.out.println("Enter range");
        int a= st.nextInt();
        int b=st.nextInt();
        int c;
        int i;
        for(i=a;i<b;i++)
        {
            int sum=0,count=0;
        int temp=i;
        int tempnum= i;
        
            while(temp>0)
            {
               temp= temp/10;
               count++;

            }
            while(tempnum>0)
            {
                c =tempnum%10;
                sum +=Math.pow(c,count);
                tempnum /=10;
            }
            if(sum==i)
        {
            System.out.println(i);
        }
        

        }

    }
}