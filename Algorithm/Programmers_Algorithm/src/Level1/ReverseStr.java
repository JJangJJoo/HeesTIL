package Level1;

import java.util.Arrays;

//Level1. ���ڿ� ������������ ��ġ�ϱ�
public class ReverseStr {
	public String reverseStr(String str){
		char[] reverse = str.toCharArray();
		
		Arrays.sort(reverse);
		
		StringBuilder result = new StringBuilder(new String(reverse));
		return result.reverse().toString();
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}
