import java.util.Arrays;

public class practice1103 {

    public int[] distributeCandies(int candies, int num_people) {
    	int[] res = new int[num_people];
    	int i=1;
    	while (candies!=0) {
    		int next = Math.min(candies, i);
    		res[(i-1)%num_people] += next;
    		i++;
    		candies -= next;
    	}
    	return res;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1103 p = new practice1103();
		int candies = 10;
		int num_people = 3;
		System.out.println(Arrays.toString(p.distributeCandies(candies, num_people)));
		
	}
}
