 public class MoreArray {
    //����žſھ���
	public static void main(String[] args) {
        int[][] a;//������ά��������
        a = new int[9][9];//Ϊ��ά�������ռ�
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i >= j) {
					a[i][j] = (i+1)*(j+1);//��ʼ������Ԫ��
					System.out.print((i+1) + "*"  + (j+1)
					+ "=" + a[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}

 