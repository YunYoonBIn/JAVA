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
	    	
	    	System.out.println("�õ�");
	    	System.out.println("�������� ���ϰ� ���ڳ� �� �̸��� �Է����ּ���.");
	    	System.out.println("����! ������ ���� �����ּ���.");
	    	System.out.println(">> 1. ���￪");
	    	System.out.println(">> 2. ��õ���׿�");
	    	System.out.println(">> 3. ������");
	    	car_fuel = true;
	    	
	    	while (car_fuel == true) {
				String car_destination = input.nextLine();
				
				if(car_destination.equals("���￪")||car_destination.equals("1")){
					System.out.println("���￪���� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					
					}
					System.out.println("���￪���� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("���￪���� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("���￪ ����!");
					System.out.println("�õ��� ���ϴ�.");
					break;
			
				}else if (car_destination.equals("��õ���׿�")||car_destination.equals("2")) {
					System.out.println("��õ���׿����� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("��õ���׿����� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("��õ���׿����� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("��õ���׿� ����!");
					System.out.println("�õ��� ���ϴ�.");
					break;
				
			    }else if (car_destination.equals("������")||car_destination.equals("3")) {
				    System.out.println("���������� ������...");
				    
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
				    System.out.println("���������� ������...");
				    
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
			     	System.out.println("���������� ������...");
			     	
			     	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			     	
			     	System.out.println("������ ����!");
			     	System.out.println("�õ��� ���ϴ�.");
			     	break;
			}else {
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
	    	}
	    	
		}else {
			System.out.println("���� ����");
			System.out.println("���� ����" +" "+"100/"+fuel);
			System.out.println("���Ḧ ������ ���ðڽ��ϱ�?");
			System.out.println(">> YES / NO");
			System.out.println("�����Ƿ��� Y , ���� �����Ƿ��� N�� �Է��ϼ���.");
			
			while (true) {
				String car_cheek = input.next();
				
				if (car_cheek.equals("Y")||car_cheek.equals("y")) {
						System.out.println("���Ḧ �ְڽ��ϴ�.");
						car_fuel_buy = true;
			}else if (car_cheek.equals("N")||car_cheek.equals("n")) {
						System.out.println("���Ḧ ���� �ʰڽ��ϴ�.");
						System.out.println("���� ����! �õ��� ���ϴ�." );
						break;			
		}else {
			System.out.println("�ٽ� �Է��� �ּ���.");
        } while (car_fuel_buy == true) {
			
			System.out.println("������ :" + " " + money);
			System.out.println("���Ḧ �������� 15000���� �ʿ��մϴ�");
			System.out.println("���Ḧ �ְڽ��ϱ�?");
			System.out.println(">> YES / NO");
			System.out.println("�����Ƿ��� Y , ���� �����Ƿ��� N�� �Է��ϼ���.");
			Buy = input.next();
			
		if (Buy.equals("Y")||Buy.equals("y")) {
			System.out.println("���Ḧ �ְڽ��ϴ�.");
			money = money -15000;
			System.out.println("�ִ���...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("�ִ���...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			fuel = + 100;
			System.out.println("�����Ϸ�!");
			System.out.println("������ :"+" "+money);
			System.out.println("���� ����" +" "+"100/" +fuel);
			break;
			
         }else if (Buy.equals("N")||Buy.equals("n")) {
			System.out.println("���Ḧ ���� �ʰڽ��ϴ�.");
			System.out.println("������ :" + " " + money);
			System.out.println("���� ����! �õ��� ���ϴ�." );
			break;	 
			}
        }
		if (fuel >= 11) {
			System.out.println("�õ� �Ŵ���...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			
			}
			
	    	System.out.println("�������� ���ϰ� ���ڳ� �� �̸��� �Է����ּ���.");
	    	System.out.println("����! ������ ���� �����ּ���.");
	    	System.out.println(">> 1. ���￪");
	    	System.out.println(">> 2. ��õ���׿�");
	    	System.out.println(">> 3. ������");
	    	
	    	while (fuel >= 11) {
String car_destination = input.nextLine();
				
				if(car_destination.equals("���￪")||car_destination.equals("1")){
					System.out.println("���￪���� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					
					}
					System.out.println("���￪���� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("���￪���� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println("���￪ ����!");
					System.out.println("�õ��� ���ϴ�.");
					break;
			
				}else if (car_destination.equals("��õ���׿�")||car_destination.equals("2")) {
					System.out.println("��õ���׿����� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("��õ���׿����� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("��õ���׿����� ������...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("��õ���׿� ����!");
					System.out.println("�õ��� ���ϴ�.");
					break;
				
			    }else if (car_destination.equals("������")||car_destination.equals("3")) {
				    System.out.println("���������� ������...");
				    
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
				    System.out.println("���������� ������...");
				    
				    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    
			     	System.out.println("���������� ������...");
			     	
			     	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			     	
			     	System.out.println("������ ����!");
			     	System.out.println("�õ��� ���ϴ�.");
			     	break;
		}
		
		
			}
		}
	}
}
}
}
	