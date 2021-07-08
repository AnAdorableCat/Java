package day18;
//测试 内部类
public class Test1 {
    public static void main(String[] args) {
        Out.In in = new Out().new In(); //创建内部类对象
        in.in();
    }
}
//外部类
class Out{
    String name="jack";
    public void out(){
        //2,外部类 使用内部类的资源--创建内部类的对象
//        System.out.println(age);
        System.out.println(new In().age);
        System.out.println("out.");
    }
    class In{//内部类
        int age =20;
        public void in(){
         //1,内部类 可以直接使用外部类的 所有资源
            System.out.println(name);
            System.out.println("in.");
        }
    }
}
