package day27;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入两个整数");

        int i = first();
        int t = second();
        int sum = add(i,t);
        System.out.println(sum);
    }

    private static int first() {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        return i;
    }

    private static int second() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        return t;
    }

    public static int add(int i,int t){
        return i + t;
    }

}
