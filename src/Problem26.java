public class Problem26 {

    public static void main(String[] args) {

        Solution26 solution26 = new Solution26();

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        int result = solution26.solution(absolutes, signs);

        System.out.println(result);
    }
}

class Solution26 {

    public int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}