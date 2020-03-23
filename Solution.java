import java.util.Arrays;
import java.util.Collections;
class Solution {
    public static int findMinValueIndex(int minValue,int[] nums) {
        int jLoc=0;
        for(int j=0;j<nums.length;j++) {
            if(nums[j] == minValue){
            	jLoc = j;
            }
        }
        return jLoc;
    }
    
    public static int findReqIndex(int findValue,int[] nums) {
    	int returnValue=0;
        for(int k=0;k<nums.length;k++) {
            if(nums[k] == findValue) returnValue =k;
        }
        return returnValue;
    }
    
    public static int[] twoSum(int[] nums, int target) {
    int elements[] = new int[2];
    Integer[] checkArray = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
    int max = Collections.max(Arrays.asList(checkArray));
    System.out.println("Max Value :"+max);
    int minValue=0;
    if(max<target) minValue = target-max;
    System.out.println("Min Value :"+minValue);
    for(int i=0;i<nums.length;i++) {
        if(nums[i] < minValue) { 
            i++;
        } 
        else if(nums[i]>minValue) {
         if( (nums[i]+minValue) == target ) {
             int minPos = findMinValueIndex(minValue,nums);
             elements[0] = minPos;
             elements[1] = i;
         } 
        } else {
            int findValue = target - minValue;
            int reqIndex = findReqIndex(findValue,nums);
            elements[0] = i;
            elements[1] = reqIndex;
        }
    }
     return elements;   
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,4,3,5,6,7,9,8};
        int target = 13;
        int locArray[] = twoSum(nums,target);
        System.out.print(" Index Location of the elements are: "+ locArray[0] +" "+ locArray[1]);
    }
    
}