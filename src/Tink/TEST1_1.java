
package Tink;
import java.util.Scanner;




public class TEST1_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        if (b%n == 0){
            if (a > b/n){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        else {
            if (a > (b/n+1)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

