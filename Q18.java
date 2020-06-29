import java.util.Scanner;

public class Q18 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длины трех сторон треугольника");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int temp;
        if (b>c){
            temp = c;
            c = b;
            b = temp;
        }
        else{
            if (a>c) {
                temp = c;
                c = a;
                a = temp;
            }
        }
        if (c<(a+b)){
            if (c*c==a*a+b*b){
                System.out.println("Треугольник прямоугольный");
            }
            else {
                if (c*c>a*a+b*b){
                    System.out.println("Треугольник тупоугольный");
                }
                else {
                    System.out.println("Треугольник остроугольный");
                }
            }
        }
        else {
            System.out.println("Треугольник не существует");
        }
    }
}
