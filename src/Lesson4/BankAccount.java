
package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;
    
    
}
   
    class BankAccountTest{
        
        public static void main(String[] args){
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        
        MyAccount.id = 1;
        MyAccount.name = "Polina";
        MyAccount.balance = 12.35;
        
        YourAccount.id = 2;
        YourAccount.name = "Mikky";
        YourAccount.balance = 0.01;
        
        HisAccount.id = 3;
        HisAccount.name = "Vasy";
        HisAccount.balance = 1122675.086;
        
        System.out.println(YourAccount.name);
        
        }
    }
