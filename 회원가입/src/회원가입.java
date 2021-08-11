import java.util.Scanner;

public class 회원가입 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("=========회원가입==========");

		System.out.print("아이디>");
		String myId = input.nextLine();

		System.out.print("비밀번호(4자리숫자)>");
		int myNum = Integer.parseInt(input.nextLine());

		System.out.print("이름>");
		String myName = input.nextLine();

		System.out.println("학교>");
		String mySchool = input.nextLine();
		
		System.out.print("나이>");
		int myAge = Integer.parseInt(input.nextLine());

		System.out.println("========================\n회원가입완료!!\n=========내정보==========");
		System.out.println("아이디: "+ myId);
		System.out.println("비밀번호: "+ myNum);
		System.out.println("이름: "+ myName);
		System.out.println("나이: "+ myAge);
		System.out.println("학교: "+ mySchool);
		System.out.print("========================");
		
	}

}
