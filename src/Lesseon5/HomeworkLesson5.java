
package Lesseon5;


public class HomeworkLesson5 {
    
}
class BankAccount {
    int id;
    String name;
    double balance= 100;
    
    void popolnenieScheta(double summaPopolneniya){
        System.out.println("Balance do popolneniya: " + balance);
        System.out.println("Summa popolneniya; " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Balance posle popolneniya: " + balance);
    }
    
    void snyatiesoscheta(double summaSnyatiya){
        System.out.println("Balans do snyatiya: " + balance);
        System.out.println("Summa snyatiya: " + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Balance posle snyatiya:" + balance);
    }
}
   
    class BankAccountTest{
        
        public static void main(String[] args){
        BankAccount MyAccount = new BankAccount();
        MyAccount.popolnenieScheta(30.5);
        MyAccount.snyatiesoscheta(80.6);
        
        
        }
    }
