public class Problem06 {

    public static void main(String[] args) {

        Solution06 solution06 = new Solution06();
        System.out.println(solution06.solution(26));
    }
}

class Solution06 {

    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }
}
