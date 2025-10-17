public class Laba2 {

    public static void main(String[] args) 
    {
        int levels = 6; // кількість рівнів ялинки                              !!!!!!!
        Tree(levels);

        System.out.println();

        int rows = 3;
        int cols = 4;
        Array(rows, cols);
    }

    //ялинка
    public static void Tree(int levels) 
    {
        for (int i = 1; i <= levels; i++) 
        {
            for (int j = 0; j < levels - i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //масив
    public static void Array(int rows, int cols) 
    {
        int[][] array = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                array[i][j] = value;
                value += 3;
            }
        }

        System.out.println("Двовимiрний масив:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
