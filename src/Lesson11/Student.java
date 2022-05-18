
package Lesson11;


public class Student {
    public String name;
    public int course;
    public double grade;
    
    Student(String name, int course, double grade){
    this.name = name;
    this.course = course;
    this.grade = grade;
    
    }
    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }
    
    public static void changeName(Student s1){
    s1.name = "Vasy";
    
    }
   /* public static void main(String[] args){
        Student st1 = new Student("Ivan", 3, 4.5);
        Student st2 = new Student("Petr",1, 5.3);
        method1(st1, st2);
    
    
    }*/
    
    
}
class StudentTest{
    public static void method1(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade){
        System.out.println("They are similar");
    }
        else{
        System.out.println("They are not similar");
        } 
}

       public static void method2(Student st1, Student st2){
         if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course){
                if (st1.grade == st2.grade){
                    System.out.println("Their grages, names and cources are similar");
                }
                else{
                    System.out.println("Their grades are not similar");
                }
            }
            else {
                System.out.println("Their cources are not similar");
            }
         }
         else{
         System.out.println("Their names are not similar");
         }
    }
       
       public static void main(String[] args){
        Student st1 = new Student("Ivan", 3, 4.5);
        Student st2 = new Student("Ivan",3, 5.3);
        method1(st1, st2);
        method2(st1, st2);
    
    
    }
}