
package Lesson15;


public class HWLesson15 {
    static void time(){
        int chas = 0;
        
        OUTER:
        while(chas < 6){
            int min = -1;
            MIDDLE:
            do{
                min++;
                if(chas >1 && min % 10 == 0){
                break OUTER;  
                }
                int sek = 0;
                INTER:
                while(sek<60){
                    if (sek * chas > min){
                        continue  MIDDLE; 
                       
                    }
                    System.out.println(chas + ":" + min + ":" + sek);
                    sek++;
            
                }  
        }
            while(min<59);
                chas++;
    }
    }
    public static void main(String[] args){
    time();
    }
}
    

