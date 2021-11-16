package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class NumberCardGame {

    /*
    * - 숫자 카드 게임 -
    * int[][] 타입 배열 arr을 받아
    * 각 행에서 가장 낮은 열 하나를 뽑을 경우
    * 열 값이 가장 높은 항목 반환
    * */

    public int Solution(int[][] arr) {
        int answer = 0;
        for(int i = 0; i<arr.length; i++) {
            int compare = Arrays.stream(arr[i]).min().getAsInt();
            if(answer < compare) {
                answer = compare;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        NumberCardGame numberCardGame = new NumberCardGame();
        int[][] arr = {{3,1,2}, {4,1,4}, {2,2,2}};
        System.out.println(numberCardGame.Solution(arr));
    }

}
