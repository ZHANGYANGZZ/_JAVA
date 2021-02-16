package DeadThreads;

public class DeadLockTest2 {
    //创建资源
    private static Object resoureceA = new Object();
    private static Object resoureceB = new Object();

    public static void main(String[] args) {
        /*
            匿名内部类地创建方式；
            注意同步代码块synchronized(resourceB)是在synchronized(resourceA)的内部
         */
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resoureceA) {
                    System.out.println(Thread.currentThread() + "get ResourceA");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + "waiting get sourceB");
                    synchronized (resoureceB) {
                        System.out.println(Thread.currentThread() + "get resourceB");
                    }
                }
            }
        });

        //创建线程B
        Thread threadB = new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized (resoureceB) {
                    System.out.println(Thread.currentThread() + "get ResourceB");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + "waiting get sourceA");

                    synchronized (resoureceA) {
                        System.out.println(Thread.currentThread() + "get ResourceA");
                    }
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
