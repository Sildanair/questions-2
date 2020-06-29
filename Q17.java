public class Q17 {
    public static void main(String[]args){
        int a = 6, b = 7,indexMax;
        double temp;
        double[][] array = new double[a][b];
        for (int i = 0; i<a;i++) {
            indexMax = 0;
            for (int j = 0; j < b; j++) {
                array[i][j]=Math.floor(Math.random()*10);
                System.out.print(array[i][j] + "  ");
                if (array[i][j]>array[i][indexMax]){
                    indexMax = j;
                }
            }
            temp = array[i][0];
            array[i][0] = array[i][indexMax];
            array[i][indexMax] = temp;
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 0; i<a;i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j] + "  ");
                }
            System.out.println();
        }
    }
}

