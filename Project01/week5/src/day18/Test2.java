package day18;
//匿名内部类--优化了结构
public class Test2 {
    public static void main(String[] args) {
        //4.测试
//        Inter in = new InterImpl();
//        in.save();
        //TODO 使用匿名内部类,,,优化了 2 3 4 步骤
        new Inter(){
            //创建了接口的对象,需要重写抽象方法
            @Override
            public void save() {
                System.out.println(123);
            }
        }.save();//调用方法--匿名对象,一次只能调用一个任务
        //TODO 练习::::使用匿名内部类 测试
        Inter2 in = new Inter2(){
            @Override
            public void delete() {
                System.out.println("delete");
            }
            @Override
            public void get() {
                System.out.println("get");
            }
        };
        //使用同一个对象,调用多个方法
        in.delete();
        in.get();
        //TODO 练习::::使用匿名内部类 测试
        Demo d = new Demo(){
            @Override
            public void game() {
                System.out.println(123);
            }
        };
        d.eat();
        d.sleep();
        d.game();
    }
}
//TODO ::::创建抽象类
abstract class Demo{
    public void eat(){}
    public void sleep(){}
    abstract public void game();//必须写全
}
//TODO ::::创建接口
interface Inter2{
    //简写形式,自动拼接public abstract
    void delete();
    void get();
}
//1.创建接口
interface Inter{
    void save();//简写形式,自动拼接public abstract
}
////2.创建实现类实现接口
//class InterImpl implements Inter{
//    //3.重写抽象方法,否则就是抽象的实现类
//    @Override
//    public void save() {
//        System.out.println("save");
//    }
//}