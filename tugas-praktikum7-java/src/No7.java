class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }

   
    public void run() {
        System.out.println(threadName + " mulai berjalan.");
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " - Hitungan ke-" + i);
            try {
                Thread.sleep(500); // jeda sejenak (0.5 detik)
            } catch (InterruptedException e) {
                System.out.println(threadName + " diinterupsi.");
            }
        }
        System.out.println(threadName + " selesai.");
    }
}

public class No7 {
    public static void main(String[] args) {
       
        MyThread t1 = new MyThread("Thread-A");
        MyThread t2 = new MyThread("Thread-B");

        
        t1.start();
        t2.start();
    }
}