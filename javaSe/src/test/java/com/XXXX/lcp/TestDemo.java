package com.XXXX.lcp;

public class TestDemo {
    public static void main(String[] args) {
        int x = 10;
        //10+11+12=33
        int y = x++ + x++ + x++;
        System.out.println(y); // y的值是多少？
        System.out.println("=================================");
        int a = 10;
        int b = a--;
        //b=10
        System.out.println(b); // b的值是多少？

        System.out.println("==================================");
        int weight1 = 180;
        int weight2 = 200;
        boolean flag = weight1 == weight2;
        System.out.println("flag:" + flag);


    }
}
