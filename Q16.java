public class Q16 {
    public static void main(String[]args){
        double N=50000,a = 10,count = 0;
        while(a<N) {
            count += N / a;
            a*=10;
        }
        if ((N/a)>=0.2)
            count++;
        System.out.println("Бракованных табличек "+count);
    }
}
