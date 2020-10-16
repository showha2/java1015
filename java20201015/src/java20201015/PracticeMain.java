package java20201015;

public class PracticeMain {

	public static void main(String[] args) {
		//Practice 인스턴스 2개 만들기
		//static{}은 1개만 호출되어야하고 {}은 2번 호출되어야 합니다
		Practice p1 = new Practice();
		Practice p2 = new Practice();
		
		//Hello java를 3번 출력
		for(int i=0; i<3; i=i+1) {
			System.out.printf("Hello java\n");
		}
		
		//Hello kotlin을 출력
		System.out.printf("Hello kotlin\n");
		
		//PracticeMain 클래스의 main 메소드에서 생성한 메소드 호출
		p1.disp();
		
		p1.print(6); //6번 출력
		p1.print(2); //2번 출력
		
		//practice 클래스에 있는 add 함수를 호출(실행)
		//public void add(int a, int b)
		//인스턴스를 생성합니다.
		Practice practice = new Practice();
		
		//정수 매개변수 2개를 요구하므로 2개를 대입해서 호출
		practice.add(20, 20);
		//위의 경우는 return 되는 데이터가 없기 때문에 이 결과를 가지고
		//다른 작업을 수행할 수 없습니다.
		
		//public int addReturn(int a, int b)
		int r = practice.addReturn(30, 40);
		System.out.printf("결과:%d\n", r);
		
		//return 받은 결과가 있으므로 이 결과를 가지고 다음 작업에
		//이용합니다
		r = practice.addReturn(r, 30);
		System.out.printf("결과:%d\n", r);
		
		//Practice 클래스의 static 메소드 호출
		Practice.init();
		
		//Math 클래스에는 0.0에서 1.0 사이의 랜덤한 숫자를 생성해주는
		//메소드가 존재
		//이 메소드의 원형은 아래와 같습니다.
		//static double random()
		//0.0에서 1.0 사이의 랜덤한 숫자를 1개 출력
		double random = Math.random();
		System.out.printf("%f\n", random);
		
		//Math 클래스에는 실수를 소수 첫째 자리에서 반올림해주는
		//아래와 같은 함수가 존재합니다.
		//이 함수를 이용해서 6.78을 소수 첫째 자리에서 반올림해서
		//출력하기
		//static long round(double a)
		long r1 = Math.round(6.78);
			System.out.printf("%d\n", r1);
		
		//첫번째 x는 100을 출력하고 두번째 this.x는 10을 출력
		practice.thisCheck(100);
		
		 
		 
		
	}


}
