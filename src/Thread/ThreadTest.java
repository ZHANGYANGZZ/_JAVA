package Thread;

/**
 * 使用继承的好处：
 *  在run方法中获取当前线程直接使用this就可以，无需使用Thread.currentThread()方法。
 *  缺点：
 *  JAVA不支持多继承，不能够再继承其它类；代码和任务没有分离，当多个线程执行一样的任务时需要多份任务代码。
 *  runnable没有这个限制。
 */
public class ThreadTest {
    //继承Thread类并重写run方法
    public static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    public static void main(String[] args) {
        //创建线程
        MyThread thread = new MyThread();
        thread.start();
    }
}
