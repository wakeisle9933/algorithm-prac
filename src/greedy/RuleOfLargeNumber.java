package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class RuleOfLargeNumber {

    /*
    * - 큰 수의 법칙 -
    * int 타입 배열 arr을 받아
    * 배열 안의 값을 count 횟수 만큼 더해서 최대한 큰 값을 Return 하게
    * 똑같은 값을 한번에 max 횟수 이상으로 넣을 수 없음
    * */

    public int Solution(int[] arr, int count, int max) {
        int answer = 0;
        int nowCount = 1;
        Integer[] calcArray = IntStream.of(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(calcArray, Collections.reverseOrder());

        for(int i = 0; i<count; i++) {
            if(nowCount == max) {
                nowCount = 1;
                answer = answer + calcArray[1];
            } else {
                nowCount++;
                answer = answer + calcArray[0];
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        RuleOfLargeNumber ruleOfLargeNumber = new RuleOfLargeNumber();
        int[] arr = {3, 4, 3, 4, 3};
        System.out.println(ruleOfLargeNumber.Solution(arr, 7, 2));
    }

}
