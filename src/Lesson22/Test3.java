
package Lesson22;


public class Test3 {
    void uvelichenieZP(Employee e ){
    e.salary = e.salary + 100;
    }
    public static void main(String [] args){
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        //doc.spesialization = "hirurg";
        doc.eat();
        doc.sleep();
        doc.lechit();
    }
}
class Employee{
    double salary;
String name;
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
class Dantist extends Doctor{

    }




class Teacher extends Employee{
int kolichestvo;
void teach(){System.out.println("Teach");}
}

class Driver extends Employee{
int nazvanieMashini;
void drive(){System.out.println("Teach");}
}