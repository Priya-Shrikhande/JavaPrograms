//Create an array of integers and initialize it with some values.
//i)Calculate the sum and average of the array elements.
//ii)Find the maximum and minimum values in the array.
//iii)Print the results.
package Assignment_1;

public class Question10 {
    public static void main(String[] args) {
         int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i=1;i<=nums.length;i++) {
            sum += i;
        }

        double average = (double) sum / nums.length;
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
