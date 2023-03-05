package programmers.level2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Solution.solution("3people      unFollowed      me "));
        System.out.println(Solution.solution("for the   last week "));
    }

    public static class Solution {

        // 최댓값과 최솟값
        // public static String solution(String s) {
        
        //     String[] numbers = s.split(" ");

        //     int[] intNumbers = Arrays.stream(numbers)  // Stream<String>으로 변환
        //             .mapToInt(Integer::parseInt)  // Stream<String>을 Stream<int>로 변환
        //             .toArray();  // int 배열로 변환

        //     int max = Arrays.stream(intNumbers).max().getAsInt();
        //     int min = Arrays.stream(intNumbers).min().getAsInt();

        //     return min + " " + max;
        // }

        // JadenCase 문자열 만들기
        public static String solution(String s) {
            
            StringBuilder sb = new StringBuilder();

            String[] arr = s.split(" ");
            System.out.println(Arrays.toString(arr));
            
                for(int i=0; i<arr.length; i++){
                    if(arr[i].equals("")){
                        sb.append(" ");
                    } else {
                    arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
                    sb.append(arr[i]);
                    if(i!=arr.length-1){
                        sb.append(" ");
                    }
                    
                 }
            }

            if(s.charAt(s.length()-1)==' '){
                sb.append(" ");
            };

            return sb.toString();
        }

    }
}

