/* 
Problem:
A strong password must:
	•	Be 8 to 20 characters long.
	•	Contain at least one uppercase letter.
	•	Contain at least one lowercase letter.
	•	Contain at least one digit.
	•	Contain at least one special character (@, #, $, etc.).

*/

package String;

import java.util.*;

public class ValidatePassword {

    public static void main(String args[])
    {
        Scanner Keyboard=new Scanner(System.in);
        System.out.println("Enter the password");
        String str=Keyboard.nextLine();
        if(str.matches("([^a-zA-Z0-9]+)([A-Z0-9a-z]+){8,20}"))
        {
            System.out.println("password is valid");
        }
        else{
            System.out.println("password is Invalid");
        }

        Keyboard.close();
    }
    
}
