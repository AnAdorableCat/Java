package day14;

import java.util.HashMap;

//测试 HashMap集合
public class Test6_Map {
    public static void main(String[] args) {
  //TODO 1,构造一个空的HashMap集合.
        //默认的容量16,加载因子是0.75
        HashMap<String,String> map = new HashMap();
        //2,调用方法
        map.put("007", "灭霸");
        map.put("008", "蜘蛛侠");
        map.put("009", "猪猪侠");
        map.put("006", "钢铁侠");
        map.put("003", "美国队长");
        //TODO 迭代Map集合
    }
}