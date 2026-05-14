public class Problem21 {

    public static void main(String[] args) {

        Solution21 solution21 = new Solution21();

        System.out.println(solution21.solution(18));

    }
}

class Solution21
{
    public boolean solution(int x) {

        int original = x;
        int sum = 0;

        while (x > 0) {

            sum += x % 10;
            x /= 10;
        }

        return original % sum == 0;
    }
}