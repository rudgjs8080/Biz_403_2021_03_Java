package Java.Home.Key.March;
/*
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수
 * solution을 만들어 보세요
 * 
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다
 * (1은 소수가 아닙니다)
 * 
 * 제한 조건 n은 2이상 1000000 이하의 자연수입니다
 */
public class March_30_Test {
	
	int n = 0;
	int intPrime = 0;
	int num = 0;
	int nCount = 0;
	public March_30_Test(int members) {

	n = members;	
	
	
	}
	
	public void solution() {
		intPrime = n;
		
		while(n > 1000000) {
			
			for(num = 2 ; num < n ; num++) {
				if(n % num == 0) {
					break;
				}
			}
			
		}
		
		System.out.println(nCount);
	}
	
	
	
	
	
	
	
	
	
	

}
