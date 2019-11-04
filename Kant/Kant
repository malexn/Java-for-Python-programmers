// import java.io.File;
// import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.Math.min;

public class Kant {

    public static void main(String[] args) {

        //File file = new File("/Users/alexander/Documents/JavaP/Kant/kth.javap.kant/kant.2.in");
        //Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int row, column;

        try {
            row = sc.nextInt();
            column = sc.nextInt();
        }
        finally {
            if(sc != null) {
                sc.close();
            }
        }

        String[][] matrix = new String[row][column];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {

                if (i == 0 || i == row - 1 || j == 0 || j == column - 1) {
                    matrix[i][j] = Integer.toString(1);
                }
                else {
                    //top=i+1, bottom=row-i, left=j+1, right=column-j
                    //Math.min (int a, int b), returnerar det mindre värdet.
                    int minD = min(min(i+1,row-i), min(j+1, column-j));

                    if(minD > 9){
                        matrix[i][j] = ".";
                    } 
                    else {
                        matrix[i][j] = Integer.toString(minD);
                    }
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
