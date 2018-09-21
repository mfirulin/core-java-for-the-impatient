public class Greeter implements Runnable {
    private String target;
    private int number;
  
    public Greeter(String target, int number) {
        this.target = target;
        this.number = number;
    }
  
    public void run() {
        for (int i = 0; i < number; i++)
            System.out.println("Hello, " + target + "!");
    }
  
    public static void main(String[] args) {
        Runnable task1 = new Greeter("Mark", 10000);
        Runnable task2 = new Greeter("Anna", 10000);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}
