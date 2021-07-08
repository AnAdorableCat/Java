package day15;
//测试 售票
public class Test6_Tickets {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new MyTickets().start();
        }
        /*
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
        */
    }
}
//设计4个售票窗口，总计售票100张。
class MyTickets extends Thread{
    //TODO 问题1::卖了400张票???
//    int tickets = 100;//定义变量,记录票数
    //原因::tickets是成员变量,new了4次,在内存中就产生了4份.
    //解决方案::把tickets变成共享资源,只加载一次,只有1份.
    static int tickets = 100;//定义变量,记录票数

    //把业务重写的run()
    //TODO 准备卖票,tickets--
    @Override
    public void run() {
        while(true){
            if(tickets>0){
                //TODO 让程序休眠一会儿,检查数据的安全性
                //TODO 问题2::重卖:一张票卖了多次
                //TODO 问题3::超卖:卖了0 -1 -2票
                //原因:
                //解决方案:
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(super.getName()+"==="+tickets--);
            }else{
                break;//结束死循环
            }
        }
    }
}


