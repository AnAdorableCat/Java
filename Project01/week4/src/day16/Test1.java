package day16;

//测试 售票案例
public class Test1 {
    public static void main(String[] args) {
        //创建目标对象
        MyTickets2 target = new MyTickets2();
        for (int i = 0; i < 4; i++) {
            new Thread(target).start();
        }
        /*
        //绑定目标类和Thread关系
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);
        Thread t4 = new Thread(target);
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        */
    }
}

class MyTickets2 implements Runnable{

    int tickets = 100;
    Object obj = new Object();
//TODO 1,使用synchronized关键字修饰方法,实现同步方法
//实现了多个线程,需要排队等待的效果,牺牲了性能保证了安全.
//    synchronized public void run() {
//TODO 2,使用synchronized关键字修饰代码块,实现同步代码块
//语法:synchronized(锁对象){代码}
//锁的位置:合理位置--共享资源第一次被使用开始,用完结束
//锁对象:可以任意,必须是同一个对象
    @Override
    public void run() {
        while (true) {
//  synchronized(new Object()){//不对,不是同一个锁对象
//            synchronized(obj){//对,是同一个对象
//            synchronized("123"){//对,是同一个对象
            synchronized(this){//对,是同一个对象
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "===" + tickets--);
                } else {
                    break;
                }
            }
        }
    }
}