public class q11 {
    public static void main(String[] args){
        int a = 15,b=80;
        System.out.println(Random(a,b));
    }
    public static double Random(int a,int b){
        return Math.round(a+Math.random()*(b-a));
    }
}
