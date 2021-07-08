package day15;
//测试 Runnable
public class Test5_Runnable {
    public static void main(String[] args) {
        //1,创建对象
        MyRunnable target = new MyRunnable();
        //绑定Thread和目标类的关系
        Thread t = new Thread(target);//新建状态
        Thread t2 = new Thread(target);
        //2,启动线程
        t.start();//执行目标类里的run()
        t2.start();//变成 可运行状态
        /* 多线程结果的随机性
            Thread-0---0
            Thread-1---0
            Thread-1---1
         */
    }
}
//创建类,实现 TODO 1,Runnable接口
class MyRunnable implements Runnable{
    //打印10次线程名称--TODO 2,重写的run()
    @Override
    public void run() {//从可运行状态变成了运行状态
        for (int i = 0; i < 10 ; i++) {
       //TODO 3,Thread.currentThread()获取当前正在执行任务的线程对象
            //getName()获取线程名称
    System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }//线程的终止状态
}
