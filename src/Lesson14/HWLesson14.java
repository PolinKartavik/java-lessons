
package Lesson14;


public class HWLesson14 {
    static void time(){
        OUTER:
        for(int chas = 0; chas < 6; chas++){
            MIDDLE:
            for (int min = 0; min < 60; min++){
                if(chas >1 && min % 10 == 0){
                break OUTER;  
                }
                INTER:
                for (int sek = 0; sek < 60; sek++){
                    if (sek * chas > min){
                        continue  MIDDLE;                   
                    }
                    System.out.println(chas + ":" + min + ":" + sek);
            
                }
            }
        }
    }
    public static void main(String[] args){
    time();
    }
   
    
}
