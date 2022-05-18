
package Lesson8;


public class HWLesson82 {
    public static final double p = 3.14;
    
    public double ploshad(double radios){
        double pl = p*radios*radios;
        return(pl);
    }
    public static double dlina(double radius){
    double dl = 2*p*radius;
    return(dl);
    }
    public void Info(double radous){
    System.out.println("Radius " + radous);
    System.out.println("Plowad " + ploshad(radous));
    System.out.println("Dlina okruj " + dlina(radous));
    }
    
}
class Info2{
    public static void main(String[] args){
        HWLesson82 h = new HWLesson82();
        h.ploshad(4.7);
        HWLesson82.dlina(5.6);
        h.Info(9);
       
    }
}
