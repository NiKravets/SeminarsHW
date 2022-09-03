public class HW3 {

    static int ferzCount = 8;
    static int[] arrayFerz = new int[ferzCount];
    static int size = ferzCount;


    public static void main(String args[]) {
        chessBoard(0, size);
    }

    public static boolean checkFerz(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (arrayFerz[i] == col || arrayFerz[i] == col + (row - i) || arrayFerz[i] == col+ (i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void putFerz(int[] arrayFerz) {
        for (int i = 0; i < arrayFerz.length; i++) {
            for (int j = 0; j < arrayFerz.length; j++) {
                if (arrayFerz[i] == j) {
                    System.out.print("F ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void chessBoard(int row, int size) {
        for (int col = 0; col < size; col++) {
            if (checkFerz(row, col)) {
                arrayFerz[row] = col;
                if (row == size - 1) {
                    putFerz(arrayFerz);
                } else {
                    chessBoard(row+1, size);
                }
            }
        }
    }
}
