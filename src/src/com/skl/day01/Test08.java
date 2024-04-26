package src.com.skl.day01;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要查看的日期：（提示：格式按照2019-09-08格式）");
        String strDate = sc.next();
        java.sql.Date date1 = java.sql.Date.valueOf(strDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        int count=0;
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        int maxday = cal.getActualMaximum(Calendar.DATE);
        cal.set(Calendar.DATE,1);
        int day_week= cal.get(Calendar.DAY_OF_WEEK);
        int num = day_week-1;
        for (int i = 1; i <= num; i++)  {
            System.out.print("\t");
        }
        count=count+num;
        for (int i = 1; i <= maxday; i++) {

            System.out.print(i+"\t");
            count++;
            if (count%7==0){
                System.out.println();
            }
        }
    }
}
