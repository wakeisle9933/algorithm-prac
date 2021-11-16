package implementation;

import greedy.NumberCardGame;

import java.util.Arrays;

public class ArrayMove {

    /*
     * - 상하좌우 -
     * int[][] 배열의 크기를 결정할 N을 가지고
     * String[] 배열 move를 받아 지시된 대로 이동
     * L 왼쪽 R 오른쪽 U 위로 D 아래로
     * 배열을 넘어서는 크기로는 이동 불가능
     * 이동 후 최종 위치 반환
     * */

    public String Solution(int n, String[] move) {
        String[][] arr = new String[n][n];
        int currentRow = 0;
        int currentCol = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = (i + 1) + ", " + (j + 1);
            }
        }

        for(String m : move) {
            if(m.equals("L")) {
                if(currentCol - 1 >= 0) {
                    currentCol = currentCol - 1;
                }
            } else if(m.equals("R")) {
                if(currentCol + 1 <= n - 1) {
                    currentCol = currentCol + 1;
                }
            } else if(m.equals("U")) {
                if(currentRow - 1 >= 0) {
                    currentRow = currentRow - 1;
                }
            } else if(m.equals("D")) {
                if(currentRow + 1 <= n - 1) {
                    currentRow = currentRow + 1;
                }
            }
        }

        return arr[currentRow][currentCol];
    }

    public static void main(String[] args) {
        ArrayMove arrayMove = new ArrayMove();
        String[] move = {"R", "R", "R", "U", "D", "D"};
        System.out.println(arrayMove.Solution(5, move));
    }

}
