
package Tink;
import java.util.Scanner;

    

public class TEST2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String A_B = in.next();
        String A_C = in.next();
        String B_C = in.next();

        switch (A_B){
            case (">"):
                switch (A_C){
                    case (">"):
                        if(B_C.equals(">")){
                            System.out.println("cba");
                            break;
                        }
                        else if (B_C.equals("<")){
                            System.out.println("bca");
                            break;
                        }
                        else {
                            System.out.println("bca");
                            System.out.println("cba");
                            break;
                        }
                    case ("<"):
                        System.out.println("bac");
                        break;
                    case ("="):
                        System.out.println("bca");
                        System.out.println("bac");
                        break;
                }
                break;
            case ("<"):
                switch (A_C){
                    case (">"):
                        System.out.println("cab");
                        break;
                    case ("<"):
                        if(B_C.equals(">")){
                            System.out.println("acb");
                            break;
                        }
                        else if (B_C.equals("<")){
                            System.out.println("abc");
                            break;
                        }
                        else {
                            System.out.println("abc");
                            System.out.println("acb");
                            break;
                        }
                    case ("="):
                        System.out.println("cab");
                        System.out.println("acb");
                        break;
                }
                break;
            case("="):
                switch (A_C){
                    case (">"):
                        System.out.println("cab");
                        System.out.println("cba");
                        break;
                    case ("<"):
                        System.out.println("bac");
                        System.out.println("abc");
                        break;
                    case ("="):
                        System.out.println("abc");
                        System.out.println("acb");
                        System.out.println("bac");
                        System.out.println("bca");
                        System.out.println("cab");
                        System.out.println("cba");
                        break;
                }
                break;
            }
        }
}
