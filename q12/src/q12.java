public class q12 {
    public static void main(String[] args){
        String s = "Kitten goes for a walk to the park";
        int n = 10;
        if (n<=s.length()-1) {
            String b = s.substring(0, n) + s.substring(n + 1);
            System.out.println(b);
        }
        else{
            System.out.println(s);
        }
    }
}
