
package Lesson8;


public class Student {
    String name;
    int course;
    static int count;
    int a;
    
    
    public Student(String name2, int course2){
    count++;
    name = name2;
    course = course2;
    System.out.println("Stundent # "+ count + " is created");
    }
    
    public static void showCount(){
    System.out.println("All created student" + count);
    
}
    public void showInfo(){
        System.out.println("welcome to the class!!");
    }
    void abc(){
    a++;
    count++;
    }
    static void absd(){
        count++;
        Student st2 = new Student("Petr", 1);
        st2.a++;
    }
    public static void main(String [] args){
        absd();
        //.abc();
        
    
}
}
