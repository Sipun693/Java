package String;

import java.util.*;

public class ReverseString {
    public static void main(String args[]) {

        char ch[]= new char[100];
        int k=0;
        Scanner st = new Scanner(System.in);
        //char stq[]=new char[100];
        System.out.println("Enter Your String");
        String str= st.nextLine();
        char stm[]= str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            ch[k]=stm[i];
            k++;
        }
        
        System.out.println(ch);
        st.close();
        
    }
    
}
