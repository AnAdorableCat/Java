package day15;

import java.util.HashMap;
import java.util.Scanner;

//测试 Map练习
//统计字符串中字符出现的次数
public class Test1 {
    public static void main(String[] args) {
        //1,接收用户输入的字符串
        System.out.println("请输入字符串");
        String input = new Scanner(System.in).nextLine();
        //定义map,存数据,格式 a=3,b=2,c=1...
        HashMap<Character,Integer> map = new HashMap();
        //2,遍历字符串
        for (int i = 0; i < input.length(); i++) {
            //3,根据下标i,获取每个字符
            char key = input.charAt(i);
            //4,判断,如果出现过,次数+1/没出现过,就是第一次
            Integer value = map.get(key);
            if(value == null){//没存过,value就是默认值
                map.put(key, 1);//第一次统计
            }else{
                map.put(key, value+1);//+1
            }
        }
        System.out.println(map);
    }
}
