package java20201015;

public class TemplateMain {

	public static void main(String[] args) {
		//1. Templast 클래스의 disp는 고정된 문자열을
		//출력해주는 메소드
		//원형은 static void disp()
		//이 메소드를 호출해보세요
		Template.disp();
		
		
		//2. Templast 클래스의 oneArg는 문자열을 입력받아서
		//출력해주는 메소드
		//원형은 static void oneArg(String)
		//이 메소드를 호출해서 원하는 메시지를 출력해 보세요
		Template.oneArg("실습");
		
		//3. Templast 클래스의 memberDisp는 정수를
		//입력받아서 출력하는 메소드
		//원형은 void memberDisp(int)
		//원하는 숫자를 입력해서 숫자를 출력해보세요
		Template t1 = new Template();
		t1.memberDisp(6);
		
		//4. Templast 클래스의 returnMemberFunc은
		//정수의 제곱을 구해주는 메소드
		//원형은 int returnMemberFunc(int)
		//원하는 숫자를 입력해서 제곱값을 구하고 출력해보세요
		int result =
				t1.returnmemberfunc(6);
		System.out.printf("result:%d\n", result);
		
	}

}
