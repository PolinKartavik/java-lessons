
package Lesson18;


public class Test6 {
    public static void MaxMin(double [] array){
        double max = array[0];
        double min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]> max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Min element of the massiv: " + min + " Max element of the massiv: " + max);
    }
    public static void main(String[] args){
        double[] array1 = {1.05, -3.14, 8.0, 9.19, -3.0};
        MaxMin(new double [] {2.5, -1.3});
    }
    
}
