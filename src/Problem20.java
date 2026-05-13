import java.util.Arrays;

public class Problem20 {

    public static void main(String[] args) {

        Solution20 solution20 = new Solution20();

        System.out.println(solution20.solution(18247426));

    }
}

class Solution20
{
    public long solution(long n) {

        String str = String.valueOf(n);

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        String answer = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i];
        }

        return Long.parseLong(answer);
    }
}