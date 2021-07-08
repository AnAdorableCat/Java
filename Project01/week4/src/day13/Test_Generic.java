package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//测试 泛型
public class Test_Generic {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList();
        c.add(6);
        c.add(9);
        c.add(12);

        //c.clear();
        System.out.println(c.contains(12));
        System.out.println(c.equals(10));
        System.out.println(c.hashCode());

        System.out.println(c.isEmpty());
        System.out.println(c.remove(6));
        System.out.println(c.size());

        Object[] os = c.toArray();
        System.out.println(Arrays.toString(os));

        Collection<Integer> c2 = new ArrayList();
        c2.add(1);
        c2.add(5);
        c2.add(3);

        System.out.println(c.addAll(c2));

        System.out.println(c.contains(c2));

        //System.out.println(c.removeAll(c2));//移除交集

        System.out.println(c.retainAll(c2));//保留交集元素

        System.out.println(c);

        //TODO 迭代集合中的元素 Iterator<E> iterator
        Iterator<Integer> it = c.iterator();
        while(it.hasNext()){
            Integer data = it.next();//next()获取元素
            System.out.println(data);
        }

        for (Integer d :c) {
            System.out.println(d);
        }

    }
}
