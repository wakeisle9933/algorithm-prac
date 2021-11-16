package greedy;

import java.util.Arrays;

public class UntilReachOne {

    /*
    * - 1이 될 때까지 -
    * N 값이 1이 될 때까지 아래 연산을 수행
    * 연산 > N을 K로 나눌 수 있을 경우 나눈다
    *      > 나눌 수 없을 경우에는 -1 수행
    * N과 K로 1이 되는 최소 횟수 구하기
    * */

    public int Solution(int n, int k) {
        int answer = 0;
        int nowValue = n;

        while(nowValue != 1) {
            if(nowValue % k == 0) {
                nowValue = nowValue / k;
            } else {
                nowValue = nowValue - 1;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        UntilReachOne untilReachOne = new UntilReachOne();
        System.out.println(untilReachOne.Solution(17, 4));

    }

}
