/* 
    The Boyer-Moore Voting Algorithm is a linear time algorithm for finding the majority element in an array that occurs more than ⌊n / 2⌋ times. The basic idea is to cancel out each occurrence of a majority element with occurrences of other elements. The majority element will remain as the final candidate.

Here's the breakdown of the algorithm:

Initialize two variables: candidate and count. Set candidate to the first element in the array and count to 1.

Iterate through the array starting from the second element:

If count becomes 0, update candidate to the current element and set count to 1.
If the current element is the same as the candidate, increment count; otherwise, decrement count.
At the end of the iteration, the candidate variable contains a potential majority element.

You may want to perform an additional check to ensure that the candidate occurs more than ⌊n / 2⌋ times.

Here is the Java code implementing the Boyer-Moore Voting Algorithm:  
*/


public class BoyerMooreVotingAlgorithm {
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        // Additional check to verify that the candidate occurs more than n/2 times
        int occurrenceCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                occurrenceCount++;
            }
        }

        if (occurrenceCount > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        // Find the majority element
        int majorityElement = majorityElement(nums);

        System.out.println("Majority Element: " + majorityElement);
    }
}
}
