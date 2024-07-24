package com.MT;

/**
 * @program: case_skills_practice
 * @ClassName: Test
 * @author: skl
 * @create: 2024-02-28 16:52
 */
public class Test {
    public static void main(String[] args) {
        String str = "支付宝";
        if ("微信".equals(str)) {
//            new wechat().payonline();
            pay(new wechat());
        }
        if ("支付宝".equals(str)) {
//            new Alipay().payonline();
            pay(new Alipay());
        }
        if ("招商".equals(str)){
            pay(new BankCard());
        }
    }
    public static void pay(wechat wc){
        wc.payonline();
    }
    public static void pay(Alipay ap){
        ap.payonline();
    }
    public static void pay(BankCard bc){
        bc.payonline();
    }
}
