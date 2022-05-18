
package Lesson16;


public class Test4 {
    
}
class Employee{
    double salary;
    boolean isManager;
    Employee(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}
class TestEmployee{
    public static void main(String [] args){
        Employee emp = new Employee(100.5, true);
            System.out.println("Is he a maneger?" + emp.isManager +" His salary is " + emp.salary);
        
    }

}