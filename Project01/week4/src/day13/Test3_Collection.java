package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//Collection测试
public class Test3_Collection {
    public static void main(String[] args) {
        //1,创建Collection对象--泛型约束c中的数据类型
        Collection<Integer> c = new ArrayList();
        //2,调用方法
        c.add(1);
        c.add(2);//添加元素,自动装箱
        c.add(3);
        c.add(4);
//        c.clear();//清空集合
        System.out.println(c.contains(123));//判断是否包含
        System.out.println(c.equals(666));//判断是否相等
        System.out.println(c.hashCode());//获取哈希码值
        System.out.println(c.isEmpty());//判断是否为空
        System.out.println(c.remove(100));//移除元素
        System.out.println(c.size());//获取集合的长度
        Object[] os = c.toArray();//把c变成数组
        System.out.println(Arrays.toString(os));
        //TODO 集合间的操作
        Collection<Integer> c2 = new ArrayList();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        System.out.println(c.addAll(c2));//把c2添加到c里
        System.out.println(c.containsAll(c2));//判断c是否包含c2
//        System.out.println(c.removeAll(c2));//移除交集
//        System.out.println(c.retainAll(c2));//保留交集元素
        //TODO 迭代集合中的元素
        //方式1:: Iterator<E> iterator()返回可以迭代集合元素的迭代器
        Iterator<Integer> it = c.iterator();
        // 有元素就获取,没有就结束
        while(it.hasNext()){//hasNext()判断有元素就返回true
            Integer data = it.next();//next()获取元素
            System.out.println(data);
        }
        //方式2::foreach/增强for循环--场景:数组|Collection集合
  //语法: for(遍历得到的数据的类型 变量名:要遍历的容器){}
        for(Integer data : c){
            System.out.println(data);
        }
    }
}
