package day0105;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		//병조,지원,승준을 찾아서 사용하고 싶다 -> map
		
		//1.Map 생성하여 객체 할당
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("min",new ByeongJo() ); 
		map.put("lee",new JiWon() ); 
		map.put("choi",new SeungJun() );
		
		//2.Key를 사용하여 객체 얻기
		String key = "min";
		
		//key 값에 따라 에러가 안 뜨게 if문으로 처리
		if("min".equals(key)){
			ByeongJo bj = (ByeongJo) map.get(key); //casting
			System.out.println(bj.execute());
		}//end if
		if("lee".equals(key)){
			JiWon jw = (JiWon) map.get(key); //casting
			System.out.println(jw.execute());
		}//end if
		if("choi".equals(key)){
			SeungJun sj = (SeungJun) map.get(key); //casting
			System.out.println(sj.execute());
		}//end if
		
		
	}//main

}//class
