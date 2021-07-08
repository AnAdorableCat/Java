package day16;
//模拟 单例模式--保证一个类仅有一个实例
//1,饿汉式--写法简单,是常用的写法
//2,懒汉式--写法复杂,是面试的重点:::按需加载+线程安全
public class Test3 {
    public static void main(String[] args) {
//        new MySingleton();
//        new MySingleton();
        MySingleton m1 = MySingleton.getM();
        MySingleton m2 = MySingleton.getM();
        //==比基本类型是比值,比引用类型比的是地址值
        System.out.println(m1==m2);//true

        MySingleton2 m3 = MySingleton2.getM();
        MySingleton2 m4 = MySingleton2.getM();
        System.out.println(m3==m4);
    }
}
//TODO 懒汉式--按需加载--线程安全
//怎么判断,数据,在多线程编程时,有没有安全隐患?
//--如果有多条记录操作了共享数据,一定要加锁
class MySingleton2{
    //手写 单例设计模式的两种写法:懒汉式/饿汉式
    private MySingleton2(){}
    static private MySingleton2 m;
    //共享资源m是静态的,使用的锁对象必须是固定的类名.class
    //如果是静态方法,加锁后,自动分配的锁对象就是类名.class
//    synchronized static public MySingleton2 getM(){
    static public MySingleton2 getM(){
        synchronized (MySingleton2.class){
            if (m == null) {//判断,没new过才new
                m = new MySingleton2();
            }
            return m;
        }
    }
}
//TODO 实现单例模式:保证一个类仅有一个实例 --饿汉式
class MySingleton{
    //1,不让外界随便new--私有化构造方法
    private MySingleton(){}
    //2,在内部创建一个对象,给外界提供
//加static的原因:::要被静态资源getM()调用,必须也要变成静态的
    static private MySingleton m = new MySingleton();
    //3,给外界提供公共的方法,返回m
//加static的原因:::无法通过对象的方式访问,只能通过类名直接调用
    static public MySingleton getM(){
        return m ;
    }
}