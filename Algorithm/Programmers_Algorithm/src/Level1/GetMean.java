package Level1;

//Level1. ��ձ��ϱ�
public class GetMean {
    public int getMean(int[] array) {
      int sum = 0;
      
      for (int i : array){
        sum += i;
      }
      return sum / array.length;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��հ� : " + getMean.getMean(x));
    }
}