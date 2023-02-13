/*
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
package web_05_hometask;

public class ex014 {

    static int[] board = {0, 0, 0, 0, 0, 0, 0, 0};
    static int row = 0;
    static int var = 0;

    static boolean check() {
        if (row == 0) {
            return true;
        }

        if (board[row] > 7) {
            board[row] = 0;
            row--;
            return false;
        }

        for (int col = 0; col < row; col++){
            if ((board[row] == board[col]) | ((Math.abs(board[row] - board[col])) == (row - col))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        do {
            if (check()){
                if (row == 7) {
                    System.out.println(var++ + " [0]=" + board[0] + " [1]=" + board[1]
                            + " [2]=" + board[2] + " [3]=" + board[3] + " [4]=" + board[4]
                            + " [5]=" + board[5] + " [6]=" + board[6] + " [7]=" + board[7]);
                    board[row] ++;
                } else {
                    row++;
                }
            } else {
                board[row] ++;
            }
        } while (board[0] < 8);
    }
}
