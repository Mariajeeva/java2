import java.util.*;
public class simplematrixoperations {
    private int[][] matrix;
    private int row;
    private int col;
    private int sum;


    public simplematrixoperations(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
    }

    public void inputMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public void displaydiagonalelements() {
        System.out.println("the diagonal elements of the matrix are:");
        for (int i = 0; i < row; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    public void sumofelements() {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Sum of the diagonal elements are: " + sum);
    }

    public void matrixtranspose() {
        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows of the matrix");
        int row = input.nextInt();
        System.out.println("Enter the columns of the matrix");
        int col = input.nextInt();
        simplematrixoperations matrixoperatons = new simplematrixoperations(row, col);
        if (row != col) {
            System.out.println("The matrix has to be a square matrix");
        } else {
            matrixoperatons.inputMatrix();
            matrixoperatons.displaydiagonalelements();
            matrixoperatons.sumofelements();
            matrixoperatons.matrixtranspose();
        }
    }
}

