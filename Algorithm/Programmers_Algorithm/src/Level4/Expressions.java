package Level4;

public class Expressions {

	public int expressions(int num) {
		
		int answer = 0;
		int test = 0;
		
		for(int i = 1; i <=num; i++){
			
			for(int j = i; j<=num; j++){
				test += j;
				
				if(test == num){
					answer++;
				}
				else if(test > num){
					test = 0;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(expressions.expressions(15));
	}
}
