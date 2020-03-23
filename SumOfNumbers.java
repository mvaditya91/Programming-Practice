import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class SumOfNumbers {

	public static int[] returnLocArray(int[] nums,int target) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
	    for(int i=0;i<nums.length;i++) {
	    	map.put(nums[i], i);
	    }
	    for(int i=0;i<nums.length;i++) {
	    	int complement = target - nums[i];
	    	if(  map.containsKey(complement) && map.get(complement)!=i ) {
	    		return (new int[] {i,map.get(complement)});
	    	}
	    }
	    return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {11, 7, 2, 15};
		Arrays.sort(nums);
        int target = 17;
        int[] locArray  = returnLocArray(nums,target);
        if(locArray==null) System.out.println("No Matching Solution");
        else {
        	System.out.print("Index Locations:"+locArray[0]+" and "+locArray[1]);
        }
	}

}
