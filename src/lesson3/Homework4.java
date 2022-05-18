
package lesson3;

public class Homework4 {
    int id;
    String name;
    String Surname;
    int year;
    double math;
    double economic;
    double language;
}
class StudentTest{
    public static void main(String [] args){
    Homework4 First = new Homework4();
    Homework4 Second = new Homework4();
    Homework4 Third = new Homework4();
    
    First.id = 1;
    First.name = "Polina";
    First.Surname = "Terekhina";
    First.year = 2019;
    First.math = 4;
    First.economic = 3;
    First.language = 5;
    
    System.out.println("Средне арифмитеская оценка " + First.name + " " + First.Surname + " " + First.id + " " + (First.math + First.economic + First.language)/3);
    
    }
}
