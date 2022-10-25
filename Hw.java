import java.util.List;
import java.util.TreeMap;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.util.Deque;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;
import javax.xml.crypto.dsig.XMLObject;

import org.omg.DynamicAny.NameDynAnyPairSeqHelper;

import java.util.Map;
import java.util.HashMap;
import java.nio.file.attribute.AclEntryFlag;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class Hw {
    int n, m;
    boolean[][] arr;
    int[] cnt;
    public Hw(int n, int m) {
        this.n = n;
        this.m = m;
        arr = new boolean[n][m];
        cnt = new int[n];
        Arrays.fill(cnt, -1);

    }
    
    public int[] gather(int k, int maxRow) {
        int[] ans = new int[2];
        boolean flag = false;
        for (int i = 0; i <= maxRow; i++) {
            if (m - 1 - cnt[i] >= k) {
                ans[0] = i;
                ans[1] = cnt[i] + 1;
                cnt[i] += k;
                flag = true;
                break;
            }
        }
        if (flag) return ans;
        return new int[0];
    }
    
    public boolean scatter(int k, int maxRow) {
        int sum = 0;
        for (int i = 0; i <= maxRow; i++) {
            sum += m - 1 - cnt[i];
            if (sum >= k) {
                for (int j = 0; j <= maxRow; j++) {
                    if (m - 1 - cnt[j] < k) {
                        k = k - (m - 1 - cnt[j]);
                        cnt[j] = m - 1;
                        continue;
                    } else {
                        cnt[j] += k;
                        k = 0;
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }


	public static void main(String[] args) {
		int[] nums = {1,3,1,2};
		char[][] nums1 = {{'(','(','(','(','('},{'(','(',')',')',')'},{')','(',')',')','('},{'(','(',')',')',')'}};
		char[][] ss = {{')',')'},{'(','('}};
		String t = "AABABBA";
		int target = 0;
		String s = "PAYPALISHIRING";
		Hw hw = new Hw(2, 5);
//		int[] res1 = hw.gather(4, 0);
//		int[] res2 = hw.gather(2, 0);
//		boolean r1 = hw.scatter(5, 1);
//		boolean r2 = hw.scatter(5, 1);
//		System.out.println(Arrays.toString(res1));
//		System.out.println(Arrays.toString(res2));
//		System.out.println(r1);
//		System.out.println(r2);
		String str = "1\"2,3.4:5(6)7{8}9[10]11【12】13$14%15-16+17?18/19=20'21*22^23\\24`25~26<27>28|29#30|31";
        
        /*  
         * 
         *  ( [ { } ] ) / ^  $ ¦ ? * + .  -  java 需要转义的字符

         	 [ ] ( ) { } / ^ $ | ? * + .  \  正则表达式需要转义的字符
         */
        String regex = "\"|,|\\.|:|\\(|\\)|\\{|\\}|\\[|\\]|【|】|\\$|%|-|\\+|\\?|\\/|=|'|\\*|\\^|\\\\|`|~|<|>|\\||#";
		String ans = str.replaceAll(regex, " ");
		System.out.println(ans);
	}

}
