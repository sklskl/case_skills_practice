package src.com.skl.day01;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class Test2 {
    public static void main(String[] args) {
//        java.sql.Date date = java.sql.Date.valueOf("2022-9-24");
//        java.util.Date data2 = date;
//        System.out.println(data2);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-DD");
        df.format("2022-09-08");
        System.out.println(df);
    }
}
