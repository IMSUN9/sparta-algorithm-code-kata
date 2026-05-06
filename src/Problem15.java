public class Problem15 {

    public static void main(String[] args) {

        Solution15 solution15 = new Solution15();
        System.out.println(solution15.solution(123));

    }
}

class Solution15 {

    public int solution(int n) {

        int x = 0;

       for (x = 1; x < n; x++) {

           if (n % x == 1) {

               return x;
           }
       }

       return 0;
    }

}
