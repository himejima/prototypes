package chap1;

class Ex6
{
    private static final String STR_SPACE = " ";

    public static void main(String[] args)
    {
        Integer num = 4;
        String[][] matrix = new String[num][num];

        System.out.println("init data");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = String.valueOf(i * num + (j + 1));
            }
        }
        display(matrix, num);

        String[][] result = rotate(matrix, num);
        display(result, num);
    }

    public static String[][] rotate(String[][] matrix, Integer num)
    {
        String[][] result = new String[num][num];
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                result[col][num - row - 1] = matrix[row][col];
            }
        }

        return result;
    }

    public static void display(String[][] matrix, Integer num)
    {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
