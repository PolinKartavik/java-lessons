
package Lesson20;
import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String [] args){
        ArrayList <String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");
        //System.out.println("all + " + all);
        
        List <String> list = List.of("odin", "dva", "tree");
        System.out.println("List = " + list);
        List <String> list2 = List.copyOf(all);
        System.out.println("List2 = " + list2);
        }
    }
    

