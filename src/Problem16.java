import java.util.Arrays;

public class Problem16 {

    public static void main(String[] args) {

        Solution16 solution16 = new Solution16();

        System.out.println(Arrays.toString(solution16.solution(2,5)));



    }
}

class Solution16 {

    public long[] solution(long x, int n) {

        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {

            answer[i] = x * (i+1);
        }

        return answer;
    }
}
