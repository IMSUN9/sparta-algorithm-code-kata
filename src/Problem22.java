public class Problem22 {

    public static void main(String[] args) {

        Solution22 solution22 = new Solution22();

        System.out.println(solution22.solution(3,5));

    }
}

class Solution22
{
    public long solution(int a, int b) {

        long answer = 0;

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            answer = answer + i;
        }

        return answer;
    }
}