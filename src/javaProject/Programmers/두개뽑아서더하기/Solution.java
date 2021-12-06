package javaProject.Programmers.두개뽑아서더하기;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i+1 ; j <numbers.length; j++){
                int val = numbers[i]+numbers[j];
                if(!list.contains(val)){
                    list.add(val);
                }
                
            }
        }
        
        answer = new int[list.size()];
        
        for(int k = 0; k <answer.length; k++){
            answer[k] = list.get(k);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
