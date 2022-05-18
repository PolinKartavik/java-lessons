
package Lesson22.p1;

import Lesson22.Chelovek;
public class Test1 {
    public static void main(){
        Chelovek c = new Chelovek("male");
        //c.setName("Koly");
        c.setVes(50);
        c.setAge(25);
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getVes());
    }
}
