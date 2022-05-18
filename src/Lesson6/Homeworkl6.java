
package Lesson6;


 class Homeworkl6 {
    int sum(){
        int result = 0;
        System.out.println("Summa chisel: " + result);
        return result;
    }
    
    int sum(int a){
        int result1 = a;
        System.out.println("Summa chisel: " + result1);
        return result1;
    }
    
    int sum(int a, int b){
        int result2 = a + b;
        System.out.println("Summa chisel: " + result2);
        return result2;
    }
    
    int sum(int a, int b, int c){
        int result3 = a+ b+ c;
        System.out.println("Summa chisel: " + result3);
        return result3;
    }
    
    int sum(int a, int b, int c, int d){
        int result4 = a+ b+ c+ d;
        System.out.println("Summa chisel: " + result4);
        return result4;
    }
 }
    class SummTest{
    public static void main(String[] args){
    Homeworkl6 s = new Homeworkl6();
    s.sum();
    s.sum(4);
    s.sum(2,5);
    s.sum(3,7,9);
    s.sum(4,6,8,10);
    }
    }
    

