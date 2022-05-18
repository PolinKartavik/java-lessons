
package Lesson24;


public class Test5 {
    
}
interface I1{
    default void abc(){
        System.out.println("it is abc method");
    }
    static void def(){
        System.out.println("it is static method 1");
    }
}
interface I2{
    static void def(){
        System.out.println("it is static method 2");
    }
}

class R {
    public static void main(String [] args){
        I1.def();
        I2.def();
    }
}