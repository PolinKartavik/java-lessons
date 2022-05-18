
package Lesseon5;


public class HWL5Employee {
    
    int id;
    String name;
    String surname;
    int age;
    double salary;
    String department;
    //конструктор дальше создаем
    HWL5Employee(int id2, String name2,String surname2, int age2, double salary2, String department2){
    id = id2;
    name = name2;
    surname = surname2;
    age = age2;
    salary = salary2;
    department = department2;
    }
     
    double SummaSalary(){
    salary*=2;
    return salary;
    }
    
}

class EmployeeTest{
    public static void main(String[] args){
        HWL5Employee emp1 = new HWL5Employee(1, "mikky", "milkovich",10, 207.8, "IT");
        HWL5Employee worker2 = new HWL5Employee(1, "Polya", "Bekker",21, 1007.8, "IT");
        emp1.SummaSalary();
        System.out.println("New salary of the worker " + emp1.surname + ": " + emp1.salary);
    }
   
    

}