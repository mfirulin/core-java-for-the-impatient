public class Ch03Ex09 implements Runnable {
  private String name;
  
  public Ch03Ex09(String name) {
  	this.name = name;
  }
  
  public void run() {
  	System.out.println("I am " + name);
  }

  public static void runTogether(Runnable... tasks) {
    for (Runnable task : tasks) {
      Thread thread = new Thread(task);
      thread.start();
    }
  }
  
  public static void runInOrder(Runnable... tasks) {
    for (Runnable task: tasks)
      task.run();
  }
  
  public static void main(String[] args) {
  	Runnable[] tasks = new Runnable[3];
    tasks[0] = new Ch03Ex09("Scott");
    tasks[1] = new Ch03Ex09("Peter");
    tasks[2] = new Ch03Ex09("Anna");

    System.out.println("runInOrder() works:");
    runInOrder(tasks);
    System.out.println("runTogether() works:");
    runTogether(tasks);

  }
}
