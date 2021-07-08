package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//测试 Set集合
public class Test4_Set {
    public static void main(String[] args) {
        //1,创建对象--本质上,底层是创建了一个HashMap对象
        Set<String> set = new HashSet();
        //2,调用方法--同Collection接口
        set.add("guangtouqiang");
        set.add("xionger");
        //本质上,拿着数据 存入map里了
        set.add("123");
        set.add("null");
        set.add("xiongda");
        set.add("123");
        set.add("null");
        //特点:无序+去重+存一个null+没有索引
        System.out.println(set);
        //TODO 迭代set集合
        //方式1::继承自Collection接口的 Iterator<E> iterator()
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String data = it.next();
            System.out.println(data);
        }
        //方式2::foreach
        for(String data : set){
            System.out.println(data);
        }
//        void clear()
//        boolean contains(Object o)
//        boolean isEmpty()
//        boolean remove(Object o)
//        int size()

    }
}
