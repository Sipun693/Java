package String;
//import java.util.*;

public class Testimmutablestring {

    public static void main(String args[])
    {
        String s1= "bijay";
        s1.concat("patra"); //concat() method appends the string at the end
        System.out.println(s1); //will print Sachin because strings are immutable objects

        s1= s1.concat("patra");
        System.out.println(s1);
    }
    
}
