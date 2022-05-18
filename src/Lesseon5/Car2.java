
package Lesseon5;


public class Car2 {
    String color;
    String engine;
    int speed;
    
    int gaz(int skorost){
    speed+= skorost;
    return speed;
    }
    
    int tormoz(int skorost){
    speed-= skorost;
    return speed;
    }
    
    void showInf(){
    System.out.println("svet: " + color + " motor: " + engine + " skorost: " + speed);
    
    }
}

class Car2Test {
    public static void main(String [] args){
        Car2 c1 = new Car2 ();
        c1.color = "white";
        c1.engine = "v6";
        c1.speed = 60;
        
        c1.showInf();
       c1.gaz(20);
       c1.showInf();
       c1.tormoz(120);
       c1.showInf();


}
}

    

