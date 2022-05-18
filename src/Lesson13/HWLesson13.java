
package Lesson13;


public class HWLesson13 {
    
}
class Month{
    public static void dayCount(int day){
   
    switch(day){
        case 2: 
            System.out.println("28 days in the month");
            break;
        case 1:
        case 3:
        case 5:
        case 6:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("31 days in the month");
            break;
        case 4:
        case 9:
        case 11:
            System.out.println("30 days in this month");
            break;
        default: 
            System.out.println("It isn't a real month");
    }
}
    public static void main(String[] args){
    dayCount(-3);
    }
}