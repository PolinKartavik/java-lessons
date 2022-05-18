
package Lesson6;


public class MetjodOverloading {
    void show(int i1){
    System.out.println(i1);
    System.out.println("Data Type is int");
    }
    
    void show(int a, int b){
    System.out.println(a);
    System.out.println("Data Type is int");
    }
    void show(boolean b1){
    System.out.println(b1);
    System.out.println("Data Type is boolean");
    }
    void show(String s1){
    System.out.println(s1);
    System.out.println("Data Type is String");
    }
    void show(String s, int a){
    System.out.println("String :" + s + "int :" + a);
    }
    void show(int s, String a){
    System.out.println("What's a nice day!!!");
    }
}

class MethodOverloadingTest{
    public static void main(String[] args){
        MetjodOverloading mO = new MetjodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Privet!!!";
        mO.show(s);
        mO.show("Privet", 10);
    }
}
