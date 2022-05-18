
package Lesson8;


public class HWLesson8 {
   // static int a;
    //static int b;
    //static int d;
    static int Summa(int a, int b, int d){
        int c = a*b*d;
        return c; 
    }
    
    public static void Umnojeny(int a, int b){
   // int c = a/b;
   // double e = a%b;
    System.out.println("Целлове частное = " + a/b + "; Остаток = "+ a % b);

    }
    
}
class Testt{
     public static void main(String [] args){
         System.out.println(HWLesson8.Summa(5, 7, 9));
         HWLesson8.Umnojeny(6, 7);
         System.out.println(HWLesson8.Summa(2, 4, 80));
         HWLesson8.Umnojeny(8, 4);
}
}