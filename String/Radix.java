package String;

import java.util.Scanner;

public class Radix {

    public static void main(String args[])
    {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter string to check the radix");
        String str = st.nextLine();
        //int i = Integer.parseInt(str);
        if(str.matches("[01]+"))
        {
            System.out.println("Radix is binary");
        } 
        else 
        {
            if(str.matches("[0-7]+"))
            {
                System.out.println("Radix is octal");
            }
            else
            {
                if(str.matches("[0-9]+"))
            {
                System.out.println("Radix is Decimal");
            }
            else
            {
                if(str.matches("[0-9A-F]+"))
                {
                    System.out.println("Radix is Hexadecimal");
                }
            }

            }
        
    }
    st.close();
        
    }
    
}
