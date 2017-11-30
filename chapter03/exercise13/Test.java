public class Test implements Runnable {
    private int id;
    
    public Test(int id) {
        this.id = id;
    }
    
    public void run() {
        System.out.println(id);
    }
    
    public static Runnable joinTasks(Runnable[] tasks) {
        return () -> {
            for (Runnable task : tasks)
                new Thread(task).start();
        };
    }
    
    public static void main(String[] args) {
        Test[] tasks = new Test[10];
        for (int i = 0; i < tasks.length; i++)
            tasks[i] = new Test(i + 1);
        
        new Thread(joinTasks(tasks)).start();
    }
}
