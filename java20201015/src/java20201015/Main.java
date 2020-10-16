package java20201015;

public class Main {

	public static void main(String[] args) {
		
		// ToDo 인스턴스 생성
		ToDo todo1 = new ToDo();
		todo1.num = 1;
		todo1.date = "2020-10-16";
		todo1.content = "학원 가기";
		
		ToDo todo2 = new ToDo();
		todo2.num = 2;
		todo2.date = "2020-10-17";
		todo2.content = "신촌 9시";
		
		//static 변수에 데이터 저장하기
		ToDo.nicrname = "adam";
		
		 System.out.printf("%10s%5d%15s%20s\n", 
				 ToDo.nicrname, todo1.num, todo1.date, todo1.content);
		 System.out.printf("%10s%5d%15s%20s\n", 
				 ToDo.nicrname, todo2.num, todo2.date, todo2.content);

	}

}
