package Java.Home.Key.March;
/*
 * 원형인 class 를 복제한 하나하나를 Instance 라고한다
 * 어떻게 class 를 복제한 Instance 를 만들 수 있는지
 * Keyword New 를 알아볼 것
 */
class Print{
	public String delimiter = "";
	
	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
		
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
		
	}
}

public class March_21_Instance {

	public static void main(String[] args) {
		Print p1 = new Print();
		p1.delimiter = "----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print();
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
		
		
		
	}

}
