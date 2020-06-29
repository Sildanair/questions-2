public class Q15 {
    public static void main(String[]args){
        double a =3,b=-13,c=14;
        double D = b*b-4*a*c;
        System.out.println("D="+D);
        if (D>0){
            System.out.println("Уравнение имеет 2 корня");
            System.out.println("x1="+(-b+Math.sqrt(D))/(2*a));
            System.out.println("x2="+(-b-Math.sqrt(D))/(2*a));
        }
        else{
            if (D==0){
                System.out.println("Уравнение имеет 1 корень");
                System.out.println("x="+-(b/(2*a)));
            }
            else{
                System.out.println("Корней нет");
            }
        }
    }
}
