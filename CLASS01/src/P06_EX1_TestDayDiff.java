public class P06_EX1_TestDayDiff {
// public static int[] monthDays={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;

    public static int[] accMonthDays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    public static void main(String[] args) {
        int date1 = 19990307, date2 = 20180930 ;
        int diff = diffInDays(date1, date2); // 1999/3/7與2018/9/30差幾天
        System.out.printf("diff days of %d and %d is %d days\n", date1, date2, diff);
    }
    public static boolean isLeapYear(int year) { // 判別是否為閏年
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public static int DaysOfYear(int y, int m, int d) { //計算此日期是當年的第幾日(由1/1算起)
        int days = ((m >= 2 && m <= 12) ? accMonthDays[m - 1] : 0) + d;
        if (isLeapYear(y) && m > 2) {
            days++;
        }
        return days;
    }
    public static int diffInDays(int date1, int date2) {
        int d1, d, d2;
        d=(date2/10000-date1/10000-1)*365;
        for (int i=date1/10000; i<date2/10000; i++){
            if(isLeapYear(i))d++;
        }
        d1=365-DaysOfYear(date1/10000,date1/100%100,date1%100);
        if(isLeapYear(date1/10000))d1++;
        d2=DaysOfYear(date2/10000,date2/100%100,date2%100);
        return d+d1+d2;
    }

}
