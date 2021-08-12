import java.util.Scanner;

public class 초_계산_프로그램 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("초 단위의 정수를 입력하세요: ");
	        int time = input.nextInt();       
	        int second = time%60;               // 60으로 나눈 나머지는 초
	        int minute = (time/60)%60;      // 60으로 나눈 몫(초)을 60으로 나눈 나머지
	        int hour = (time/60)/60;          // time/3600
	        System.out.print(time +"초는 ");
	        System.out.print(hour +"시간 ");
	        System.out.print(minute +"분 ");
	        System.out.print(second +"초입니다. ");    
	        input.close();
	   }
	}
