package src.com.skl.day08.exer;

/**
 * @program: case_skills_practice
 * @ClassName: MyDate
 * @author: skl
 * @create: 2024-06-24 22:59
 */
public abstract class MyDate {
    private int year;
    private int month;
    private int day;
    private MyDate birthday;

    public MyDate() {
    }

    public MyDate(int year, int month, int day, MyDate birthday) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.birthday = birthday;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public MyDate getBirthday() {
        return birthday;
    }
    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", birthday=" + birthday.toString() +
                '}';
    }
    public abstract double earning();

}
