package String;

import java.util.*;

public class Email {
    public static void main(String args[])
    {
        Scanner st= new Scanner(System.in);
        System.out.println("Entar your email");
        String str=st.nextLine();
        int i= str.indexOf("@");
        String Name= str.substring(0,i);
        String domain=str.substring(i+1,str.length());
        System.out.println("Name is " + Name);
        System.out.println("Domain is " + domain);
        st.close();
    }
    
}
