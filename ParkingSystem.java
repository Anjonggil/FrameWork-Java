package Javastudy;
import java.util.Scanner;

public class ParkingSystem {
	public int [] Space = new int [10];
	public ParkingSystem(){
		for(int i = 0;i<10;i++){
			this.Space[i]=0;
		}
	}

	public void getSpace(){
		for(int i = 0;i < 10;i++){
			System.out.printf("(%d)",(this.Space[i]));
		}
		System.out.println("");
	}
	public void leftSpace(){
		int count = 0;
		for(int i = 0;i < 10;i++){
			if(Space[i]==0){
				count++;
			}
		}
		System.out.printf("남은 주차공간 : %d \n",(count));
	}
	public void request(){
		Scanner scan = new Scanner(System.in);
		int req;
		int carNo;
		System.out.println("1: 주차 2: 출차 ");
		req = scan.nextInt();
		System.out.println("차량번호를 입력하시오 : ");
		carNo = scan.nextInt();
		if(req == 1){
			parking(carNo);
		}
		else if(req == 2){
			exit(carNo);
		}
	}
	public void parking(int num){
		Scanner scan = new Scanner(System.in);
		System.out.println("몇번 공간에 이동하시겠습니까 :  ");
		int parkingNo = scan.nextInt();
		if(this.Space[parkingNo-1] != 0){
			System.out.println("해당 구역에는 주차하실 수 없습니다.");
			parking(num);
		}
		else{
			this.Space[parkingNo-1]=num;
			leftSpace();
		}
		
	}
	public void exit(int num){
		
		for(int i = 0; i < 10; i++){
			if(this.Space[i]!=num){
				System.out.println("해당 차량이 없습니다.");
				return;
			}
			else{
				this.Space[i]=0;
				leftSpace();
				return;
			}
		}
		
	}
	public static void main(String[] args) {
		ParkingSystem first = new ParkingSystem();
		while(true){
			first.getSpace();
			first.request();		
			
			
			
		}
		
	}

}
