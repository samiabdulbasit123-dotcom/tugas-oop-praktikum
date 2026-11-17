class CustomThread extends Thread {
    private String threadName;

    public CustomThread(String name) {
        this.threadName = name;
    }

    
    public void run() {
        System.out.println(threadName + " sedang berjalan...");
    }
}

public class No8 {
    public static void main(String[] args) {
        System.out.println("Thread Utama (Main Thread) mulai.");

       
        int jumlahThread = 5;
        CustomThread[] threads = new CustomThread[jumlahThread];

        for (int i = 0; i < jumlahThread; i++) {
            threads[i] = new CustomThread("Thread-Anak ke-" + (i + 1));
            threads[i].start(); 
        }

        System.out.println("Thread Utama selesai.");
    }
}