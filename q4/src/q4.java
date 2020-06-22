import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        System.out.print("Введенное число ");
        if (palindrome(number))
            System.out.println("является полиндромом");
        else
            System.out.println("не является полиндромом");

    }
    public static boolean palindrome(int x){
        int y = 0,temp = x;
        for(; temp>0; temp = temp / 10) {
            y *= 10;
            y += temp % 10;
        }
        if (x==y)
            return true;
        else
            return false;

    }
}
