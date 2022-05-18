
package Lesson13;


public class Employee {
    public static void main(String[] args){
       int denNedeli = 1;
        switch(denNedeli*3){
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
                System.out.println("Work lasts till 6pm");
            break;
            case 6: 
                System.out.println("Work lasts till 6pm");
            break;
            case 7: 
                System.out.println("Work doesn't last");
            break;
            default: System.out.println("It is not a day");

        }
    }
    
}
