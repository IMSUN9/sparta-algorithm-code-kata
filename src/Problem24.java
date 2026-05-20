public class Problem24 {

    public static void main(String[] args) {

        Solution24 solution24 = new Solution24();

        String[] seoul = {"Jane", "Kim"};

        String result = solution24.solution(seoul);

        System.out.println(result);

    }
}

class Solution24
{
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {

            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }
}