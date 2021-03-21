package Java.Home.Key.March;
/*
 * static String classVar
 *  = "I class var"
 *  => static 이 있기 때문에 class 소속이라는 의미
 *  
 *  String instanceVar
 *   = "I instance var"
 *   => static이 없기 때문에 instance 소속이라는 의미
 */
class Foo {
	public static String classVar = "I class Var";
	public String instanceVar = "I instance Var";
	public static void classMethod() {
		System.out.println(classVar); // Ok
		// class 메소드 안에서는 class 변수에는 접근이 되는데
//		System.out.println(instanceVar); // Error
		// instance 변수에는 접근할 수 없다
	}
	public void instanceMethod() {
		System.out.println(classVar); // Ok
		System.out.println(instanceVar); // Ok
		//instance 메소드 안에서는 둘다 가능하다
	}
	
	
}

public class March_21_Static {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
		// => Ok
//		System.out.println(Foo.instance);
		// => Error
		// 즉 Instance는 Instance를 통해서 사용되도록
		// 고안된 변수다
		Foo.classMethod();
		// class 소속이니까 호출이 된다
//		Foo.instanceMethod();
		// instance 소속이라서 class 를 통해서 호출이 안된다
		
		Foo f1 = new Foo();
		
		

	}

}
