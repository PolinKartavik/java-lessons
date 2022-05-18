package Lesseon5;

public class HWL5Student{

    int studentid;
    String name;
    String surname;
    int course;
    double math;
    double economic;
    double language;
}

class StudentTest{
    double sredArifOchenk(HWL5Student st){
    double sredOchenka = (st.math + st.economic + st.language)/3;
    System.out.println("SredArfOcheka Studenta" + st.name + " " + st.surname + ": " + sredOchenka);
    return sredOchenka;
    } 
    public static void main(String[] args){
    HWL5Student st1 = new HWL5Student();
    st1.studentid = 1;
    st1.course = 3;
    st1.name = "Mikki";
    st1.surname = "Milkovich";
    st1.math = 4.5;
    st1.economic = 2.1;
    st1.language = 3.9;
     
    StudentTest sTest = new StudentTest();
    sTest.sredArifOchenk(st1);
    
    }
}