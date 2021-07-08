package day14;

import java.util.LinkedList;

//测试 LinkedList
public class Test3_LinkedList {
    public static void main(String[] args) {
        //1,创建对象
        LinkedList<Integer> list = new LinkedList();
        //2,调用方法
        //TODO 继承自List父接口的方法
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //自己扩展的方法--针对首尾元素处理
        list.addFirst(100);//添加首元素
        list.addLast(200);//添加尾元素
        System.out.println(list);
        System.out.println(list.getFirst());//获取首元素
        System.out.println(list.getLast());//获取尾元素
        System.out.println(list.removeFirst());//移除首元素
        System.out.println(list.removeLast());//移除尾元素
 //TODO 另一套 API
//        boolean offerFirst(E e)
//        boolean offerLast(E e)
//        E peekFirst()
//        E peekLast()
//        E pollFirst()
//        E pollLast()

        //TODO 迭代LinkedList
        //继承自Collection的iterator()
        //继承自List的ListIterator()
        //普通的for循环
        //增强for循环
    }
}
