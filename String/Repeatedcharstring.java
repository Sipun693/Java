package String;
import java.util.*;

public class Repeatedcharstring {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = st.nextLine();
        str=str.toLowerCase();
        String stx="";
        char stm[] = str.toCharArray();
        for (int i = 0; i <= str.length()-1; i++) 
        {
            int count = 1; // Reset count for each character
            for (int j = i+1; j <= str.length()-1; j++) 
            {
                //if (str.charAt(i)==str.charAt(j) && stm[i]!='$') 
                if(stm[i]==stm[j])
                {
                    //stx=stx+stm[i]+" ";
                    stm[j]='$';
                    count++;
                }
            }
            if(count>1&&stm[i]!='$')
            {
                stx=stx+stm[i]+" repeated "+count+" times\n";
            }
            if(count==1&&stm[i]!='$')
            {
                stx=stx+stm[i]+" repeated "+count+" times\n";
            }  
        }
        System.out.println(stx);
        st.close();
    }
}
