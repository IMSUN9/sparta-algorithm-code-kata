public class Problem19 {

    public static void main(String[] args) {

        Solution19 solution19 = new Solution19();

        System.out.println(solution19.solution(121));

    }
}

class Solution19
{
    public long solution(long n) {

        long answer = 0;

        double sqrt = Math.sqrt(n);

        if (sqrt % 1 == 0) {
            answer =  (long) ((sqrt + 1) * (sqrt + 1));
        } else {
            answer =  -1;
        }

        return answer;
    }
}