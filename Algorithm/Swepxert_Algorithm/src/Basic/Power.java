package Basic;

import java.util.Scanner;

//[S/W �����ذ� �⺻] 4���� - �ŵ� ����
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase = 10;
		
		for(int t = 1; t <= testCase; t++){
			int result = 1;
			
			sc.next();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			for(int i = 1; i <= M; i++){
				result *= N;
			}
			System.out.println("#" + t + " " + result);
		}
	}

}
