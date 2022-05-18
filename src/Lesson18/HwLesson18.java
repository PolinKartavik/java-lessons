
package Lesson18;


public class HwLesson18 {
    public static int[] sortirovka(int [] array){
    
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            //isSorted = true;
            for(int i = 1; i<array.length; i++){
                if(array[i] < array[i-1]){
                     int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    
                    isSorted = false;
                    
                }
                
            }
            
        }
       return array;
    }
    public static void main(String[] args){
        HwLesson18 h = new HwLesson18();
        int [] array = {1, 6, 7, 3, -9, -5, 10, 0};
        h.sortirovka(array);
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        
    }
}
