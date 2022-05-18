
package Lesson22;


public class Chelovek {
    final String pol;
    public Chelovek (String pol){
    this.pol = pol;
    }
    private boolean clever;
    public boolean isClever(){
        return clever;
    }
    
    private StringBuilder name;
    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder s){
        name = s;
    }
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int i){
        if (i>0){
         age = i;
        }
    }
    private int ves;
    public int getVes(){
        return ves;
    }
    public void setVes(int i){
        if (i>0){
            ves = i;
        }
    }
}
class Test{
    public static void main(String[] args){
        Chelovek c = new Chelovek("male");
        c.setName(new StringBuilder("Kolya"));
        c.getName().append("!!!!");
        System.out.println(c.getName());
    }
}