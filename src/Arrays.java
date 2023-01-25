import java.sql.Array;

public class Arrays {
    public static void main(String[] args) {
        int[]nums={23,535,43,3,432,4,2};
        java.util.Arrays.sort(nums);
        for (int i = 0; i < nums.length-6; i++) {
            System.out.println(nums[i]);
        }
    }
}
