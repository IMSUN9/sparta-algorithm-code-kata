import java.util.Arrays;

public class Problem17 {

    public static void main(String[] args) {

        Solution17 solution17 = new Solution17();

        long n = 12345;

        int[] result = solution17.solution(n);

        System.out.println(Arrays.toString(result));
    }
}

class Solution17 {

    public int[] solution(long n) {

        String str = String.valueOf(n);

        int[] answer = new int[str.length()];

        for (int i = 0; i < answer.length; i++) {

            answer[i] = (int)(n % 10);
            n = n / 10;
        }

        return answer;
    }
}