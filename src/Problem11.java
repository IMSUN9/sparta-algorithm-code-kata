public class Problem11 {

    public static void main(String[] args) {

        Solution11 solution11 = new Solution11();
        System.out.println(solution11.solution(5));


    }
}

class Solution11 {

    public String solution(int num) {

        String answer;

        if (num % 2 == 0 || num == 0) {

            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;

    }
}
