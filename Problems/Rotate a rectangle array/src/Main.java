import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int[][] turnedArray = new int[m][n];

        for (int i = 0; i < m; i++) {
            int count = array.length - 1;
            for (int j = 0; j < n; j++) {
                turnedArray[i][j] = array[count][i];
                count--;
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(turnedArray[i][j] + " ");

            }
            System.out.println();

        }

    }
}