
package Lesson20;
import java.util.Map;
import java.util.HashMap;


public class Test11 {
    public static void main(String [] args){
        Map <Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mikhaul");
        map.put(778, "Ireguv Yaur");
        map.put(779, "Sidorova Mafis");
        map.put(780, "Petrov Petr");
        map.put(779, "roberto Carlos");
        map.remove(779);
        System.out.println("map = " + map);
    }
    
}
