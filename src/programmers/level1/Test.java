package programmers.level1;


public class Test {
    public static void main(String[] args) {
        System.out.println(Solution.solution(3,5));
    }

    public static class Solution {

        // 문자열 내 p와 y의 개수
        // public static boolean solution(String s) {
        //     boolean answer = false;
        //     int numP = 0;
        //     int numY = 0;

        //     char[] ch = s.toCharArray();

        //     for(char c : ch){
        //         if(c == 'P' || c == 'p'){
        //             numP++;
        //         } else if(c == 'Y' || c == 'y'){
        //             numY++;
        //         }

        //     }

        //     if(numP==numY){
        //         return true;
        //     }

        //     return answer;
        // }

        // 두 정수 사이의 합
        public static long solution(int a, int b) {
            int min = Math.min(a, b);
        int max = Math.max(a, b);
        long sum = (long)(min + max) * (max - min + 1) / 2;
        return sum;
        }

    }
}

