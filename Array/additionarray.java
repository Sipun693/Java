
package Array;
import java.util.*;

public class additionarray {

    public static void main(String[] args)
    {
            Scanner st= new Scanner(System.in);
            int[] a= new int[100];
            int[] b= new int[100];
            int[] c= new int[100];
            String str = "";
            String arr1= "";
            String arr2= "";
            System.out.println("Enter length of array");
            int len = st.nextInt();
            System.out.println("Enter elements of array");
            for(int i=0;i<=len-1;i++)
            {
                a[i]=st.nextInt();
                arr1=arr1+a[i]+" ";
                b[i]=st.nextInt();
                arr2=arr2+b[i]+" ";
                c[i]=a[i]+b[i];
                str=str+c[i]+" ";
            }    
            System.out.println("The  array 1 is:- " +arr1);        
            System.out.println("The  array 2 is:- " +arr2);        

            System.out.println("The resultant array is:- " +str);   
            st.close();     

    }
    
}
