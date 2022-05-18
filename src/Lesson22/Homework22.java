
package Lesson22;



public class Homework22 {
    public static void main(String [] args){
        Student1 s = new Student1();
        s.setName1(new StringBuilder("Polina"));
        s.setCourse(5);
        s.setGrade(11);
        s.showInfo();
    }
    
}
class Student1{
    private StringBuilder name;
    
    
    public StringBuilder getName1(StringBuilder s){
        StringBuilder sb1 = new StringBuilder(name);
        return sb1;
    }
    public void setName1(StringBuilder s){
        if (s.length() >=4){
            name = s;
        }
    }
    private int grade;
    public int getGrade(){
        return grade;
    }
    public void setGrade(int i){

        if (i >=1 && i <=11){
            grade = i;
        }
    }
    private int course;
    public int getCourse(){
    return course;
    }
    public void setCourse(int i){
    if (i>=1 && i<=5){
        course = i;
    }
    }
    public void showInfo(){
        System.out.println("Student: name- " + name );
        System.out.println("course- " + course);
        System.out.println("grade- " + grade);
    
    }
}