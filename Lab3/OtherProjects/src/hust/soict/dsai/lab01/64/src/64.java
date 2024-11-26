import java.util.Scanner;

public class ex64 {
    private static Scanner keyboard = new Scanner(System.in);

    private static int getMonth() {
        int month = 0;
        String input;
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        while (month == 0) {
            System.out.print("Month: ");
            input = keyboard.nextLine().trim();

            try {
                month = Integer.parseInt(input);
            }
            catch (NumberFormatException nfe) {}

            for (int i = 0; i < months.length; ++i)
                if (input.equals(months[i]) ||
                        input.equals(months[i].substring(0, 3)) ||
                        input.equals(months[i].substring(0, 3) + ".")) {
                    month = i + 1;
                    break;
                }

            if (month < 1 || month > 12)
                month = 0;
        }

        return month;
    }

    private static boolean isLeapYear() {
        int year = 0;

        while (year < 1) {
            System.out.print("Year: ");
            year = keyboard.nextInt();
        }

        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int month = getMonth();
        boolean leap = isLeapYear();

        if (month == 2)
            System.out.print(leap ? 29 : 28);
        else if (month < 8 && month % 2 == 1 ||
                month >= 8 && month % 2 == 0)
            System.out.print(31);
        else
            System.out.print(30);

        keyboard.close();
    }

}
