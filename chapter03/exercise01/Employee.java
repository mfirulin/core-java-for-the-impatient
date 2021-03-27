interface Measurable {
    double getMeasure();
}

public class Employee implements Measurable {
    private String name;
    private double salary;
  
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
  
    public double getMeasure() {
        return salary;
    }
  
    public static double average(Measurable[] objects) {
        double sum = 0;
        int count = 0;
    
        for (Measurable obj : objects)
            if (obj != null) {
                sum += obj.getMeasure();
                count++;
            }
    
        return sum / count;
    }
  
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
         
        employees[0] = new Employee("Fred", 1255);
        employees[1] = new Employee("Helen", 1150);
        employees[2] = new Employee("Mark", 1120);
  
        System.out.println(average(employees));	
    }
}
