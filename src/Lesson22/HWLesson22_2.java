
package Lesson22;


public class HWLesson22_2 {
    public static void main(String [] args){
    Pet p = new Pet();
    System.out.println(p.paw);
    Cat c = new Cat("Lupa");
    c.sleep();
    }
    
}

class Animal{
    public Animal(){
        System.out.println("I am an animal");
    }
    public int eyes;
    public void eat(){
        System.out.println("Animal eats");
    }
    public void drink(){
        System.out.println("Animal drinks");
    }
    
}

class Pet extends Animal{
    public Pet(){
        System.out.println("I am a pet");
        eyes = 2;
    }

        String name;
        int tail = 1;
        int paw = 4;
        
        void run(){
            System.out.println("Pet runs");
        }
        void jump(){
            System.out.println("Pet jumps");
        }
    
}

class Dog extends Pet{
    public Dog(String name){
        System.out.println("I am a dog and y name is " + name);
    }
    public void play(){
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{
    public Cat(String name1){
        System.out.println("i am a cat and my name is " + name1);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}