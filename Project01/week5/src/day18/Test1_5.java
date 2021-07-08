package day18;

import java.util.Arrays;

//测试 jdk5的新特性--可变参数
//语法:::参数类型... 参数名,,好处是:参数列表的长度可变
public class Test1_5 {
    public static void main(String[] args) {
        add();
        add(1,2);
        add(1,2,3);
        add(1,2,3,4,5);
    }
    //不需要提供重载的add()...可变参数
    public static void add(int... a){
        //本质是:是用数组存储多个参数值,[I@1b6d3586
        System.out.println(a);
        //查看数组里的数据
        System.out.println(Arrays.toString(a));
    }
}
