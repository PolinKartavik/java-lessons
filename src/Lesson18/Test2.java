
package Lesson18;


public class Test2 {
    public static void main(String[] args){
        int [] array, a;// это массивы
        String array1[];
        int b [], c;//b это массив, с это переменная типа инт
        c= 5;
        int d[], e [][];
        int [] array2[];
        int [] array20[][];
        
        array1 = new String[3];
        array2 = new int[3][];
        
        for (int i = 0; i  < array1.length; i++){
            array1[i] = "privet" + i;
            System.out.println(i);
        }
        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];
        
        for(int i = 0; i < array2.length; i++){
        for(int j = 0; j < array2[i].length; j++){
            array2[i][j] = i+j;
            System.out.println(array2[i][j]);
        }
        
        }
    }    
}
