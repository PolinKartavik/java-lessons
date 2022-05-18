
package Lesseon5;


public class Human {
    String name;
    Car3 car;
    BanckAccount ba;
    
    void info(){
    System.out.println("Imya: "+ name+ "  cvet mashini: "+ car.color + " balans Bank chet: "+ ba.balance);
    
    }
}
    
        class HumanTest{
         public static void main(String[] args){
             Human h = new Human();
             h.name = "David";
             h.car = new Car3("red", "v8");
             h.ba = new BanckAccount(18, 200.5);
             h.info();
    
        }
    }
    

class Car3{
Car3(String c, String b){
color = c;
engine = b;
}
String color;
String engine;
}

 class BanckAccount{
     BanckAccount(int id2, double balance2){
     id = id2;
     balance=balance2;
     }
 int id;
 double balance;
 
 }