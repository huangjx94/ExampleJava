 public class MoreArray {
    //输出九九口诀表
	public static void main(String[] args) {
        int[][] a;//声明二维整型数组
        a = new int[9][9];//为二维数组分配空间
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i >= j) {
					a[i][j] = (i+1)*(j+1);//初始化数组元素
					System.out.print((i+1) + "*"  + (j+1)
					+ "=" + a[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}

 