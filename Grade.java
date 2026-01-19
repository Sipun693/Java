import java.util.Scanner;

public class Grade 
{
    
    public static void main(String[] args)
{
Scanner st = new Scanner(System.in);
System.out.println("Please enter mark of Math");
int m1 = st.nextInt();
System.out.println("Please enter mark of English");
int m2 = st.nextInt();
System.out.println("Please enter mark of Science");
int m3 = st.nextInt();
float avg=(m1+m2+m3)/3;
if (avg>=70)
{
    System.out.println("you get A grade");
}
else if(avg>=60 && avg <=70)
{
    System.out.println("you get B grade");
}
else if(avg>=30 && avg <=60)
{
    System.out.println("you get C grade");
}
else
{
    System.out.println("you get Fail");
}
st.close();
}
}


//#endregion

// public class Grade {

//     public static void main(String[] args) {
//         Scanner st = new Scanner(System.in);

//         System.out.print("Enter the number of subjects: ");
//         int n = st.nextInt();

//         int totalMarks = 0;

//         for (int i = 1; i <= n; i++) {
//             System.out.print("Enter mark for subject " + i + ": ");
//             int mark = st.nextInt();
//             totalMarks += mark;
//         }

//         float avg = (float) totalMarks / n;

//         if (avg >= 70) {
//             System.out.println("You get A grade");
//         } else if (avg >= 60) {
//             System.out.println("You get B grade");
//         } else if (avg >= 30) {
//             System.out.println("You get C grade");
//         } else {
//             System.out.println("You get Fail");
//         }

//         st.close();
//     }
// }