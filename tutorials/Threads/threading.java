package practices.tutorials.Threads;

class MyThread extends Thread {
    public void run(){
        for(int i = 1; i <= 3; i++){
            System.out.println(Thread.currentThread().getId() + "Value" + i);
        }
    }

    public void show(){
        System.out.println("Show");
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i <= 3; i++){
            System.out.println(Thread.currentThread().getId() + "Runnable" + i);
        }
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment(){
        for (int i = 1; i <= 3; i++){
            System.out.println("Synchronised" + this.count++);
        }
    }
}

public class threading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        thread1.show();

//        MyRunnable runnable1 = new MyRunnable();
//        MyRunnable runnable2 = new MyRunnable();

        Thread runnable1 = new Thread(new MyRunnable());
        Thread runnable2 = new Thread(new MyRunnable());

        runnable1.start();
        runnable2.start();

        Counter counter = new Counter();
        Thread t1 = new Thread(() -> counter.increment());
        Thread t2 = new Thread(() -> counter.increment());

        t1.start();
        t2.start();
    }
}
