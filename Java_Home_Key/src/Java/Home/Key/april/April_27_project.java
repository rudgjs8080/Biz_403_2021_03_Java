package Java.Home.Key.april;
/*
 * 정수 배열 numbers가 주어집니다. 
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 
 * 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 
 * 담아 return 하도록 solution 함수를 완성해주세요.
 */
public class April_27_project {

	public int[] solution(int[] numbers) {
        int[] answer = {};
        int index = 0;
        for(int i = 0 ; i < numbers.length; i++) {
        	for(int j = 1 ; j < numbers.length ; j++) {
        		int number = numbers[i] + numbers[j];
        		for(int num = 0 ; num < answer.length ; num++) {
        			if(answer[num] == number) {
        				break;
        			} else {
        				
        			}
        		}
        		
        	}
        	
        	
        }
        
        
        
        
        
        
        return answer;
    }
	
}
