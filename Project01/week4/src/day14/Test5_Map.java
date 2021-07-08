package day14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//测试 Map集合
public class Test5_Map {
    public static void main(String[] args) {
        //1,创建对象
        //泛型约束了map集合中key和value的类型
        Map<Integer,String> map = new HashMap();
        //2,调用方法
        map.put(9527,"唐伯虎");
        map.put(9528,"石榴姐");
        map.put(9529,"如花");
        map.put(9529,"祝枝山");
        map.put(null,null);
        //无序的键值对儿 + key必须唯一否则value被覆盖
        //可以存null键null值
//{null=null, 9527=唐伯虎, 9528=石榴姐, 9529=祝枝山}
        System.out.println(map);
//        map.clear();//清空map集合
        System.out.println(map.containsKey(666));//判断是否包含key
        System.out.println(map.containsValue("石榴姐"));//判断是否包含value
        System.out.println(map.equals(123));//判断是否相等
        System.out.println(map.get(9527));//根据key获取对应的value
        System.out.println(map.hashCode());//获取map的哈希码值
        System.out.println(map.isEmpty());//判断是否为空
        System.out.println(map.remove(null));//根据key删除记录
        System.out.println(map.size());//获取map的个数
        //TODO 迭代map集合
  //方式1:::键集Set<K> keySet()--把map里的所有可以存入set
        Set<Integer> set = map.keySet();//调用keySet()
        //迭代set,获取每个key
        for (Integer key : set) {
            //拿着key回map里找对应的value
            String value = map.get(key);
            System.out.println(key+"::::"+value);
        }
//方式3:::Set<Map.Entry<K,V>> entrySet()--把map里的整条记录存入set,并且封装成Entry
       Set<Map.Entry<Integer,String>> set2 = map.entrySet();//调用方法
        //迭代set,获取每个Entry
        for(Map.Entry<Integer,String> x : set2){
            //获取Entry的key和value
            Integer key = x.getKey();
            String value = x.getValue();
            System.out.println(key+"~~~"+value);
        }
//方式2:::Collection<V> values()--把map里的value们存入Collection集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
