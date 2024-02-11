import java.time.Period;

public class YearMonth {
    public static void main(String[] args) {
       int days=100;
       int days_in_year=365;
       int days_in_month=30;

       int year=days/days_in_year;
        System.out.println("year :"+year);

        int remaindays=days%days_in_year;
        int month=remaindays/days_in_month;
        System.out.println("Month :"+month);

        int rmainday=  remaindays%days_in_month;
        System.out.println(rmainday);

    }
}
