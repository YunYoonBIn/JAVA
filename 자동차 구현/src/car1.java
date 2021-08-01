package project;

import java.util.Scanner;

public class car1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean car_fuel_buy = false;
		boolean car_fuel = false;
		int fuel = 1;
		int money = 30000;
		String Car;
		String destination;
		String Buy;
		
	    if (fuel >= 11) {
	    	
	    	System.out.println("시동");
	    	System.out.println("목적지를 정하고 숫자나 역 이름을 입력해주세요.");
	    	System.out.println("주의! 공백을 넣지 말아주세요.");
	    	System.out.println(">> 1. 서울역");
	    	System.out.println(">> 2. 인천공항역");
	    	System.out.println(">> 3. 강남역");
	    	car_fuel = true;
	    	
	    	while (car_fuel == true) {
				String car_destination = input.nextLine();
				
				if(car_destination.equals("서울역")||car_destination.equals("1")){
					System.out.println("서울역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					
					}
					System.out.println("서울역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("서울역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("서울역 도착!");
					System.out.println("시동을 끕니다.");
					break;
			
				}else if (car_destination.equals("인천공항역")||car_destination.equals("2")) {
					System.out.println("인천공항역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("인천공항역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("인천공항역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("인천공항역 도착!");
					System.out.println("시동을 끕니다.");
					break;
				
			    }else if (car_destination.equals("강남역")||car_destination.equals("3")) {
				    System.out.println("강남역으로 가는중...");
				    
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
				    System.out.println("강남역으로 가는중...");
				    
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
			     	System.out.println("강남역으로 가는중...");
			     	
			     	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			     	
			     	System.out.println("강남역 도착!");
			     	System.out.println("시동을 끕니다.");
			     	break;
			}else {
				System.out.println("다시 입력해 주세요.");
			}
	    	}
	    	
		}else {
			System.out.println("연료 부족");
			System.out.println("현제 연료" +" "+"100/"+fuel);
			System.out.println("연료를 넣으러 가시겠습니까?");
			System.out.println(">> YES / NO");
			System.out.println("넣으실려면 Y , 넣지 않으실려면 N를 입력하세요.");
			
			while (true) {
				String car_cheek = input.next();
				
				if (car_cheek.equals("Y")||car_cheek.equals("y")) {
						System.out.println("연료를 넣겠습니다.");
						car_fuel_buy = true;
			}else if (car_cheek.equals("N")||car_cheek.equals("n")) {
						System.out.println("연료를 넣지 않겠습니다.");
						System.out.println("연료 부족! 시동을 끕니다." );
						break;			
		}else {
			System.out.println("다시 입력해 주세요.");
        } while (car_fuel_buy == true) {
			
			System.out.println("보유돈 :" + " " + money);
			System.out.println("연료를 넣을려면 15000원이 필요합니다");
			System.out.println("연료를 넣겠습니까?");
			System.out.println(">> YES / NO");
			System.out.println("넣으실려면 Y , 넣지 않으실려면 N를 입력하세요.");
			Buy = input.next();
			
		if (Buy.equals("Y")||Buy.equals("y")) {
			System.out.println("연료를 넣겠습니다.");
			money = money -15000;
			System.out.println("넣는중...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("넣는중...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			fuel = + 100;
			System.out.println("충전완료!");
			System.out.println("보유돈 :"+" "+money);
			System.out.println("현제 연료" +" "+"100/" +fuel);
			break;
			
         }else if (Buy.equals("N")||Buy.equals("n")) {
			System.out.println("연료를 넣지 않겠습니다.");
			System.out.println("보유돈 :" + " " + money);
			System.out.println("연료 부족! 시동을 끕니다." );
			break;	 
			}
        }
		if (fuel >= 11) {
			System.out.println("시동 거는중...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			
			}
			
	    	System.out.println("목적지를 정하고 숫자나 역 이름을 입력해주세요.");
	    	System.out.println("주의! 공백을 넣지 말아주세요.");
	    	System.out.println(">> 1. 서울역");
	    	System.out.println(">> 2. 인천공항역");
	    	System.out.println(">> 3. 강남역");
	    	
	    	while (fuel >= 11) {
String car_destination = input.nextLine();
				
				if(car_destination.equals("서울역")||car_destination.equals("1")){
					System.out.println("서울역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					
					}
					System.out.println("서울역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("서울역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("서울역 도착!");
					System.out.println("시동을 끕니다.");
					break;
			
				}else if (car_destination.equals("인천공항역")||car_destination.equals("2")) {
					System.out.println("인천공항역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("인천공항역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("인천공항역으로 가는중...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("인천공항역 도착!");
					System.out.println("시동을 끕니다.");
					break;
				
			    }else if (car_destination.equals("강남역")||car_destination.equals("3")) {
				    System.out.println("강남역으로 가는중...");
				    
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
				    System.out.println("강남역으로 가는중...");
				    
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
			     	System.out.println("강남역으로 가는중...");
			     	
			     	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			     	
			     	System.out.println("강남역 도착!");
			     	System.out.println("시동을 끕니다.");
			     	break;
		}
		
		
			}
		}
	}
}
}
}
	