package matran;

import java.util.Scanner;

public class Matrix {
    private int row, col;
    private int[][] matrix;
    public Matrix(Scanner sc, int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                this.matrix[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix() {
    }

    public Matrix mul(Matrix x){
        Matrix res = new Matrix();
        res.row = this.row;
        res.col = x.col;
        res.matrix = new int[res.row][res.col];
        for (int i = 0; i < res.row; i++) {
            for (int j = 0; j < res.col; j++) {
                res.matrix[i][j] = 0;
                for (int k = 0; k < this.col; k++) {
                    res.matrix[i][j] += this.matrix[i][k] * x.matrix[k][j];
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res="";
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res+=matrix[i][j]+" ";
            }
            res+="\n";
        }
        return res;
    }
}
