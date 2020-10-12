public class Matrix {

    /**
     * Create a matrix from a String.
     *
     * The string if formatted as follow:
     *  - Each row of the matrix is separated by a newline
     *    character \n
     *  - Each element of the rows are separated by a space
     *
     *  @param s The input String
     *  @return The matrix represented by the String
     */
    public static int[][] buildFrom(String s) {
        String[] splittedString = s.split("\n");
        int array[][] = new int[splittedString.length][];
        int index = 0;
        for(String str: splittedString){
            String[] newString = str.trim().split("\\s");
            int size = newString.length;
            int [] arr = new int [size];
            for(int i = 0; i < size; i++){
                arr[i] = Integer.parseInt(newString[i]);
            }
            array[index] = arr;
            index++;
        }
        return array;

    }

    /**
     * Compute the sum of the element in a matrix
     *
     * @param matrix The input matrix
     * @return The sum of the element in matrix
     */
    public static int sum(int[][] matrix) {
        int  counter = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int x = 0; x < matrix[i].length; x++){
                counter += matrix[i][x];
            }
        }
        return counter;
    }

    /**
     * Compute the transpose of a matrix
     *
     * @param matrix The input matrix
     * @return A new matrix that is the transpose of matrix
     */
    public static int[][] transpose(int[][] matrix) {
        int[][] transpo = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix[0].length; i++){
            for(int x = 0; x < matrix.length; i++){
                transpo[i][x] = matrix[x][i];
            }
        }
        return transpo;
    }

    /**
     * Compute the product of two matrix
     *
     * @param matrix1 A n x m matrix
     * @param matrix2 A m x k matrix
     * @return The n x k matrix product of matrix1 and matrix2
     */
    public static int[][] product(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length;
        int n = matrix2[0].length;
        int[][] matrix3 = new int[m][n];
        for (int row = 0; row < m; row++){
            for(int col = 0; col < matrix3[row].length; col++){
                int val = 0;
                for (int i = 0; i < matrix2.length; i++){
                    val+= matrix1[row][i] * matrix2[i][col];
                }
                matrix3[row][col] = val;
            }
        }
        return matrix3;
    }
}
