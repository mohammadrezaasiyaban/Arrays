import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num_one = {34, 45, 34, 522, 43};
        int[] num_two = {88, 78, 56, 5, 3, 33};
        int[] plus = new int[num_two.length + num_one.length];
        for (int i = 0; i < num_one.length-i; i++) {
            plus[i] = num_one[i];
        }
        for (int i = 0; i < num_two.length-i; i++) {
            plus[i + num_one.length] = num_two[i];
            System.out.println(Arrays.toString(plus));
        }
    }
}