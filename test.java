package Javastudy;

public class test {
	public int sum(int a,int b){
		return a+b;
	}
	public String say(){
		return "Hi";
	}
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		test myTest = new test();
		int c = myTest.sum(a,b);
		String d = myTest.say();
		System.out.println(d);
		System.out.println(c);
	}

}
