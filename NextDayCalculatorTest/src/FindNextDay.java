import java.time.LocalDate;

public class FindNextDay {
    public static LocalDate findNextDay(LocalDate date) {
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        int maxDay = getDaysInMonth(month, year);

        if (day < maxDay){
            day++;
        } else {
                day = 1;
            if(month < 12){
                month++;
            } else {
                month = 1;
                year++;
            }
        }

        return LocalDate.of(year, month, day);
    }

    public static int getDaysInMonth (int month, int year) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
