import java.util.ArrayList;
public class practice1248 {
	    public boolean isOdd(int n) {
	        return ! (n % 2 == 0);
	    }
	    public int getFirst(int[] nums, int len, int k) {
	        int i = 0;
	        for (; i<len; i++) {
	            if (isOdd(nums[i])) {
	                 return i;
	            }
	        }
	        return -1;
	    }

	    public int getPos(int[] nums, int len, int k) {
	        int sum = 0;
	        int i = 0;
	        for (; i<len; i++) {
	            if (isOdd(nums[i])) {
	                sum ++;
	                if (sum == k) return i;
	            }
	        }
	        return -1;
	    }
	    public int numberOfSubarrays(int[] nums, int k) {
	        int len = nums.length;
	        ArrayList<Integer> list = new ArrayList<>();
	        for (int i=0; i<len; i++) {
	            if (isOdd(nums[i])) list.add(i);
	        }
	        int n = list.size();
	        int p1 = getFirst(nums, len, k);
	        int p2 = getPos(nums, len, k);
	        if (p2 == -1) return 0;
	        if (p2 == list.get(n-1)) return (p1+1) * (len-p2);
	        int count = p1 + 1;
	        while (p2 < len-1) {
	        	p2 ++;
	        	// 如果是奇数
	        	if (isOdd(nums[p2])) {
	        		while (true) {
	        			p1 ++;
	        			if (isOdd(nums[p1])) {
	        				count++;
	        				break;
	        			}
	        			else {
	        				count++;
	        			}
	        		}
	        	}
	        	// 如果是偶数
	        	else {
	        		count ++;
	        		p2 ++;
	        	}
	 
	        }
	        return count + len -1 -p2;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1248 p = new practice1248();
		//int[] nums = {2044,96397,50143};
		//int[] nums = {2,2,2,1,2,2,1,2,2,2};
		int[] nums = {45627,50891,94884,11286,35337,46414,62029,20247,72789,89158,54203,79628,25920,16832,47469,80909};
		System.out.println(p.numberOfSubarrays(nums, 1));
	}

}
