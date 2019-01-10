package Javastudy;
import java.util.Scanner;
public class AreaXY {
	private int x,y;
	Scanner scan = new Scanner(System.in);
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	public void input(){
			System.out.println("x값을 입력해 주세요: ");
			int x = scan.nextInt();
			setX(x);
			System.out.println("y값을 입력해 주세요: ");
			int y = scan.nextInt();
			setY(y);
	}
	public void inputX(){
		System.out.println("x값을 입력해 주세요: ");
		int x = scan.nextInt();
		setX(x);
		setY(0);
	}
	public void inputY(){
		System.out.println("y값을 입력해 주세요: ");
		int y = scan.nextInt();
		setX(0);
		setY(y);
	}
	public static double CulArea(int num1,int num2){
		int result = 0;
		result = (num1*num2)/2;
		return result;
	}
	public static void main(String[] args) {
		AreaXY location1 = new AreaXY();
		AreaXY location2 = new AreaXY();
		AreaXY location3 = new AreaXY();
		location1.inputX();
		location2.inputY();
		location3.input();
		double Area1 = CulArea(location1.getX(),location3.getY());
		double Area2 = CulArea(location2.getY(),location3.getX());
		System.out.println(Area1+Area2);
	}

}
