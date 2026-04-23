public class Problem07 {

    public static void main(String[] args) {

        Solution07 solution07 = new Solution07();
        System.out.println(solution07.solution(2, 3));
    }
}

class Solution07 {

    public int solution(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }
}
