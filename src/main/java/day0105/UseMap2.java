package day0105;

import java.util.HashMap;
import java.util.Map;

public class UseMap2 {

	public static void main(String[] args) {
		//병조,지원,승준을 찾아서 사용하고 싶다 -> map
		
		//1.Map 생성하여 객체 할당
		//Person은 execute method를 가지고 있기 때문에 자식의 method를 호출할 수 있다.
		Map<String,Person> map = new HashMap<String,Person>();
		map.put("min",new ByeongJo() ); 
		map.put("lee",new JiWon() ); 
		map.put("choi",new SeungJun() );
		
		//2.Key를 사용하여 객체 얻기
		String key = "min";
		
		if(map.containsKey(key)){
			Person person = (Person) map.get(key); //casting
			System.out.println(person.execute());
		}//end if
		
		
	}//main

}//class
