package Level1;

// ������ �������� ���� �迭 Level 1
import java.util.Arrays;

public class Divisible {
	public int[] divisible(int[] array, int divisor) {
		int cnt = 0;
		int n = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] % divisor == 0){
				cnt++;
			}
		}
		int[] ret = new int[cnt];
		
		for(int i = 0; i < array.length; i++){
			if(array[i] % divisor == 0){
				ret[n] = array[i];
				n++;
			}
		}
		
		
		
		return ret;
	}
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}
