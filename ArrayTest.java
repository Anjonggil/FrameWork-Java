package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		// add를 통한 인덱스 추가
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("add(값)");
		System.out.println(numbers);
		// add(인덱스 번호, 데이터 ) 해당 인덱스 번호에 데이터를 삽입
		numbers.add(1,50);
		//remove로 지우기
		numbers.remove(2);
		System.out.println("\nremove(인덱스)");
		System.out.println(numbers);
		//get(인덱스 번호)를 통해 해당 인덱스를 호출 가능!
		System.out.println("\nget(인덱스)");
		System.out.println(numbers.get(1));
		//size를 통해 리스트의 크기를 알수있다.
		System.out.println("\nsize()");
		System.out.println(numbers.size());
		//indexOf(데이터)는 해당 데이터값의 위치를 반환에 준다
		System.out.println("\ninsexOf()");
		System.out.println(numbers.indexOf(30));
		
		Iterator it = numbers.iterator();
		System.out.println("\nineterator");
		while(it.hasNext()){
			int value = (int) it.next();
			if(value == 30){
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);
		
		System.out.println("\nfor each");
		for(int value : numbers){
			System.out.println(value);
		}
		
		
	}

}
