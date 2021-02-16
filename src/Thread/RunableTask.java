package Thread;

public class RunableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("I am a child thread");
    }

    public static void main(String[] args) {
        RunableTask task = new RunableTask();
        // 两个线程共用task代码逻辑，如果需要，可以给RunableTask添加参数进行任务分区。
        new Thread(task).start();
        new Thread(task).start();
    }
}
