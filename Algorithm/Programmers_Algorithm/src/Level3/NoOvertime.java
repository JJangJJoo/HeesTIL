package Level3;

import java.util.Arrays;

public class NoOvertime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		// �߱� ������ �ּ�ȭ �Ͽ��� ���� �߱� ������ ���ϱ��?
		
		for(int i = 0 ; i < no; i++){
			Arrays.sort(works);
			works[works.length-1]--;
		}
		
		for(int i = 0; i < works.length; i++){
			result += Math.pow(works[i], 2);
		}
		
		return result;
	}
	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int []test = {4,3,3};
		System.out.println(c.noOvertime(4,test));
	}
}
