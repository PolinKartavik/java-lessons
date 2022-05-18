
package Lesson7_1;


public class HWLesson7 {
   public static void main(String[] args){
   }
    
    
}
class Employee{
int id;
public String surname;
int age;
private double salary;
String department;

    public Employee(int id2){
        id = id2;
    }
    
    Employee(String surname2){
    surname = surname2;
    }
    
    private Employee(double salary2){
        salary = salary2;
    }
    
    public void getId(){
        System.out.println("Id "+ id);
    }
    public void getSurname(){
        System.out.println("Surname " + salary);
    }
    
    public void getSalary(){
        System.out.println("Salary " + salary);
    }
}
