import java.util.Scanner;

public class ȸ������ {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("=========ȸ������==========");

		System.out.print("���̵�>");
		String myId = input.nextLine();

		System.out.print("��й�ȣ(4�ڸ�����)>");
		int myNum = Integer.parseInt(input.nextLine());

		System.out.print("�̸�>");
		String myName = input.nextLine();

		System.out.println("�б�>");
		String mySchool = input.nextLine();
		
		System.out.print("����>");
		int myAge = Integer.parseInt(input.nextLine());

		System.out.println("========================\nȸ�����ԿϷ�!!\n=========������==========");
		System.out.println("���̵�: "+ myId);
		System.out.println("��й�ȣ: "+ myNum);
		System.out.println("�̸�: "+ myName);
		System.out.println("����: "+ myAge);
		System.out.println("�б�: "+ mySchool);
		System.out.print("========================");
		
	}

}
