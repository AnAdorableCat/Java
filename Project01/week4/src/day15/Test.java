package day15;
//测试 四个窗口卖票
class MyyThread extends Thread {
    private static int tickets = 1000;

    @Override
    public void run() {
        while (true) {
            synchronized (MyyThread.class) {
                if (tickets>0) {
                    System.out.println(this.getName() + "正在销售第" + (tickets--) + "张票！");
                }else {
                    break;
                }
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new MyyThread().start();
        }
    }
}