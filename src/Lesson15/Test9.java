
package Lesson15;


public class Test9 {
    public static void main(String[] args){
        int chas = 0;
        OUTER:
        do{
            int min = 0;
        
            INTER:
            while(min < 60){
                if (min == 20){
                continue OUTER;}
                System.out.println(chas + ";" + min);
                min++;
            }
        chas++;
        }
        while(chas <24);
    }
    
}
