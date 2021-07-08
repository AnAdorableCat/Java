package day15;

//测试 Thread
public class Test3_Thread {
    public static void main(String[] args)
                        throws InterruptedException {
        //1,创建对象
        Thread t = new Thread();
        //2,调用方法
        System.out.println(t.getId());//返回该线程的标识符
        t.setName("钢铁侠");//改变线程名称
        System.out.println(t.getName());//返回该线程的名称
        t.run();//运行
        t.start();//启动
        Thread.sleep(10);//让线程休眠10ms
        //获取当前正在执行任务的线程对象
        Thread cur = Thread.currentThread();
        System.out.println(cur.getName());
    }
}
