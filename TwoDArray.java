import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        // Input in 2 d array

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3;j++) {
                a[i][j] = sc.nextInt();
            }
        }


        // Sum 

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3;j++) {
                sum = sum+a[i][j];
            }
        }
        
        System.out.println("Row sum");
        System.out.println("total sum"+sum);
     
        for (int i = 0; i<a.length; i++) {
            int sumrow = 0;
            for (int j = 0; j < a[i].length;j++) {
                sumrow = sumrow + a[i][j];
            }
            System.out.println(i+" Row value is" + sumrow);
        }
    }
}
