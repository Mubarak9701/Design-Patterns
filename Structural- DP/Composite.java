import java.util.*;
import java.util.Iterator;
interface Employee {
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
    public String getName();
    public double getSalary();
    public void print();
}
class Developer implements Employee{

    private String name;
    private double salary;
  
    public Developer(String name,double salary){
      this.name = name;
      this.salary = salary;
    }
    public void add(Employee employee) {
      //this is leaf node so this method is not applicable to this class.
    }
  
    public Employee getChild(int i) {
      //this is leaf node so this method is not applicable to this class.
      return null;
    }
  
    public String getName() {
      return name;
    }
  
    public double getSalary() {
      return salary;
    }
  
    public void print() {
      System.out.println("-------------");
      System.out.println("Name ="+getName());
      System.out.println("Salary ="+getSalary());
      System.out.println("-------------");
    }
  
    public void remove(Employee employee) {
      //this is leaf node so this method is not applicable to this class.
    }
  
}

class Manager implements Employee{

    private String name;
    private double salary;
   
    public Manager(String name,double salary){
     this.name = name;
     this.salary = salary;
    }
   
    ArrayList<Employee> employees = new ArrayList<Employee>();
    public void add(Employee employee) {
       employees.add(employee);
    }
   
    public Employee getChild(int i) {
     return employees.get(i);
    }
   
    public String getName() {
     return name;
    }
   
    public double getSalary() {
     return salary;
    }
   
    public void print() {
     System.out.println("-------------");
     System.out.println("Name ="+getName());
     System.out.println("Salary ="+getSalary());
     System.out.println("-------------");
   
     Iterator<Employee> employeeIterator = employees.iterator();
       while(employeeIterator.hasNext()){
        Employee employee = employeeIterator.next();
        employee.print();
       }
    }
   
    public void remove(Employee employee) {
     employees.remove(employee);
    }
   
   } 

public class Composite {
    
    public static void main(String[] args) {
        Employee emp1=new Developer("per1", 10000);
        Employee emp2=new Developer("per2", 15000);
        Employee manager1=new Manager("per3",25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3=new Developer("per4", 20000);
        Manager generalManager=new Manager("per4", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }   
}
