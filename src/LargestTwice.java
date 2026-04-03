import java.util.Scanner;



public class LargestTwice {
    
        // TODO: Read n
        // TODO: Read array elements
        // TODO: Find the largest element and its index
        // TODO: Check if largest >= 2 * every other element
        // TODO: Print index or -1
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        
        boolean isValid = true;
        for (int i = 0; i < n; i++) {
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                isValid = false;
                break;
            }
        }
        
        if (isValid) {
            System.out.println(maxIndex);
        } else {
            System.out.println("-1");
        }
        
        sc.close();
    }
    
}
