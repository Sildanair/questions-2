import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int n = in.nextInt();
        System.out.println("Сумма цифр числа = "+Summ(n));
    }
    public static int Summ(int x){
        int S = 0;
        for (;x>0; x = x/10)
        S+= x%10;
        return S;
    }
}