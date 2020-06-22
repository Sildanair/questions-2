import java.util.Scanner;
public class q13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("");
        int n = in.nextInt();
        double[] array = new double[n];
        for (int i = 0; i<n; i++){
            array[i]= Math.round(Math.random()*100);
        }
        for(int variant = 0; variant!=3;){
            System.out.println("1. Вывести массив \n2. Увеличить элемент массива на 10% \n3. Выход ");
            variant = in.nextInt();
            switch (variant) {
                case 1:
                    for (int i = 0; i<n; i++){
                        System.out.print(array[i]+"  ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Введите номер элемента массива, который необходимо увеличить");
                    int index = in.nextInt();
                    array[index]*=1.1;
                    break;
            }
        }
    }
}
