
package Lesson7;

 class Employee {
     double salary;
    
     void dvoynayzp(){
    System.out.println("Novay z/p " + salary *2);
    }
    
    public Employee(double salary2){
    salary = salary2;
    }
    public static void main(String[] args){
    Employee emp = new Employee(500);
    System.out.println(emp.salary);
    emp.dvoynayzp();
    }
}
class EmloyeeTest{
    public static void main(String[] args){
    Employee emp = new Employee(500);
    System.out.println(emp.salary);
    emp.dvoynayzp();
    }
}
