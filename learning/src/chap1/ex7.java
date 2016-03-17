package chap1;

class Ex7
{
    private static final Integer ROW = 5;
    private static final Integer COL = 4;

    public static void main(String[] args)
    {
        String[][] matrix = new String[ROW][COL];

        System.out.println("init data");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (i == 3 && j == 2) {
                    matrix[i][j] = "0";
                } else {
                    matrix[i][j] = String.valueOf(i * COL + (j + 1));
                }
            }
        }
        display(matrix);

        String[][] result = zeroBatch(matrix);
        display(result);
    }

    public static String[][] zeroBatch(String[][] matrix)
    {
        Integer row = matrix.length;
        Integer col = matrix[0].length;
        String[][] result = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j].equals(String.valueOf(0))) {
                    for (int n = 0; n < col; n++) {
                        result[i][n] = "0";
                    }
                    for (int m = 0; m < row; m++) {
                        result[m][j] = "0";
                    }
                } else {
                    if (result[i][j] == null) {
                        result[i][j] = matrix[i][j];
                    }
                }
            }
        }

        return result;
    }

    public static void display(String[][] matrix)
    {
        Integer row = matrix.length;
        Integer col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
