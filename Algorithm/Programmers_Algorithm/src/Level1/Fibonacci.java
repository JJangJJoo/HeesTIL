package Level1;

// �Ǻ���ġ �� Level 1
public class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		
		if(num == 0)
			answer = 0;
		else if(num == 1)
			answer = 1;
		else
			answer = fibonacci(num - 1) + fibonacci(num - 2 );
		return answer;
	}

  // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}