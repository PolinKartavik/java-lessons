
package Lesson20;
import java.util.ArrayList;
import java.util.List;


public class Test10 {
    public static void main(String [] args){
        ArrayList <String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");
        for (Object o: all){
            System.out.println("Number = " + o + " and length = " + ((String)o).length());
        }
    }
    
}
