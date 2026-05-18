public class Problem23 {

    public static void main(String[] args) {

        Solution23 solution23 = new Solution23();

        System.out.println(solution23.solution(6));

    }
}

class Solution23
{
    public long solution(int num) {

        int answer = 0;

        long n = num;

       while (n != 1) {

           if (answer == 500) {

               return -1;
           }

           if (n % 2 == 0) {

               n = n / 2;
           } else {

               n = n * 3 + 1;
           }

           answer++;
       }

        return answer;
    }
}