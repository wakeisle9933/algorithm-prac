package temp;

import java.util.Arrays;

public class TestPermutation {

    public boolean Solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr); // 배열 오름차순 정렬

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != i+1) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        TestPermutation testPermutation = new TestPermutation();
        int[] arr = {4, 1, 3};
        System.out.println("dd " + testPermutation.Solution(arr));
    }

}
