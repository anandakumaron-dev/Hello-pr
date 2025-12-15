public class PrimeNum {
    public static void main(String[] args) {
        int n = 4;
        boolean flage = true;
        for (int i = 2; i < n; i++) {
            if(n%i == 0 ){
                flage = false;
                break;
            }
        }

        if(flage == false) System.out.println("Not prime");
        else System.out.println("Prime");
    }
}
