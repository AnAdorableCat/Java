package day13;

import java.util.ArrayList;
import java.util.Arrays;

//测试 ArrayList集合
public class Test5_ArrayList {
    public static void main(String[] args) {
  //1,当ArrayList对象时,底层维护了一个Object[],叫elementData
  //初始容量,jdk1.8是空的,当开始add()才开始扩容
  //jdk1.6只要new就分配10个容量
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
   //2,当调用add()时,会拿到数据之后,直接存入数组中
   //elementData[size++] = 1;
        list.add(2);
        list.add(3);
    //3,数组的默认容量是10,数据超过10时,会自动扩容:以前的1.5倍
        //TODO 继承自Collection接口的
         //TODO 继承自List接口的

        Object[] a = new Object[10];
        a[0] = 10;
        a[1] = 1.2;
        a[2] = '我';
        a[3] = true;
        a[4] = "jack";
        int index = 0;
        if( index>10){
            Arrays.copyOf(a,a.length*15/10);
        }
    }
}
