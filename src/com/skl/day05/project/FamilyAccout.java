package com.skl.day05.project;

public class FamilyAccout {
    public static void main(String[] args) {
        boolean isFlag = true;
        //用于记录收入支出详情
        String detail ="收支 \t账户金额 \t收支金额 \t说明\n";
        while (isFlag) {
            System.out.println("-----------家庭收支记账软件-----------\n");
            System.out.println("           1、收支明细");
            System.out.println("           2、登记收入");
            System.out.println("           3、登记支出");
            System.out.println("           4、退出\n");
            System.out.println("           请选择（1-4）：");

            char selection = Utility.readMenuSelcetion();
            //isFlag = false;
            switch (selection) {
                case '1':
                    // System.out.println("1、收支明细");
                    System.out.println("-----------当前收支明细记录-----------");
                    System.out.println(detail);
                    System.out.println("------------------------------------");
                    break;
                 case '2':
                     //System.out.println("2、登记收入");
                     break;
                case '3':
                    //System.out.println("3、登记支出");
                    break;
                case '4':
                    //System.out.println("4、退出\n");
                    break;
            }
        }

    }

}
