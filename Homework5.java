package Javastudy;

class product{
	private int price;
	private String Name;
	private int Quentity;
	
	
	public int Sell(){
		Quentity--;
		return Quentity;
	}
	public int input(){
		Quentity++;
		return Quentity;
	}
	
}
class Storm{
	private String Name;
	private int Latitude;
	private int longitude;
	
	public int getLatitude() {
		return Latitude;
	}

	public void setLatitude(int latitude) {
		Latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public void ChagePosition(int x,int y){
		setLongitude(x);
		setLatitude(y);
	}
}

class Lecture{
	private String Name;
	private String ProfName;
	private String StuName;
	
	public void Start(){
		System.out.println("강의가 시작되었습니다.");
	}
	public void end(){
		System.out.println("강의가 끝났습니다.");
	}
	
}

class Reservation{
	private int time;
	private int per;
	private String resName;
	private int resPhone;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per = per;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public int getResPhone() {
		return resPhone;
	}

	public void setResPhone(int resPhone) {
		this.resPhone = resPhone;
	}

	public void create(int time,int per,String resname,int resphone){
		setTime(time);
		setPer(per);
		setResName(resname);
		setResPhone(resphone);
	}
	public void research(){
		getTime();
		getPer();
		getResName();
		getResPhone();
	}
}
class Person{
	private int age;
	private int weight;
	private int pressure;
	private int temp;
	private int bloodSugar;
	private int pulse;


	public void eat(){
		weight++;
		pressure++;
		temp++;
		bloodSugar++;
		pulse++;
	}
	
	public void treninng(){
		weight--;
		pressure++;
		temp++;
		bloodSugar--;
		pulse++;
	}
}

public class Homework5 {
	
	
	public static void main(String[] args) {
		

	}

}
