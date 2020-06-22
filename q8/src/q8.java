import java.util.Scanner;
public class q8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int n = in.nextInt();
        boolean prime = false;
        if (n>1) {
            prime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        System.out.print("Введенное число ");
        if (prime)
            System.out.println("простое");
        else
            System.out.println("составное");
    }
}
