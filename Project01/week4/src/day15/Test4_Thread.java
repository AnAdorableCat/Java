package day15;
//测试 Thread
public class Test4_Thread {
    public static void main(String[] args) {
        //1,创建对象 -- 模拟多线程编程
        MyThread t = new MyThread();//新建状态
        MyThread t2 = new MyThread();
        //2,启动线程
        t.start();//从新建状态变成 可运行状态,等待CPU调度
        t2.start();//启动线程+执行线程的run()
        /* 多线程的随机性
            Thread-0~~0
            Thread-1~~0
            Thread-0~~4
            Thread-0~~1
            Thread-1~~1
        */
//        t.run();//就相当于是一个普通方法的调用,没有多线程效果
//        t2.run();
        //TODO 面试题:run()和start()的区别???
    }
}
//创建线程类::: TODO 1,继承Thread类
class MyThread extends Thread{
    //打印10次线程名称--TODO 2,重写的run()里
    @Override
    public void run() {//从可运行状态 变成 运行状态
        for (int i = 0; i < 20 ; i++) {
            //使用父类的getName()获取线程名称
            System.out.println(super.getName()+"~~"+i);
        }
    }//run()执行完毕,线程变成终止状态
}
