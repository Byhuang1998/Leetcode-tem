import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt(); int M = sc.nextInt();
    	sc.close();
        int res = 0;
        for (int i = N; i <= M; ++i) {
            if (isP(getN(i)) && isP(i)) {
                res++;
            }
        }
        System.out.println(res);
    }

    public static boolean isP(int num){
        if(num == 2) return true;//2���⴦��
        if(num % 2 == 0 || num < 2 ) return false;//ʶ��С��2������ż��
        int c = (int)Math.sqrt(num);
        for(int i=3; i<=c; i+=2){
            if(num % i == 0){//ʶ����������
                return false;
            }
        }
        return true;
    }
    public static int getN(int n) {
    	int b = String.valueOf(n).length();
    	int c = (int)Math.pow(10, b -1);
    	return n % c / 10;
        
    }
}