
package Lesson19;


public class Test5 {
    public static void main(String [] agrs){
        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"mat analis", "filosofia"};
        for(String s1: students){
            for (String s2: exams){
                System.out.println(s1 + " " + s2);
            }
        }
    }
    
}
