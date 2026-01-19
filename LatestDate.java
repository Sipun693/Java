import java.util.*;

public class LatestDate {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter first date in dd/mm/yyyy format: ");
        String d1 = st.nextLine();
        if (!d1.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[0-9]{4}$")) {
            System.out.println("Invalid date format");
            return;
        }
        System.out.println("Enter second date in dd/mm/yyyy format: ");
        String d2 = st.nextLine();
        if (!d2.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[0-9]{4}$")) {
            System.out.println("Invalid date format");
            return;
        }
        String str3[] = d1.split("/");
        String str4[] = d2.split("/");

        int Date1 = Integer.parseInt(str3[0]);
        int month1 = Integer.parseInt(str3[1]);
        int year1 = Integer.parseInt(str3[2]);
        int Date2 = Integer.parseInt(str4[0]);
        int month2 = Integer.parseInt(str4[1]);
        int year2 = Integer.parseInt(str4[2]);
        if (year1 > year2 || (year1 == year2 && month1 > month2)
                || (year1 == year2 && month1 == month2 && Date1 > Date2)) {
            System.out.println(d1 + "is the latest date");
        } else if (year1 == year2 && month1 == month2 && Date1 == Date2) {
            System.out.println("Both dates are the same.");
        } else {
            System.out.println(d2 + " is the latest date.");
        }

        st.close();

    }

}
