package MaximumGap;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumGapClass {

    public int maxiGap(int[] nums) {

        int maxGap=0;
        if (nums.length<2) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++) {
            maxGap = Math.max(maxGap,nums[i]-nums[i-1]);
        }
        return maxGap;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        MaximumGapClass findGap = new MaximumGapClass();
        System.out.println("The maximum gap is " +findGap.maxiGap(arr));
    }

}
