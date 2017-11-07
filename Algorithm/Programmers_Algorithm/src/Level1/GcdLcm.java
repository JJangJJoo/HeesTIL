package Level1;

import java.util.Arrays;

//Level1. �ִ������� �ּҰ����
public class GcdLcm {
   public int[] gcdlcm(int a, int b) {
			int[] answer = new int[2];
		
		answer[0] = gcd(a, b);
		answer[1] = lcm(a, b);
		
		return answer;
	}
	
	public int gcd(int a, int b){
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
	
	public int lcm(int a, int b){
		if(gcd(a, b) == 0)
			return 0;
		else
			return gcd(a, b) * b / gcd(a, b);
	}


    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
    	GcdLcm c = new GcdLcm();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
