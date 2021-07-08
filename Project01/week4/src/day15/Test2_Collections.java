package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//测试 集合工具类
public class Test2_Collections {
    public static void main(String[] args) {
        //1,创建List集合,并添加数据
        List list = new ArrayList();
//        list.add(3);
//        list.add(13);
//        list.add(5);
        //TODO 一次性向list中,添加多个数据
        Collections.addAll(list, 3,7,5,1);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.reverse(list);
        System.out.println(list);
    }
}
