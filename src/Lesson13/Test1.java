
package Lesson13;


public class Test1 {
    
}
class Student{
    int grade;
    Student(int grade){
    this.grade = grade;
    }
    public static void main(String[] args){
        Student st1 = new Student(5);
        switch(st1.grade){
            case 2: 
                System.out.println("Student is dall");
                break;
            case 3: 
                System.out.println("Student isn't good");
                break;
            case 4: 
                System.out.println("Student is good");
                break;
            case 5: 
                System.out.println("Student is great");
                break;
            default:
                System.out.println("Grade is not correct");
        }
    }

}