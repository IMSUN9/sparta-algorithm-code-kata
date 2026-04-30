public class Problem12 {

    public static void main(String[] args) {

        Solution12 solution12 = new Solution12();

        int[] arr = {1, 2, 3, 4};

        double result = solution12.solution(arr);

        System.out.println(result);

    }
}

class Solution12 {

    public double solution(int[] arr) {

        double answer = 0;

        for (int i = 0; i < arr.length; i++) {


                answer = arr[i] + answer;
        }

        return answer / arr.length;
    }

}
