package Array;

import java.util.Scanner;

public class Sortingmergingarray {
    public static void main(String[] args)
    {
        Scanner st= new Scanner(System.in);
        System.out.println("Enter number of arrays: ");
        int numarrays= st.nextInt();
        String str="";
        int[][] array= new int[numarrays][];
        //int k=0;
        for(int i =0; i<numarrays; i++)
        {
            System.out.println("Enter the length of the array  "+ i +":");
            int len= st.nextInt();
            array[i]= new int[len];
            System.out.println("Enter the element of array "+i+":");
            
            for(int j=0;j<len;j++)
            {
                array[i][j]= st.nextInt();
                //c[k]=array[i][j];
                str=str+array[i][j]+" ";
            }

            str=str+"\n";
        }

        System.out.println("Final array \n"+str);

        // for(int i=0;i<=len1-1;i++)
        // {
        //     for(int j=i+1;j<=len1-1;j++)
        //     {
        //         if(a[i]>a[j])
            
        //         {
        //             int temp= a[i];
        //             a[i]=a[j];
        //             a[j]=temp;


        //         }
        //     }
        st.close();


        }



    }
    

