package assignments;

public class Matrix {
    private int rows;

    private int cols;
    private int[][] matrix;

    public Matrix(int rows, int cols){
        this. rows =rows;
        this.cols=cols;
        this.matrix = new int[rows][cols];
    }
    public void fillMatrix(int[][] values){
        if(values.length != rows || values[0].length !=cols){
            System.out.println("Error:Invalid dimensions of input values!");
            return;
        }
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = values[i][j];

            }
        }
    }
    public void printMatrix(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] values ={{1,2,3},{4,5,6},{7,8,9}};
        Matrix matrixObj = new Matrix(3,3);
        matrixObj.fillMatrix(values);
        matrixObj.printMatrix();
    }
    
}
