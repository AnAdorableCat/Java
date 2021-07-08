package excise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {

        //方法调用
        Collection<Integer> c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.clear();//清空集合
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(c.contains(123));
        System.out.println(c.equals(666));
        System.out.println(c.hashCode());
        System.out.println(c.isEmpty());
        System.out.println(c.remove(2));
        System.out.println(c.size());
        Object[] o =c.toArray();
        System.out.println(Arrays.toString(o));

        //集合间操作
        Collection<Integer> c2 = new ArrayList();
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(0);
        c2.add(1);
        System.out.println(c.addAll(c2));
        System.out.println(c.containsAll(c2));
        //System.out.println(c.removeAll(c2));
        System.out.println(c.retainAll(c2));
        Object[] o2 = c.toArray();
        System.out.println(Arrays.toString(o2));

        //迭代集合中的元素
        //方法一
        Iterator<Integer> i = c.iterator();
        while (i.hasNext()){
            Integer data = i.next();
            System.out.println(data);
        }

        //方法二
        for(Integer data:c){
            System.out.println(data);
        }
    }
}
