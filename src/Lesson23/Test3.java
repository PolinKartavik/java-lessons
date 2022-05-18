
package Lesson23;


public class Test3 {
    public static void main(String[] args){
        Teacher1 t = new Teacher1();
        Employee1 emp5= new Employee1();
        emp5.eat();
        t.eat();
    }
}
class Eda{}
class Fruits extends Eda{}
class Employee1 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    Eda eat(){
        System.out.println("Kushaen rabotnik");
        Eda e = new Eda();
        return e;
    }
    
    
    void sleep(){
        System.out.println("Sleep");
    };
}
class Teacher1 extends Employee1{
    int kolichestvo;
    void teach(){System.out.println("Teach");}
    Fruits eat(){
        System.out.println("Kushaen uchitel");
        Fruits f = new Fruits();
        return f;
    }
    }
    