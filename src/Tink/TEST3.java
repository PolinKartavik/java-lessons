
package Tink;
import java.util.Scanner;


public class TEST3 {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    long num = in.nextLong();
    int k = 0;
    while(num % 10 == 0){
        num = num/10;
        k++;
    }
    System.out.println(k);
    }
}
