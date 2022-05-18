
package Lesson7_1;


public class HWLesson7Employee {
    public static void main(String[] args){
    Employee emp1 = new Employee(12);
    Employee emp2 = new Employee("Mikky");
    //Employee emp33 = new Employee(5.6);
    
    System.out.println(emp1.id);
    System.out.println(emp1.surname);
    //System.out.println(emp1.salary);
    
    System.out.println(emp2.id);
    System.out.println(emp2.surname);
    //System.out.println(emp2.salary);
    
    emp1.getId();
    emp1.getSurname();
    emp1.getSalary();
    
    emp2.getId();
    emp2.getSurname();
    emp2.getSalary();
    }
    
}
