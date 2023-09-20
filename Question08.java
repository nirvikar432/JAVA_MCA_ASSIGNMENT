//Write a program for developing a matrix class which can handle integer matrices of different dimensions. 
// Also overload the operator for addition, multiplication & comparison of matrices.
class Matrix {
    private int row, col;
    private int[][] mat;
    private static int[][] c;
    private static int[][] d;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.mat = new int[row][col];

    }

    public void setData(int val, int row, int col) {
        mat[row][col] = val;
    }

    static void addMat(Matrix a, Matrix b) {
        c = new int[a.row][a.col];

        if (a.row == b.row && a.col == b.col) {
            for (int i = 0; i < a.row; i++) {
                for (int j = 0; j < b.col; j++) {
                    c[i][j] = a.mat[i][j] + b.mat[i][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();// new line
            }
        } else {
            System.out.println("Wrong Dimmension");
        }

    }

    static void compMat(Matrix a, Matrix b) {
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.col; j++) {
                if (a.mat[i][j] != b.mat[i][j]) {
                    System.out.println("Not equal");
                    return;
                }
            }
        }
        System.out.println("Not equal");
        return;
    }

    static void mulMat(Matrix a, Matrix b) {
        if (a.col == b.row) {
            d = new int[a.row][b.col];
            for (int i = 0; i < a.row; i++) {
                for (int j = 0; j < b.col; j++) {
                    d[i][j] = 0;
                    for (int k = 0; k < b.row; k++) {
                        d[i][j] += a.mat[i][k] * b.mat[k][j];
                    }
                    System.out.print(d[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Wrong Dimmension");
        }
    }

}

public class Question08 {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(3, 2);
        Matrix m2 = new Matrix(2, 3);

        m1.setData(1, 0, 0); // 3X2
        m1.setData(2, 0, 1);
        m1.setData(3, 1, 0);
        m1.setData(4, 1, 1);
        m1.setData(5, 2, 0);
        m1.setData(6, 2, 1);

        m2.setData(5, 0, 0); // 2X3
        m2.setData(6, 0, 1);
        m2.setData(7, 0, 2);
        m2.setData(8, 1, 0);
        m2.setData(9, 1, 1);
        m2.setData(1, 1, 2);

        System.out.println("Matrix Addition");
        Matrix.addMat(m1, m2);
        System.out.println("Matrix Multiplication");
        Matrix.mulMat(m1, m2);
        System.out.println("Matrix Comparision");
        Matrix.compMat(m1, m2);
    }
}

/*
 * Matrix Addition
 * Wrong Dimmension
 * Matrix Multiplication
 * 21 24 9
 * 47 54 25
 * 73 84 41
 * Matrix Comparision
 * Not equal
 */