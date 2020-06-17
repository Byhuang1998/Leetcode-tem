import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.close();
        int ans = count(m, n);
        System.out.println(ans);
    }
    
    public static int count(int m, int n) {
        if (n > m / 2) return count(m, m-n);
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
       // boolean[] used1 = new boolean[n];
       // boolean[] used2 = new boolean[n];
        for (int i = 0; i<n; i++) {
        	nums1[i] = m - i;
        	nums2[i] = i + 1;
        }
        relieve(nums1, nums2, n);
        int res = 1;
        for (int i = 0; i<n; i++) {
        	res = (res * (nums1[i] % 3)) % 3;
        }
    	return res;
    }
    public static void relieve(int[] nums1, int[] nums2, int n) {
    	for (int i=0; i<n; i++) {
    		while (nums2[i] > 1) {
    			int j = 0;
    			int min_gcd = gcd(nums1[j], nums2[i]);
    			nums1[j] /= min_gcd;
    			nums2[i] /= min_gcd;
    			j ++;
    		}
    	}
    
    }
    public static int gcd(int m, int n) {
    	if (n > m) return gcd(n, m);
    	if (n == 0) return m;
    	return gcd(n, m%n);
    }
    
}
//this is a txt file.
//this is a txt file.
// this is a txt file
//this is a txt file
