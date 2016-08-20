import java.util.Arrays;
import java.util.Comparator;

class Employee {
  private String name;
  private double salary;
  
  public Employee(String name, double salary) {
  	this.name = name;
    this.salary = salary;
  }
  
  public String getName() { return name; }
  
  public double getSalary() { return salary; }
  
  public String toString() {
  	return "name=" + name + " salary=" + salary;
  }
  
  public static void printEmployees(Employee[] employees) {
  	for (Employee e : employees)
      if (e != null)
        System.out.println(e);
  }
}

public class Ch03Ex14 {
  public static void main(String[] args) {
    Employee[] employees = new Employee[] {
      new Employee("Fred", 1250),
      new Employee("Anna", 1150),
      new Employee("John", 1300),
      new Employee("Allan", 1050),
      new Employee("Mark", 1200),
      new Employee("Joe", 1400)
    };
    
    Arrays.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
    // Arrays.sort(employees, Comparator.comparing((Employee e) -> e.getSalary()).thenComparing((Employee e) -> e.getName()));
    Employee.printEmployees(employees);
  }
}
