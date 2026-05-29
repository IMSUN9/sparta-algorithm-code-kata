public class Problem28 {

    public static void main(String[] args) {

        Solution28 solution28 = new Solution28();

        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        int result = solution28.solution(numbers);

        System.out.println(result);
    }
}

class Solution28 {

    public int solution(int[] numbers) {

        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }
}