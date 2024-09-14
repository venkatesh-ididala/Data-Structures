package Medium;

import java.util.Arrays;

public class setMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr={{1,1,1,1},{1,0,1,1},{1,1,0,1},{1,0,0,1}};
        int n=arr.length;
        int m=arr[0].length;

        System.out.println(Arrays.toString(setZeroes(arr,n,m)));

    }
    public static int[][] setZeroes(int[][] matrix,int n,int m){

        int[] row=new int[n];
        int[] col=new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                        row[i]=1;
                        col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;

                }
            }
        }
        return matrix;
    }

}
