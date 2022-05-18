
package Lesson24;


public class Test2 {
    public static void main(String [] args){
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }
    
}
abstract class Figura{
    
    int kolichestvoStoron = 0;
    abstract void perimentr();
    abstract void ploshad();
    void showInfo(){
    }
}
class Kvadrat extends Figura{
    
    int storona1 = 10;
    public void perimentr(){
        System.out.println("Periment kvadrata = "+ 4*storona1); 
    }
    public void ploshad(){
        System.out.println("Ploshad kvadrata = "+ storona1*storona1);
    }
}

class Prymougolnik extends Figura{
    
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;
    public void perimentr(){
        System.out.println("Periment prymougolnika = "+ 2*(storona1+storona2)); 
    }
    public void ploshad(){
        System.out.println("Ploshad prymougolnika = "+ storona1*storona1);
    }
}

class Okrujnist extends Figura{
    int kolichestvoStoron = 0;
    int radius = 3;
    public void perimentr(){
        System.out.println("Periment okrujnisri = "+ 2*3.14*radius);
    }
    public void ploshad(){
        System.out.println("Ploshad okrujnosti = "+ 3.14 *radius);
    }
}
abstract class Chetirehugolnik extends Figura{
    void def(){
        System.out.println("is is chetirehugolnik");
    }
}


