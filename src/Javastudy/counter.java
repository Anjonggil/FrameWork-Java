package Javastudy;

public class counter {
	static int count = 0;
	counter(){
		this.count++;
	}
	public static int getCount(){
		return count;
	}
	public static void main(String[] args) {
		counter c1 = new counter();
		counter c2 = new counter();
		
		System.out.println(counter.getCount());

	}

}
