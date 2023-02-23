package chapter01_稀疏数组和队列.稀疏数组;

/**
 * @author pengjiacheng
 * @create 2022-03-23 20:37
 * @description: 二维数组与稀疏数组的转换
 */
public class SparseArray {
    public static void main(String[] args) {
        //创建原始的二维数组
        // 0：表示没有棋子，1表示黑子，2表示篮子
        int[][] array1 = new int[11][11];
        array1[1][2] = 2;
        array1[2][3] = 1;

        System.out.println("原始的二维数组数：");
        for (int[] row : array1) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

//二维数组转稀疏数组
        //1. 遍历原始的二维数组，得到有效数据的个数 sum
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if (array1[i][j] != 0){
                    sum++;
                }
            }
        }

        //2. 根据sum就可以创建稀疏数组 sparseArr int[sum + 1][3]
        int[][] sparseArr = new int[sum + 1][3];

        sparseArr[0][0] = array1.length;
        sparseArr[0][1] = array1[0].length;
        sparseArr[0][2] = sum;

        //3. 将二维数组的有效数据数据存入到稀疏数组
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                if (array1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = array1[i][j];
                }
            }
        }

        //4. 稀疏数组输出
        System.out.println("转换得到的稀疏数组是：");
        for (int i = 0; i < sparseArr.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d\t",sparseArr[i][j]);
            }
            System.out.println();
        }

//稀疏数组转二维数组
        //1. 先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组
        int[][] array2 = new int[sparseArr[0][0]][sparseArr[0][1]];

        //2. 在读取稀疏数组后几行的数据，并赋给原始的二维数组即可.
        for (int i = 1; i < sparseArr.length; i++) {
            array2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        // 3.输出恢复后的二维数组
        System.out.println("恢复的二维数组是：");
        for (int[] row : array2) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
