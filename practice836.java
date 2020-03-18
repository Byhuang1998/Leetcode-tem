
public class practice836 {

	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		return !(rec1[2]<=rec2[0]||rec1[0]>=rec2[2]||rec1[1]>=rec2[3]||rec1[3]<=rec2[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice836 p = new practice836();
		int[] rec1 = {-687153884,-854669644,-368882013,-788694078};
		int[] rec2 = {540420176,-909203694,655002739,-577226067};
		boolean b = p.isRectangleOverlap(rec1, rec2);
		System.out.println(b);
	}

}
