import java.util.Scanner;

public class q14 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        char symbol = 'h'; // a=97..z=122
        System.out.print("Попробуйте угадать загаданную букву \n Введите букву \n >");
        char ch = in.next().charAt(0);
        while (ch!=symbol){
            if (ch>symbol){
                System.out.println("You’re too high");
            }
            else{
                System.out.println("You’re too low");
            }
            System.out.print("Введите другую букву\n >");
            ch=in.next().charAt(0);
        }
        System.out.println("Right");
    }
}
