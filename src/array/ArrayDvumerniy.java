package array;

import java.util.Arrays;

public class ArrayDvumerniy {
    public static void main(String[] args) {
        int num[][] = new int[2][3];
        //[[10, 15, 16], [17, 18, 19]]
        num[0][0] = 10;
        num[0][1] = 15;
        num[0][2] = 16;
        num[1][0] = 17;
        num[1][1] = 18;
        num[1][2] = 19;
        System.out.println(Arrays.deepToString(num));
        for(int i=0;i<2;i++){
            for(int j=0; j<3;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        int num2 [][]=new int[][]{{56,57,58},{59,45,67}} ;
        System.out.println(Arrays.deepToString(num2));
        for (int i=0; i<2; i++){
            for(int j=0; j<3;j++){
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }

        int num3 [][] = new int[][] {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
        System.out.println(Arrays.deepToString(num3));




    }
}
