
package Lesson23;


public class Test5 {
    public static void main(String [] args){
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
        emp.sleep();
        Employee2 e = new Teacher2();
        e.sleep();
    }
}
class Eda1{}
class Fruits1 extends Eda1{}
class Employee2{
    double salary = 100;
    String name = "Kolya";

    public Eda eat(){
        System.out.println("Kushat");
        Eda e = new Eda();
        return e;
    }

   static  void sleep(){
        System.out.println("Sleep rabotnik");
    };
}



class Teacher2 extends Employee2{
    int kolichestvo;
    void teach(){System.out.println("Teach");}
    //private void sleep(){
    //    System.out.println("Sleepuchitel");
    //};
    }
    
 