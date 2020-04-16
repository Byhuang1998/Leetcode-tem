import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); 
		int b = in.nextInt();
		int m = in.nextInt();
		int x = in.nextInt();
		in.close();
		int circle = 0;
		int first = (a * x + b) % m;
		while (true) {
			x = (a * x + b) % m;
			list.add(x);
			if (x == first && list.size() > 1) {
				circle = list.size() - 1;
				for (int i=1; i<circle; i++) {
					x = (a * x + b) % m;
					if (x != list.get(i+1)) {
						break;
					}
				}
				break;
			}
		}
		System.out.println(circle);
	}
}
