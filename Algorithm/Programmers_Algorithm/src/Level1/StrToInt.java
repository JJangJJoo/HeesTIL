package Level1;

//��Ʈ���� ���ڷ� �ٲٱ� Level 1
public class StrToInt {
    public int getStrToInt(String str) {
			int num ;
			num = Integer.parseInt(str);
		
			return num;
    }
    //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
