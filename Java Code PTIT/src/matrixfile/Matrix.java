package matrixfile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Matrix {
    private int n,m,idx;
    private int[][] matrix;
    private List<Integer> list;

    public Matrix(List<Integer> list,int n, int m,int idx) {
        this.list=list;
        this.n = n;
        this.m = m;
        this.idx = idx;
        this.matrix = solveMatrix();
    }

    public int[][] solveMatrix(){
        int index=0;
        int[][] res=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=list.get(index++);
            }
        }
        return res;
    }

    public void sortColumn() {
        List<Integer> columnValues = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            columnValues.add(matrix[i][idx]);
        }
        Collections.sort(columnValues);
        for (int i = 0; i < n; i++) {
            matrix[i][idx] = columnValues.get(i);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res.append(matrix[i][j]).append(" ");
            }
            res.append("\n");
        }
        return res.toString();
    }

}
