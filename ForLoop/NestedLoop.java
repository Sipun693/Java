package ForLoop;


public class NestedLoop {
    public static void main(String[] args)
    {
        int i=1, j=1,k=1,m=1,n=1,p=1;
        // for(i=1;i<=5;i++)
        // {
        //     for(j=1;j<=5;j++)
        //     {
        //         System.out.print(+i+" ");
        //     }
        //     System.out.println("");
        // }

//**********************************************

        // for(i=1;i<=5;i++)
        // {
        //     for(j=1;j<=5;j++)
        //     {
        //         System.out.print(+j+" ");
        //     }
        //     System.out.println("");
        // }
//**********************************************

// for(i=1;i<=5;i++)
//         {
//             for(j=i+1;j<=i+5;j++)
//             {
//                 System.out.print(+j+" ");
//             }
//             System.out.println("");
//         }

//**********************************************
// int count=0;
// for(i=1;i<=5;i++)
// {
//     for(j=1;j<=5;j++)
//     {
//         count++;
//         System.out.format("%02d ",count );
//       //  System.out.print(+count+" ");
//     }
//     System.out.println("");
// }

//**********************************************

// for(i=1;i<=5;i++)
// {
//     for(j=1;j<=i;j++)
//     {
//        // count++;
//         //System.out.format("%02d ",count );
//        System.out.print(+j+" ");
//     }
//     System.out.println("");
// }

//**********************************************
// int count=0;
// for(i=1;i<=5;i++)
// {
//     for(j=1;j<=i;j++)
//     {
//        count++;
//         System.out.format("%02d ",count );
//        //System.out.print(+j+" ");
//     }
//     System.out.println("");
// }
//****************************************** */
// int counter=5;
// int count=0;
// for(i=1;i<=5;i++)
// {
//     for(j=1;j<=counter;j++)
//     {
//        count++;
//         System.out.format("%02d ",count );
//        //System.out.print(+j+" ");
//     }
//     counter--;
//     System.out.println("");
// }

//****************************************** */
// for(i=1;i<=5;i++)
// {
//     for(j=5;j>=1;j--)
//     {
//        //count++;
       
//        //System.out.format("%02d ",count );
//        if(i<j)
//        {
//        System.out.print( " ");
//        }
//        else
//        {
//         System.out.print( "*");
//        }
//     }
//     System.out.println("");
// }

//****************************************** */
for(i=1;i<=5;i++)
{
    for(j=1;j<=5;j++)
    {
       if(i+j>5)
       {
       System.out.print( "*");
       }
       else
       {
        System.out.print( " ");
       }
    }
    for (k = 1; k < i; k++) {  
        System.out.print("*");
    }
    
    System.out.println("");
}
for(m=1;m<=5;m++)
{
    for(n=1;n<=5;n++)
    {
        {
            if(m<n)
            {
            System.out.print( "*");
            }
            else
            {
             System.out.print( " ");
            }
         }
        //  for(p=1;p<=5-m;p++) 
        //  {  
        //      System.out.print("*");
        //  }
    }
    System.out.println("");
}

    }
    
}
