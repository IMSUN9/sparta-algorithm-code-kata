public class Problem09 {

    public static void main(String[] args) {

        Solution09 solution09 = new Solution09();
        System.out.println(solution09.solution(10));
    }
}

class Solution09 {

    public int solution(int n) {

        int answer = 0;
        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }
}
