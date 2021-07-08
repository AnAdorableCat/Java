package day16;
//多线程售票
public class Test2 {
    public static void main(String[] args) {
        //TODO 模拟多线程卖票
        MyTickets t1 = new MyTickets();
        MyTickets t2 = new MyTickets();
        MyTickets t3 = new MyTickets();
        MyTickets t4 = new MyTickets();
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class MyTickets extends Thread {
    static int tickets = 100;
    @Override
//TODO 2,方法加锁,会自动分配锁对象,
// 普通方法分配的锁对象是this,静态方法分配的锁对象是类名.class
// synchronized public void run() {//没锁住,以为锁对象是this
    public void run() {
        while (true) {
//            synchronized (this){//没锁住
 //TODO 1,如果共享资源是静态的,锁对象必须是 类名.class
            synchronized (MyTickets.class){
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(super.getName() + "===" + tickets--);
                } else {
                    break;
                }
            }
        }
    }
}

