import java.util.*;
public class DetermineAge {

    public static void main(String args[])
    {
        Scanner st= new Scanner(System.in);
        System.out.println("Enter age of a person");
        int i= st.nextInt();
        if(i>=14 && i<=55)
        {
            System.out.println("Person is Young");
        }
        else
        {
            System.out.println("Person is not Young");
        }
        st.close();
    }
    
}
