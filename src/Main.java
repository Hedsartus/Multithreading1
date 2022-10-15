public class Main {
    public static void main(String[] args) {
        ThreadGroup mainThreadGroup = new ThreadGroup("main group");

        System.out.println("Создаю потоки...");

        MyThread thread1 = new MyThread(mainThreadGroup, "поток 1");
        thread1.start();
        MyThread thread2 = new MyThread(mainThreadGroup, "поток 2");
        thread2.start();
        MyThread thread3 = new MyThread(mainThreadGroup, "поток 3");
        thread3.start();
        MyThread thread4 = new MyThread(mainThreadGroup, "поток 4");
        thread4.start();

        try {
            Thread.sleep(15000);
            System.out.println("Завершаю все потоки.");
            mainThreadGroup.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
