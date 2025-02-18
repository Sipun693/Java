package String;
import java.util.*;
public class CheckVowelinString {

    public static void main(String args[])
    {
       Scanner st= new Scanner(System.in); 
       System.out.println("Enter your String");
       int vowelcount=0;
       int consonantcount=0;
       String str1 = st.nextLine().toLowerCase(); // Convert input string to lowercase

     //  **** Basic Method********
     //  String stv=new String(" ");
    //    for(int i=0;i<=str1.length()-1;i++)
    //    {
    //     if(str1.charAt(i) == 'a'|| str1.charAt(i) == 'e'||str1.charAt(i) == 'i'||str1.charAt(i) == 'o'||str1.charAt(i) == 'u')
    //     {
    //         stv = stv+str.charAt(i);
    //         vowelcount ++;

    //     }
    //    }
    
       StringBuilder stv = new StringBuilder(); // Use StringBuilder for appending characters
       StringBuilder stc = new StringBuilder();
       for(int i=0; i< str1.length();i++)
       {
         char ch = str1.charAt(i);
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
         {
            stv.append(ch); // Append vowel to StringBuilder
            vowelcount++;

       }
       else
       {
        stc.append(ch);
        consonantcount++;
       }
    }
       System.out.println(stv);
       System.out.println(vowelcount);
       System.out.println(stc);
       System.out.println(consonantcount);

       st.close();
    }
    
}


