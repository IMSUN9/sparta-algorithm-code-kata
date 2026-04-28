public class Problem10 {

    public static void main(String[] args) {

        Solution10 solution10 = new Solution10();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double result = solution10.solution(numbers);

        System.out.println(result);

    }
}

class Solution10 {

    public double solution(int[] numbers) {

        double answer = 0;
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return answer =  sum / numbers.length;
    }
}
