package String;

import java.util.*;

//**********check binary number********* 

// public class RegularExp {

//     public static void main (String args[])
//     {
//         Scanner st = new Scanner(System.in);
//         System.out.println("Entar a binary number");
//         int i = st.nextInt();
//         String str= String.valueOf(i);
//         System.out.println(str.matches("[01]*"));
   //         st.close();

//     }
    
// }

//**********check hexadecimal number********* 

// public class RegularExp {

//     public static void main (String args[])
//     {
//         Scanner st = new Scanner(System.in);
//         System.out.println("Entar a hexadecimal number");
//         String str = st.nextLine();
//         //String str= String.valueOf(i);
//         System.out.println(str.matches("[0-9A-Z]*"));
        

//     }
    
// }

//**********check date format******** 

// public class RegularExp {

//     public static void main (String args[])
//     {
//         Scanner st = new Scanner(System.in);
//         System.out.println("Entar a date");
//         String str = st.nextLine();
//         //String str= String.valueOf(i);
//         System.out.println(str.matches("^(0[1-9]|[12][0-9]|3[01])\\\\(0[1-9]|1[0-2])\\\\(19|20)\\d{2}$"));
        

//     }
    
// }

//******** Remove Special Character***************

// public class RegularExp {

//     public static void main (String args[])
//     {
//         Scanner st = new Scanner(System.in);
//         System.out.println("Entar a string with special character");
//         String str = st.nextLine();
//         System.out.println(str.replaceAll("[^0-9A-Za-z]",""));
        

//     }
    
// }

//**********Replace extra spaces with single space********* 

// public class RegularExp {

//     public static void main (String args[])
//     {
//         Scanner st = new Scanner(System.in);
//         System.out.println("Entar a string with Extra spaces");
//         String str = st.nextLine();
//         System.out.println(str.replaceAll("\s+"," ").trim());
        

//     }
    
// }

//**********count the words******** 

public class RegularExp {

    public static void main (String args[])
    {
        Scanner st = new Scanner(System.in);
        System.out.println("Entar a string with Extra spaces");
        String str = st.nextLine();
        String words[]= str.split("\\s+");
        System.out.println(words.length);
        
        st.close();
    }
    
}

