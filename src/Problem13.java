public class Problem13 {

    public static void main(String[] args) {

        Solution13 solution13 = new Solution13();
        System.out.println(solution13.solution(123));

    }
}

class Solution13 {

    public int solution(int n) {

       int answer = 0;

       while (n > 0) {
           answer = answer + n % 10;
           n = n / 10;
       }
       return answer;
    }

}
