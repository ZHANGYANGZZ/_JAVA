package Thread_yield;

public class YieldTest implements Runnable {
    //创建并启动线程
    YieldTest(){
        Thread t = new Thread(this);
        t.start();
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            //当i = 0 时让出CPU执行权，放弃时间片，进行下一轮调度
            if(( i % 5) == 0){
                System.out.println(Thread.currentThread() + "yield CPU...");
                //当前线程让出CPU执行权，放弃时间片，进行下一轮调度
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread() + "is over");
    }

    public static void main(String[] args) {
        new YieldTest();
        new YieldTest();
        new YieldTest();
    }
}
