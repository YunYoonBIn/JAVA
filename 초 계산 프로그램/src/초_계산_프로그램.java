import java.util.Scanner;

public class ��_���_���α׷� {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("�� ������ ������ �Է��ϼ���: ");
	        int time = input.nextInt();       
	        int second = time%60;               // 60���� ���� �������� ��
	        int minute = (time/60)%60;      // 60���� ���� ��(��)�� 60���� ���� ������
	        int hour = (time/60)/60;          // time/3600
	        System.out.print(time +"�ʴ� ");
	        System.out.print(hour +"�ð� ");
	        System.out.print(minute +"�� ");
	        System.out.print(second +"���Դϴ�. ");    
	        input.close();
	   }
	}
