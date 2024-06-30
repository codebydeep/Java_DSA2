package Recursion.Ques;

public class Leetcode1572 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int sum = diagonalSum(matrix);
        System.out.println(sum);
    }
    static int diagonalSum(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j+2 || j==i+2){
                    sum = 0;
                }
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
