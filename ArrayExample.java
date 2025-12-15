import java.util.HashSet;

public class ArrayExample {
    public static void main(String[] args) {
HashSet<Integer> set = new HashSet<>();
set.add(10);
set.add(20);
set.add(30);

Integer[] arr = set.toArray(new Integer[0]);
System.out.println(arr.toString());
    }
}
