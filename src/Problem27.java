public class Problem27 {

    public static void main(String[] args) {

        Solution27 solution27 = new Solution27();

        String phoneNumber = "01033334444";

        String result = solution27.solution(phoneNumber);

        System.out.println(result);
    }
}

class Solution27 {

    public String solution(String phone_number) {

        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }

        return answer;
    }
}