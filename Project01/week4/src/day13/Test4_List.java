package day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//测试 List子接口
public class Test4_List {
    public static void main(String[] args) {
        //1,创建List的对象
        List<String> list = new ArrayList();
        //2,调用方法
 //TODO --继承自父接口Collection的方法们

        list.add("杨幂");
        list.add("古力娜扎");
        list.add("迪丽热巴");
        list.add("Anglababa");
        list.add("皮皮霞");
        list.add("Anglababa");
        list.add(null);
        list.add("皮皮霞");
        //TODO 特点:有序 + 可重复 + 存多个null
        System.out.println(list);
        //--自己扩展的方法们--按照下标操作数据的
        //在1索引处,添加指定的元素"hanmeimei"
        list.add(1,"hanmeimei");
        System.out.println(list.get(3));//获取索引为3的元素
        System.out.println(list.indexOf("皮皮霞"));//获取指定元素 第一次出现的索引值
        System.out.println(list.lastIndexOf("皮皮霞"));//获取指定元素 最后一次出现的索引值
        System.out.println(list.remove(1));//移除下标为1的元素
        System.out.println(list.set(2,"666"));//替换,把2下标处的元素换成666
        //从索引2到5 截取子List,[2,5)
        List<String> list2 = list.subList(2, 5);
        System.out.println(list2);
        //TODO List集合的迭代方式
        //方式1:::继承自Collection的iterator()
        Iterator<String> it = list.iterator();
        while(it.hasNext()){//判断有元素吗
            String data = it.next();
            System.out.println(data);
        }
        //方式2:::ListIterator<E> listIterator()
        ListIterator<String> it2 = list.listIterator();
            //使用父接口的功能--顺序向后迭代
        while(it2.hasNext()){//判断有后面的元素吗
            String data = it2.next();//获取后面的元素
            System.out.println(data);
        }
            //使用子接口的扩展功能--逆向迭代
        while(it2.hasPrevious()){//判断有前面的元素吗
            String data = it2.previous();//获取前面的元素
            System.out.println(data);
        }
//TODO 面试题:iterator()和listIterator()区别?
//iterator()来自父接口,listIterator()是List子接口扩展的
//iterator()返回父接口顺序迭代
//listIterator()返回子接口,可以用父接口的所有功能,也扩展了逆向迭代)

        //方式3:::用下标遍历
        for (int i = 0; i < list.size(); i++) {
            String data = list.get(i);//根据下标i获取元素
            System.out.println(data);
        }
        //方式4:::foreach
        //语法:for(遍历得到的数据的类型 变量名 : 要迭代的容器){}
        for(String data:list){
            System.out.println(data);
        }

        List<Integer> l3 = new ArrayList();
        l3.add(100);
        l3.add(200);
        l3.add(300);
        l3.remove(0);
        l3.remove(new Integer(100));

    }
}
