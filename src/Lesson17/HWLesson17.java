
package Lesson17;


public class HWLesson17 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        
        boolean temp = true;
        if (sb1.length() == sb2.length()){
            for(int i = 0; i < sb1.length(); i++){
                if(sb1.charAt(i) != sb2.charAt(i)){
                    temp = false;
                    break;
                    }
            }
        }
        else{
            temp = false;   
        }
        return temp;
    }
    
    
    public static void main(String [] args){
        StringBuilder sb1 = new StringBuilder("Happy Birthday!"); 
        StringBuilder sb2 = new StringBuilder("Happy Birthday!"); 
        boolean a = HWLesson17.ravenstvo(sb1, sb2);
        
        System.out.println(a);
    }

}