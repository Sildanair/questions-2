import java.util.Scanner;

public class q7 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n+": ");
        for (int i = 1; i<n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
