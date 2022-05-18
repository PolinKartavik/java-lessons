
package Lesson16;


public class HWLesson162 {
    public void email(String s){
       
        System.out.println(s.substring(3, 8));
        System.out.println(s.substring(17, 21));
        System.out.println(s.substring(30, 35));
    
    }
    
    public static void main(String [] args){
    HWLesson162 l = new HWLesson162();
    l.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }

    
}
