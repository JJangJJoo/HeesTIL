package Level4;

import java.util.Arrays; //�׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.

public class BestSet {

    public int[] bestSet(int n, int s){
		int[] answer = null;
		int nmg = s % n;
		
		if(s / n > 0){
			answer = new int[n];
			
			for(int i = 0; i < answer.length; i++){
				answer[i] = s / n;
			}
			
			while(nmg != 0){
				Arrays.sort(answer);
				answer[0] += 1;
				nmg--;
			}
		}
		else {
			answer = new int[n];
			answer[0] = -1;
		}
		Arrays.sort(answer);
		
		return answer;
	}
		
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}
