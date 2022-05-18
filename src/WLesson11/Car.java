
package WLesson11;


public class Car {
    String color;
    String engine;
    public static int doorcount;
    public Car(String color, String engine, int doorcount){
    this.color = color;
    this.engine = engine;
    this.doorcount = doorcount;
    }
    
}
class carTest{
    void ChangeDoor(Car c, int door){
    c.doorcount = door;
    }
    
void changeColor(Car c1, Car c2){
    String color = c1.color;
    c1.color = c2.color;
    c2.color = color;
    


}
public static void main(String[] args){
    carTest ct1 = new carTest();
    Car c1 = new Car("yellow", "V6", 4);
    Car c2 = new Car("red", "V7", 2);
    ct1.ChangeDoor(c1, 5);
    ct1.changeColor(c1, c2);
    System.out.println("Info about the first car: " + c1.color + " " + c1.engine + " " + c1.doorcount);
    System.out.println("Info about the second car: " + c2.color + " " + c2.engine + " " + c2.doorcount);

}
}