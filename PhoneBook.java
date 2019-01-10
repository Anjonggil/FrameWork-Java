package Javastudy;
import java.util.Scanner;
public class PhoneBook {
	public PhoneBook(String name,int num){
		this.Name = name;
		this.PhoneNo = num;
		
	}
	
	static Scanner scan = new Scanner(System.in);
	static PhoneBook [] book = new PhoneBook[50];
	private static int No = 0;
	private String Name;
	private int PhoneNo;
	
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	public static void Create(int No,String name,int pn){
		book[No-1] = new PhoneBook(name,pn);
	}
	public static void Add(){
		System.out.println("이름을 입력하세요: ");
		String userName = scan.next();
		System.out.println("전화번호를 입력하세요: ");
		int userPN = scan.nextInt();
		No++;
		Create(No,userName,userPN);
	}
	public static void finder(String name){
		for(int i=0;i<book.length;i++){
			if((book[i].Name).equals(name)){
				System.out.println(book[i].getNo()+"이름: "+book[i].getName()+"전화번호 : "+book[i].getPhoneNo());
			}
			else{
				System.out.println("해당하는 이름이 존재하지 않습니다.");
			}
		}
	}
	public static void Research(){
		System.out.println("원하는 정보 타입을 선택하세요:  1: 이름 2: 전화번호");
		int Type = scan.nextInt();
		if(Type == 1){
			System.out.println("이름을 입력해 주세요: ");
			String userName = scan.next();
			finder(userName);
		}
	}
	public static void Update(){
		
	}
	public static void Delete(){
		
	}
	
	public static void Menu(){
		while(true){
			System.out.println("추가: 1 조회: 2  수정: 3  삭제: 4");
			int menu = scan.nextInt();
			switch(menu){
			case 1: 
				Add();
				break;
			case 2:
				Research();
				break;
			case 3:
				Update();
				break;
			case 4:
				Delete();
				break;
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		Menu();
			
		
	}

}
