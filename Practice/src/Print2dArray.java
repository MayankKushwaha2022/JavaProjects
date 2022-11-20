import java.util.Scanner;

public class Print2dArray {

    public static void main(String[] args) {

        //1
        int row, col;

        //2
        int arr[][];

        //3
        Scanner scanner = new Scanner(System.in);

        //4
        System.out.print("Enter the total number of row : ");

        //5
        row = scanner.nextInt();

        //6
        System.out.print("Enter the total number of column : ");
        col = scanner.nextInt();

        //7
        arr = new int[row][col];

        //8
        for (int i = 0; i < row; i++) {
            //9
            for (int j = 0; j < col; j++) {
                //10
                System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
                arr[i][j] = scanner.nextInt();
            }
        }

        //11
        System.out.println("You have entered the following array : ");

        //12
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}