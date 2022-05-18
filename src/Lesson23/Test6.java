
package Lesson23;

public class Test6 {
    
}
class Animall{
     String showName(){
        return "some Animal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of animal: " + showName());
    }  
}
class Mousee extends Animall{
     String showName(){
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of mouse: "+ showName());
    }
    public static void main(String [] args){
        Mousee a = new Mousee();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}