public class Problem08 {

    public static void main(String[] args) {

        Solution08 solution08 = new Solution08();
        System.out.println(solution08.solution(40));
    }
}

class Solution08 {

    public int solution(int angle) {
        if (0 < angle && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (90 < angle && angle < 180) {
            return 3;
        } else if (angle == 180) {
            return 4;
        }
        return 0;
    }
}
