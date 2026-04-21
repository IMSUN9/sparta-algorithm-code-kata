public class Problem05 {

    public static void main(String[] args) {

        Solution05 solution05 = new Solution05();
        System.out.println(solution05.solution(3,2));
    }
}

class Solution05 {

    public int solution(int num1, int num2) {
        return (int) (((double) num1 / num2) * 1000);
    }
}
