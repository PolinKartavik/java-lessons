
package Lesseon5;


public class Car {
    Car(String cvet, String motor){
    color = cvet;
    engine = motor;
    System.out.println("Цвет мaшины: "+ color+ "  мотор машины:" + engine);
    }
    String color;
    String engine;
}

class Car1Test{
    public static void main (String[] args){
    Car car1  = new Car("black", "v6");
    Car car2 = new Car("white", "V8");

}

}