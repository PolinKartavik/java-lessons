
package Lesson9;


public class Car {
    int atthhgfdcsdgb=5;
    
    
    
    
    String color;
    public static int ab=10;
    String engine;
    static public int count;
    public Car(String color, String engine){

        count++;
        this.color = color;
        this.engine = engine;
        this.count++;
    }
   /* public void showcolor(){
        System.out.println("Car's color: " + color);
        this.changecolor("red");
    }
    public void changecolor(String color3){
        System.out.println("The color is changed");
        int cena = 0;
        color = color3;
        cena += 1000;
    }*/
    void ChangeColor(String color){
    System.out.println(this.color);
    }
    public static void main(String[] args){
    Car c = new Car("black", "V5");
    System.out.println(c.color);
    c.ChangeColor("red");
    System.out.println(c.color);
    }
   }
