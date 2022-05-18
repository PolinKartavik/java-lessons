
package Lesson23;


public class Test2 {
    //public Object abc(){return new Doctor();}
    public static void main(String [] args){
        /*Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee em = new Employee();
        Hirurg x = new Hirurg();*/
        
        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.age);
        System.out.println(emp1.name);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
        
        
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
      
        Doctor dr2 = new Hirurg();
        System.out.println(dr2.name);
        dr2.eat();
        dr2.sleep();
        Employee emp4 = new Hirurg();
        emp4.eat();
        emp4.sleep();
        System.out.println();
    }
    
}
class Employee{
    double salary = 100;
String name = "Kolya";
int age;
int experience;
void eat(){System.out.println("Kushat");}
void sleep(){System.out.println("Sleep");};
}
class Doctor extends Employee{
    void lechit(){System.out.println("Lechit");}
    }
class Hirurg extends Doctor{
    String skalpil;
    void operation(){};    
}
class Teacher extends Employee{
    int kolichestvo;
    void teach(){System.out.println("Teach");}
    }

class Driver extends Employee{
int nazvanieMashini;
void drive(){System.out.println("Teach");}
}