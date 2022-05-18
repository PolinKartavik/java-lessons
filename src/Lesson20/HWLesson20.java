
package Lesson20;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
//import java.util.*;

public class HWLesson20 {
    public static void abc(String ... s){
        ArrayList<String> people = new ArrayList<String>();
        for (String x : s){
            people.add(x);
        }
        System.out.println("Arraylist is unsort:");
        for(String uns : people){
            System.out.print(uns + ' ');
        }
        Collections.sort(people);
        System.out.println("Arraylist is sort:");
        for(String st : people){
            System.out.print(st + ' ');
        }
    }
    public static void main(String [] args){
        String st = "Brivet";
        String st1 = "Aoka";
        String st2 = "Puliton";
        String st3 = "Tron";
        abc(st, st1, st2, st3);
    }
}
