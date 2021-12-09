package javaProject.Programmers.삼진법뒤집기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String ans = "";
        
        //3진법으로 변환(뒤집어서들어감)
        while(n>0){
           ans += n%3;
           n = n/3;
        }
        
        //3진법 -> 10진법
        answer = Integer.parseInt(ans,3);
        
        return answer;
    }
}