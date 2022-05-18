
package Lesson24;


public class Test3 {
    public static void main(String[] args){
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.pomosh();
        h.tishitPojar("voda");
        s.swim();
    }
}
class Employee{
    double salary=100;
    String name = "Kolya";
    int age;
    int experience;
    void eat(){
        System.out.println("Kushat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}
class Teacher extends Employee implements Help_able{
    int kolichestvo;
    void teach(){System.out.println("Teach");}
    public void pomosh(){
    System.out.println("uchitel okazivaet pomosh");
    }
    public void tishitPojar(String s){
    System.out.println("uchitel tushit pojar");
    }
    }

class Driver extends Employee implements Help_able,Swim_able{
    int nazvanieMashini;
    void drive(){System.out.println("Teach");}
    public void pomosh(){
    System.out.println("uchitel okazivaet pomosh");
    }
    public void tishitPojar(String s){
    System.out.println("uchitel tushit pojar" + s);
    }
    public void swim(){
        System.out.println("Driver can swim");
    }
    }
interface Help_able{
    
    void pomosh();
    void tishitPojar(String predmet);
    public final static int a = 10;
}

interface Swim_able{
    void swim();
}

