package Javastudy;

public class Test2 {
	public void shouldBeRun(){
		System.out.println("ok thanks.");
	}
	
	public static void main(String[] args) {
		Test2 test = new Test2();
		int c;
		try{
			c = 4 / 0;
			test.shouldBeRun();
		}catch (ArithmeticException e){
			c = -1;
		}finally{
			test.shouldBeRun();
		}
	}

}
