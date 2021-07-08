package day13;
import java.util.ArrayList;
import java.util.List;
//测试 泛型
//好处: 检查集合中元素的类型,,,,在编译期报错
public class Test2_Generic {
    public static void main(String[] args) {
        //0,数组: 数据类型必须统一 + 编译时报错
        //int[] a = {1,2.1,true,4,5};
        //1,不用泛型--添加任意类型的数据
        List list = new ArrayList();
        list.add(10);
        list.add(3.2);
        list.add('哈');
        list.add(true);
        System.out.println(list);
        //2,使用泛型--约束集合中元素的类型--提前报错
        //使用<??>来约束类型,??用数据的类型代替
        List<String> list2 = new ArrayList();
        list2.add("jack");//数据的类型通过了泛型的检查
//        list2.add(100);//数据的类型 没通过泛型的检查
//        list2.add(3.3);//数据的类型 没通过泛型的检查
        list2.add("rose");//数据的类型通过了泛型的检查

 //TODO 泛型中间写数据的类型,必须是引用类型不能是基本类型
        List<Integer> list3 = new ArrayList();
//        list3.add(1.2);
        list3.add(10);//自动装箱--new Integer(10)
    }
}
